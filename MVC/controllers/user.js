let connection = require('../config/database');
let User = require('../models/User')

module.exports = {
    getAllUsers: (req, res, next) => {
        //Implementar buscar todos os usuarios
        User.find({}, {__v: 0})
        .then((users) => {
            res.status(200).json({usuarios: users})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível buscar todos os usuários", erro: error})
        })
    },
    getUserById: (req, res, next) => {
        //Implementar buscar por Id
        let id = req.params.id;
        User.findOne({_id: id}, {__v:0})
        .then((user) => {
            res.status(200).json({usario: user})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível encontrar usuário com o id inserido", erro: error})
        })
    },
    addUser: (req, res, next) => {
        //Implementa a inserção do user
        let user = new User({
            nome: req.body.nome,
            email: req.body.email,
            usuario: req.body.usuario
        })

        user.save()
        .then((user) => {
            res.status(200).json({msg: "Usuário cadastrado com sucesso", usuario: user})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível cadastrar usuário", erro: error})
        })
    },
    editUser: (req, res, next) => {
        User.updateOne({
            _id: req.params.id
        }, {
            nome: req.body.nome,
            email: req.body.email,
            usuario: req.body.usuario
        })
        .then((user) => {
            res.status(200).json({msg: "Usuário alterado com sucesso"})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível alterar usuário", erro: error})
        })
    },
    deleteUser: (req, res, next) => {
        User.deleteOne({
            _id: req.params.id
        })
        .then(() => {
            res.status(200).json({msg: "Usuário apagado com sucesso"})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível apagar usuário", erro: error})
        })
    }

}