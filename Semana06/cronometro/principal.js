import Temporizador from './cronometro.js';

let temporizador = new Temporizador();
  
var btnStart = document.querySelector('#button-start');
var btnStop = document.querySelector('#button-stop');
var btnReset = document.querySelector('#button-reset');
  
btnStart.addEventListener("click", function () {
    temporizador.iniciar();
});
  
btnStop.addEventListener("click", function () {
    temporizador.parar();
});
  
btnReset.addEventListener("click", function () {
    temporizador.reset();
});
