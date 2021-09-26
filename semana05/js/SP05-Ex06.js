const estados = {
    AC: 'Acre',
    AL: 'Alagoas',
    AP: 'Amapá',
    AM: 'Amazonas',
    BA: 'Bahia',
    CE: 'Ceará',
    DF: 'Distrito Feredal',
    ES: 'Espírito Santo',
    GO: 'Goiás',
    MA: 'Maranhão',
    MT: 'Mato Grosso',
    MS: 'Mato Grosso do Sul',
    MG: 'Minas Gerais',
    PA: 'Pará',
    PB: 'Paraíba',
    PR: 'Paraná',
    PE: 'Pernambuco',
    PI: 'Piauí',
    RJ: 'Rio de Janeiro',
    RN: 'Rio Grande do Norte',
    RS: 'Rio Grande do Sul',
    RO: 'Rondônia',
    RR: 'Roraima',
    SC: 'Santa Catarina',
    SP: 'São Paulo',
    SE: 'Sergipe',
    TO: 'Tocantins'

}

validarEstado = estado => {
    let arrayEstados = Object.entries(estados);
     if (arrayEstados.some(elemento => elemento[0] === estado) || arrayEstados.some(elemento => elemento[1] === estado)) {
         return estado;
    }
    return 'Estado inválido';
}

class Endereco {
    constructor(logradouro, numero, cidade, estado, pais, cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this._estado = validarEstado(estado);
        this.pais = pais;
        this.cep = cep;
    }

    validarEstado(estado) {
        let arrayEstados = Object.entries(estados);
        if (arrayEstados.some(elemento => elemento[0] === estado) || arrayEstados.some(elemento => elemento[1] === estado)) {
            return estado;
       }
       return 'Estado inválido';
    }

    set estado(newEstado) {
        let arrayEstados = Object.entries(estados);
        if (arrayEstados.some(elemento => elemento[0] === newEstado) || arrayEstados.some(elemento => elemento[1] === newEstado)) {
            this._estado = newEstado;
        }
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

const endCliente = new Endereco('Rua Principal', 202, 'Urubici', 'Santa Catrina', 'Brasil', '88650-000');
const cliente = new Cliente('Lucas', '123456789-11', '4998000000', endCliente);
const contaCliente = new Conta('0001', '500000000', cliente);


console.log(endCliente);
console.log(cliente);
console.log(cliente.endereco);
console.log(contaCliente);
console.log(contaCliente.cliente);
endCliente.estado = 'SP';
console.log(endCliente);
