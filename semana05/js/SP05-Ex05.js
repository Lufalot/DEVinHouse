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

class Cliente {
    constructor(nome, cpf, telefone, endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}

class Conta {
    constructor(numeroConta, saldo, cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }
}

const endCliente = new Endereco('Rua Principal', 202, 'Urubici', 'SC', 'Brasil', '88650-000');
const cliente = new Cliente('Lucas', '123456789-11', '4998000000', endCliente);
const contaCliente = new Conta('0001', '500000000', cliente);


console.log(endCliente);
console.log(cliente);
console.log(cliente.endereco);
console.log(contaCliente);
console.log(contaCliente.cliente);
