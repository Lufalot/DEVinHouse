class Endereco {
    constructor(logradouro, numero, cidade, estado, pais, cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }
}

const endCliente = new Endereco('Rua Principal', 202, 'Urubici', 'SC', 'Brasil', '88650-000');
console.log(Object.values(endCliente));
