const data = new Date().getTime();
const ano = new Date().getFullYear();
const texto = document.getElementById('texto');

const estacao = () => {
        verao = { inicio: new Date(ano+'-1-1').getTime(), fim: new Date(ano+'-3-21').getTime() };
        outono = { inicio: new Date(ano+'-3-22').getTime(), fim: new Date(ano+'-6-21').getTime() };
        inverno = { inicio: new Date(ano+'-6-22').getTime(), fim: new Date(ano+'-9-21').getTime() };
        primavera = { inicio: new Date(ano+'-9-22').getTime(), fim: new Date(ano+'-12-21').getTime() };
    
        if (data >= verao.inicio && data <= verao.fim) {
            document.body.style.backgroundImage = "url('img/verao.jpg')";
            texto.textContent = "Estamos no verão";
            return 'verao';
        }
        if (data >= outono.inicio && data <= outono.fim) {
            document.body.style.backgroundImage = "url('img/outono.jpg')";
            texto.textContent = "Estamos no outono";
            return 'outono';
        }
        if (data >= inverno.inicio && data <= inverno.fim) {
            document.body.style.backgroundImage = "url('img/inverno.jpg')";
            texto.textContent = "Estamos no inverno";
            return 'inverno';
        }
        if (data >= primavera.inicio && data <= primavera.fim) {
            document.body.style.backgroundImage = "url('img/primavera.jpg')";
            texto.textContent = "Estamos na primavera";
            return 'primavera';
        }
}

function carregarEstacao(estacaoAtual) {
    switch (estacaoAtual) {
        case ('verao'):
            document.body.style.backgroundImage = "url('img/verao.jpg')";
            texto.textContent = "Estamos no verão";
            break;
        case('outono'):
            document.body.style.backgroundImage = "url('img/outono.jpg')";
            texto.textContent = "Estamos no outono";
            break;
        case('inverno'):
            document.body.style.backgroundImage = "url('img/inverno.jpg')";
            texto.textContent = "Estamos no inverno";
            break;
        case('primavera'):
            document.body.style.backgroundImage = "url('img/primavera.jpg')";
            texto.textContent = "Estamos na primavera";
            break;
    }
}

carregarEstacao(estacao());