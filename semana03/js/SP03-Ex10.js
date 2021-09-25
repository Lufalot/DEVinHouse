const calcularPa = () => {
    let valorInicial = document.getElementById('valorInicial').value;
    let raiz = document.getElementById('raiz').value;
    if (valorInicial.length > 0 && raiz.length > 0) {
        valorInicial = parseInt(valorInicial);
        raiz = parseInt(raiz);
        let pa = [valorInicial];
        for (let i=0; i<9; i++) {
            pa.push(pa[i]+raiz);
        }
        document.getElementById('paResult').value = pa;
    } else { alert('Preencha os valores') };
};

const calcularPg = () => {
    let valorInicial = document.getElementById('valorInicial').value;
    let raiz = document.getElementById('raiz').value;
    if (valorInicial.length > 0 && raiz.length > 0) {
        valorInicial = parseInt(valorInicial);
        raiz = parseInt(raiz);
        let pg = [valorInicial];
        for (let i=0; i<9; i++) {
            pg.push(pg[i]*raiz);
        }
        document.getElementById('pgResult').value = pg;
    } else { alert('Preencha os valores') };
};

document.getElementById('pa').addEventListener('click',calcularPa);
document.getElementById('pg').addEventListener('click',calcularPg);
