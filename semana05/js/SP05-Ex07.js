const estados = Object.freeze({
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

})

class Endereco {
    constructor(logradouro, numero, cidade, estado, pais, cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        //this._estado = this.validarEstado(estado);
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }

    // validarEstado(estado) {
    //     let arrayEstados = Object.entries(estados);
    //     if (arrayEstados.some(elemento => elemento[0] === estado) || arrayEstados.some(elemento => elemento[1] === estado)) {
    //         return estado;
    //     }
    //     return 'Estado inválido';
    // }

    /**
     * @param {string} newEstado
     */
    set estado(newEstado) {
        let arrayEstados = Object.entries(estados);
        if (arrayEstados.some(elemento => elemento[0] === newEstado) || arrayEstados.some(elemento => elemento[1] === newEstado)) {
            //this.estado = newEstado;
            Object.defineProperty(this, 'estado', {
                value: newEstado,
                writable: true
            })
        } else {
            Object.defineProperty(this, 'estado', {
                value: 'Estado inválido',
                writable: true
            })
        }
    }
}

class Cliente {
    constructor(nome, cpf, telefone, endereco) {
        this.nome = nome;
        this.cpf = this.validarCpf(cpf);
        this.telefone = telefone;
        this.endereco = endereco;
    }

    validarCpf(cpf) {
        let soma = 0;
        let resto;

        if (cpf == "00000000000") return false;

        for (let i = 1; i <= 9; i++) {
            soma += parseInt(cpf.substring(i - 1, i)) * (11 - i);
            resto = (soma * 10) % 11;
        }

        if ((resto == 10) || (resto == 11)) resto = 0;

        if (resto != parseInt(cpf.substring(9, 10))) return false;

        soma = 0;

        for (let i = 1; i <= 10; i++) {
            soma += parseInt(cpf.substring(i - 1, i)) * (12 - i);
            resto = (soma * 10) % 11;
        }

        if ((resto == 10) || (resto == 11)) resto = 0;

        if (resto != parseInt(cpf.substring(10, 11))) return false;

        console.log('CPF válido');
        return cpf;
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
const cliente = new Cliente('Lucas', '04686944988', '4998000000', endCliente);
const contaCliente = new Conta('0001', '500000000', cliente);


console.log(endCliente);
console.log(cliente);
console.log(cliente.endereco);
console.log(contaCliente);
console.log(contaCliente.cliente);
console.log(endCliente);
endCliente.estado = 'teste';
console.log(endCliente);
