let mongoose = require('mongoose');
let Schema = mongoose.Schema;

let playlistSchema = new Schema({
    nome: {type: String, required: true},
    usuario: {type: String, required: true},
    musicas: {type: Object, required: false}
})

playlistSchema.index({nome: 1, usuario: 1}, {unique: true})

module.exports = mongoose.model('playlist', playlistSchema)