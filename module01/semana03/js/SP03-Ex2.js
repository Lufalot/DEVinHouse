let elResult = document.getElementById('resultado');


function somar(firstNumber, secondNumber) {
    elResult.value = parseInt(firstNumber) + parseInt(secondNumber);
}

function subtrair(firstNumber, secondNumber) {
    elResult.value = parseInt(firstNumber) - parseInt(secondNumber);
}

function multiplicar(firstNumber, secondNumber) {
    elResult.value = parseInt(firstNumber) * parseInt(secondNumber);
}

function dividir(firstNumber, secondNumber) {
    elResult.value = parseInt(firstNumber) / parseInt(secondNumber);
}