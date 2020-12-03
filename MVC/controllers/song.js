let connection = require('../config/database');
let Song = require('../models/Song')

module.exports = {
    getAllSongs: (req, res, next) => {
        //Implementar buscar todos as musicas
        Song.find({}, {__v: 0})
        .then((songs) => {
            res.status(200).json({musicas: songs})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível listar todas as músicas", erro: error})
        })
    },
    getSongById: (req, res, next) => {
        //Implementar buscar por Id
        let id = req.params.id;
        Song.findOne({_id: id}, {__v:0})
        .then((song) => {
            res.status(200).json({musica: song})
             
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível encontrar música devido a um erro interno", erro: error})
        })
    },
    addSong: (req, res, next) => {
        //Implementa a inserção da música
        //let _album =  (album) => {album === undefined ? "" : album }

        let song = new Song({
            nome: req.body.nome,
            artista: req.body.artista,
            album: req.body.album
        })

        song.save()
        .then((song) => {
            res.status(200).json({msg: "Música cadastrada com sucesso", música: song})
        })
        .catch((error) => {
            if(error.code === 11000) {
                res.status(400).json({msg: "Música já existente"})
            } else {
                res.status(500).json({msg: "Erro interno"})
            }
            
        })
    },
    editSong: (req, res, next) => {
        Song.updateOne({
            _id: req.params.id
        }, {
            nome: req.body.nome,
            artista: req.body.artista,
            album: req.body.album
        })
        .then((song) => {
            res.status(200).json({msg: "Música alterada com sucesso"})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível alterar música devido a um erro interno", erro: error})
        })
    },
    deleteSong: (req, res, next) => {
        Song.deleteOne({
            _id: req.params.id
        })
        .then(() => {
            res.status(200).json({msg: "Música apagada com sucesso"})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível apagar música devido a um erro interno", erro: error})
        })
    }

}