let connection = require('../config/database');
let Usuario = require('../models/User');

module.exports = {
    signup: (req, res, next) => {
        const nome = req.body.nome;
        const usuario = req.body.usuario;
        const senha = req.body.senha;
        const email = req.body.email;
        const group = req.body.group;

        const user = new Usuario({nome, usuario, senha, email, group});

        user.save()
        .then(user => {
            res.status(201).json(user)
        })
        .catch(error =>{
            res.status(500).json(error);
        })
    },
    login: (req, res, next) => {
        const {usuario, senha} = req.body;
        Usuario.findOne({'usuario': usuario})
        .then(user => {
            if(!user) {
                res.status(401).json({
                    success:false,
                    token: null,
                    msg: "Usuário não encontrado"
                })
            } else {
                user.comparePassword(senha, (erro, isMatch) => {
                    if(isMatch && !erro) {
                        user.generateAuthToken()
                        .then(sucesso => {
                            res.status(200).json(sucesso)
                        })
                        .catch(erro => {
                            res.status(401).json(erro);
                        })
                    } else {
                        res.status(401).json({
                            success: false,
                            token: null,
                            msg: "Senha incorreta!"
                        })
                    }
                })
            }
        })
        .catch(erro => {
            return res.status(500).json({
                msg: "Erro ao buscar o usuário.",
                error: erro
            })
        })
    },
    logout: (req, res, next) => {
        const userID = req.user._id;

        Usuario.updateOne({_id: userID},{
            $set: {
                token:null
            }
        })
        .then(user => {
            res.status(200).json({
                success: true,
                token: null,
                msg: "Logout realizado com sucesso"
            })
        })
        .catch(erro => {
            res.status(500).json({
                success: false,
                msg: 'Não foi possível fazer o Logout',
                error: erro
            })
        })
    }
}