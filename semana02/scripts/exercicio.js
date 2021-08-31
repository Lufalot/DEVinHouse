// 8 Peça o nome do usuário e exiba na tela
// 9 Pergunte ao usuário e exiba no console
// 10 Pergunte nome e sobrenome e exiba na tela
let sobreNome = prompt('Qual seu sobrenome?');
let nome = prompt('Qual seu nome?');
let idade = parseInt((prompt('Qual sua idade?')));
let esporte = confirm('Gosta de praticar algum esporte?');
alert(`Seu nome completo é ${nome} ${sobreNome}`);
console.log(nome,idade,esporte);

// 11 Pergunte o ano atual e o ano de nascimento, exiba na tela a idade
let anoNascimento = parseInt(prompt('#11 - Qual seu ano de nascimento?'));
let anoAtual = parseInt(prompt('#11 - Em que ano estamos?'));
let idadeX = anoAtual - anoNascimento;
let idadeY = anoAtual - anoNascimento - 1;
alert(`#11 - Sua idade é ${idadeX} ou ${idadeY}`);

// 12 Construa uma calculadora
let operador = prompt('#12 - Qual o tipo de cálculo você deseja fazer? (+, -, * ou /)');
let primeiroNumero = prompt('#12 - Insita o primeiro número:');
let segundoNumero = prompt('#12 - Insita o segundo número:');
let resultado;
switch(operador){
        case '+':
           resultado = primeiroNumero + segundoNumero;
           break;
        case '-':
            resultado = primeiroNumero - segundoNumero;
            break;
        case '*':
            resultado = primeiroNumero * segundoNumero;
            break;
        case '/':
            resultado = primeiroNumero / segundoNumero;
            break;
    };
alert(`#12 - O resultado do seu cálculo é: ${resultado}`);

// 13 Alerte as horas para o usuário
let hora = new Date().getHours();
let minuto = new Date().getMinutes();
alert(`#13 - Hora atual: ${hora}:${minuto}`);

// 14 Construa uma “calculadora” de P.A
let valorInicial = parseInt(prompt('#14 - Insira o valor inicial da P.A.'));
let valorRaiz = parseInt(prompt('#14 - Insira o valor da raiz da P.A.'));
let pa = [];
pa.push(valorInicial);
for (let i = 1; i < 10; i++) {
    pa.push(valorInicial + valorRaiz);
    valorInicial += valorRaiz;
    };
alert('#14 - ' + pa);

// 15 Pergunte o último sobrenome e exiba em letras maiúsculas
let lastName = prompt('$15 - Insira seu último sobrenome.');
alert(`Olá, ${lastName.toUpperCase()}. Seu sobrenome contém ${lastName.length} letras.`);