const ano = parseInt(new Date().getFullYear());
const mes = (parseInt(new Date().getUTCMonth()) + 1);
const dia = parseInt(new Date().getDate());

function calcularIdade(birthdate) {
    anoNasc = parseInt(birthdate.substr(0,4));
    mesNasc = parseInt(birthdate.substr(5,2));
    diaNasc = parseInt(birthdate.substr(8,2));

    let idade = parseInt(ano) - anoNasc;

    let paragrafo = document.getElementById('idade');

    if (mesNasc < mes) {
        paragrafo.innerHTML = `Você possui ${idade} anos.`;
    } else if (mesNasc > mes) {
        paragrafo.innerHTML = 'Você possui ' + (idade - 1) + ' anos';
    } else {
        if (diaNasc < dia) {
            paragrafo.innerHTML = `Você possui ${idade} anos.`;
        } else if (diaNasc > dia) {
            paragrafo.innerHTML = 'Você possui ' + (idade - 1) + ' anos';
        } else {
            paragrafo.innerHTML = `Parabéns! Hoje você faz ${idade} anos.`
        }

    }
}