let mongoose = require('mongoose');
let Schema = mongoose.Schema;

let songSchema = new Schema({
    nome: {type: String, required: true},
    artista: {type: String, required: true},
    album: {type: String, required: false}
})

songSchema.index({nome: 1, artista: 1}, {unique: true})

module.exports = mongoose.model('song', songSchema)