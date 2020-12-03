let connection = require('../config/database');
let Playlist = require('../models/Playlist');
let Usuario = require('../models/User');
let Musica = require('../models/Song');
var ObjectId = require('mongoose').Types.ObjectId;

module.exports = {
    getAllPlaylists: (req, res, next) => {
        Playlist.find()
        .then((playlists) => {
            res.status(200).json({playlists: playlists})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível listar todas as playlists", erro: error})
        });
    },
    getPlaylistsById: (req, res, next) => {
        Playlist.find({_id: req.params.id})
        .then((playlists) => {
            res.status(200).json({playlists: playlists})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível listar a playlist", erro: error})
        });
    },
    getPlaylistsByUser: (req, res, next) => {
        Playlist.find({usuario: req.params.user})
        .then((playlists) => {
            res.status(200).json({playlists: playlists})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível listar todas as playlists", erro: error})
        });
    },
    addPlaylist: (req, res, next) => {
        let playL = new Playlist({
            nome: req.body.nome,
            usuario: req.body.usuario
        })

        Usuario.findOne({usuario: req.body.usuario})
        .then((result) => {
            if(result === null){
                res.status(400).json({msg: "Usuário não existe"})
                return 1;
            } 
            playL.save()
            .then((playlist) => {
                res.status(200).json({msg: "Playlist criada com sucesso", playlist: playlist})
            })
            .catch((error) => {
                res.status(500).json({msg: "Erro ao validar usuário", erro: error})
            });
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível criar todas as playlists", erro: error})
        });     
    },

    // Metodo abaixo requer um objeto json contendo: 
    // - id da playlist(playl_id)a ser inserido
    // - id da musica(song_id) que irá inserir
    addSongToPlaylist: (req, res, next) => {
        Playlist.findOne({_id: req.body.playl_id})
        .then((pl_result) => {
            if(pl_result === null) {
                res.status(400).json({msg: "Playlist não encontrada"})
            }
            else {
                Musica.findById(req.body.song_id)
                .then((sg_result)=> {
                    if(sg_result === null) {
                        res.status(400).json({msg: "Música não encontrada"})
                        return 1;
                    }
                    Playlist.updateOne({_id: pl_result._id}, {
                        $push: {
                            musicas: {
                                id: sg_result._id,
                                nome: sg_result.nome,
                                artista: sg_result.artista
                             }
                        }
                    })
                    .then((result)=>{
                        res.status(200).json({msg: "Música adicionada na playlist"})
                    })
                })
                .catch((error) => {
                    res.status(500).json({msg: "Não foi possível validar música", erro: error})
                }); 
            }
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível validar playlist", erro: error})
        }); 
    },
    // Metodo abaixo requer um objeto json contendo: 
    // - id da playlist(playl_id)a ser atualizada
    // - id da musica(song_id) que será removida
    removeSongFromPlaylist: (req, res, next) => {
        Playlist.updateOne({_id: req.body.playl_id}, {
            $pull: {
                musicas: { 
                    id: new ObjectId(req.body.song_id)
                }
            }
        })
        .then(() => {
            res.status(200).json({msg: "Música apagada da playlist"})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível remover música da playlist devido a um erro interno", erro: error})
        })
    },
    editPlaylist: (req, res, next) => {
        Playlist.updateOne({
            _id: req.params.id
        }, {
            nome: req.body.nome,
            usuario: req.body.usuario,
            musicas: req.body.musicas
        })
        .then(() => {
            res.status(200).json({msg: "Playlist alterada com sucesso"})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível alterar música devido a um erro interno", erro: error})
        })
    },
    deletePlaylist: (req, res, next) => {
        Playlist.deleteOne({
            _id: req.params.id
        })
        .then(() => {
            res.status(200).json({msg: "Playlist apagada com sucesso"})
        })
        .catch((error) => {
            res.status(500).json({msg: "Não foi possível apagar playlist devido a um erro interno", erro: error})
        })
    }
}