const jwt = require('jsonwebtoken')
const Usuario = require('../models/User')

module.exports = {
    userVerify: (req, res, next) => {
        if (req.headers['authorization']) {
            let token = req.headers['authorization'].replace('Bearer ', '');

           jwt.verify(token, 'Token', function(erro, decoded){
               if(erro){
                   return res.status(401).json({
                       msg: "Não foi possível verificar o token",
                       error: erro
                   })
               }
               let usuarioId = decoded._id
               Usuario.findOne({
                   _id: usuarioId,
                   token: token
               }, {nome: 1, email: 1, group: 1, _id: 1})
               .then((user) => {                
                    if(!user){
                        return res.status(401).json({
                            msg: "Token inválido"
                        })
                    }
                    req.user = user;
                    next()
               })
               .catch(erro => {
                   res.status(500).json({
                       error: erro
                   })
               })
           })
        } else {
            return res.status(401).json({
                msg: "Por favor, insira o token para acessar essa rota"
            })
        }
    },
    groupVerify: (role) => {
        return function(req, res, next){
            if(role && role.includes(req.user.group)) {
                next();
            } else {
                return res.status(403).json({
                    msg: "Acesso negado: Sem permissão."
                })
            }
        } 
    }
}