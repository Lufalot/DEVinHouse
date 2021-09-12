let elPara = document.getElementById('paragrafo');

function verificar(numero) {
    if (numero % 2 === 0) {
        elPara.innerHTML = 'Par';
    } else {
        elPara.innerHTML = 'Ímpar';
    }
}