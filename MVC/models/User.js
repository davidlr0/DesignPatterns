const mongoose = require('mongoose');
const bcrypt = require('bcrypt');
const jwt = require('jsonwebtoken');
let Schema = mongoose.Schema;

let userSchema = new Schema({
    nome: {type: String, required: true},
    usuario: {type: String, required: true, unique: true},
    senha: {type: String, required: true, minlength: 8},
    email: {type: String, required: true},
    token: {type: String},
    group: {type: String, required: true, enum: ['user', 'admin'], default: 'user'}
})

userSchema.pre('save', function (next) {
    const usuario = this;

    if(usuario.isModified('senha') || usuario.isNew) {
        bcrypt.hash(usuario.senha, 8)
        .then((hash) => {
            usuario.senha = hash;
            usuario.token = null;
            next();
        })
        .catch((erro) => {
            next(erro);
        })
    } else {
        return next();
    }
})

userSchema.methods.comparePassword = function (password, cb) {
    bcrypt.compare(password, this.senha, function(erro, isMatch) {
        if(erro) {
            return cb(erro);
        }
        cb(null, isMatch);
    })
}

userSchema.methods.generateAuthToken = function () {
    return new Promise((success, reject) => {
        const usuario = this;
        const token = jwt.sign({_id: usuario._id}, 'Au1aE4d101', {expiresIn: '2d'})
        usuario.token = token;

        usuario.save()
        .then((user) => {
            success({
                success: true,
                token: token
            });
        })
        .catch(erro => {
            reject({
                success: false,
                token: null,
                erro: erro
            })
        })
    })
}
module.exports = mongoose.model('user', userSchema);