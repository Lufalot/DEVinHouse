function dadosProduto(codigo) {
    let modelo = codigo.substr(0,3);
    let lote = codigo.substr(3,2);
    let cor = codigo.substr(5,3);
    if (cor === '001') {
        cor = 'Vermelho';
    } else if (cor === '002') {
        cor = 'Preto';
    } else if (cor == '003') {
        cor = 'Amarelo';
    } else { cor = 'Indefinida.'; }
    let voltagem = codigo.substr(8,1);
    if (voltagem === '1') {
        voltagem = '110v';
    } else { voltagem = '220v'; }
    let dados = [modelo, lote, cor, voltagem];
    return dados;
}

function mostrarDados() {
    let codigo = document.getElementById('codigo').value;
    let produto = dadosProduto(codigo);
    alert(`Produto: ${codigo}\nModelo: ${produto[0]}\nLote: ${produto[1]}\nCor: ${produto[2]}\nVoltagem: ${produto[3]}`);
    }