let express = require('express');
let router = express.Router();
let controllerUser = require('../controllers/user.js');
let controllerSong = require('../controllers/song.js');
let controllerPlaylist = require('../controllers/playlist.js');
let controllerLogin = require('../controllers/login');

const auth = require('../lib/auth')

//Rotas de controle de login
router.post('/signup', controllerLogin.signup);
router.post('/login', controllerLogin.login);
router.post('/logout', auth.userVerify, controllerLogin.logout);

//Rotas de usuario
router.get('/users/', auth.userVerify, auth.groupVerify(['admin']), controllerUser.getAllUsers);
router.get('/users/:id',auth.userVerify, auth.groupVerify(['admin']), controllerUser.getUserById);
router.post('/users/', auth.userVerify, auth.groupVerify(['admin']), controllerUser.addUser);
router.put('/users/:id', auth.userVerify, auth.groupVerify(['admin']), controllerUser.editUser);
router.delete('/users/:id', auth.userVerify, auth.groupVerify(['admin']), controllerUser.deleteUser);

//Rota das musicas
router.get('/songs/', auth.userVerify, controllerSong.getAllSongs);
router.get('/songs/:id', auth.userVerify, controllerSong.getSongById);
router.post('/songs/', auth.userVerify, auth.groupVerify(['admin']), controllerSong.addSong);
router.put('/songs/:id', auth.userVerify, auth.groupVerify(['admin']), controllerSong.editSong);
router.delete('/songs/:id', auth.userVerify, auth.groupVerify(['admin']), controllerSong.deleteSong);

//Rota das playlists
router.get('/playlists/', auth.userVerify, controllerPlaylist.getAllPlaylists);
router.get('/playlists/id/:id', auth.userVerify, controllerPlaylist.getPlaylistsById);
router.get('/playlists/user/:user', auth.userVerify, controllerPlaylist.getPlaylistsByUser);
router.post('/playlists/', auth.userVerify, controllerPlaylist.addPlaylist);
router.post('/playlists/song/', auth.userVerify, controllerPlaylist.addSongToPlaylist);
router.put('/playlists/:id', auth.userVerify, controllerPlaylist.editPlaylist);
router.delete('/playlists/song/', auth.userVerify, controllerPlaylist.removeSongFromPlaylist);
router.delete('/playlists/:id', auth.userVerify, controllerPlaylist.deletePlaylist);

module.exports = router;
