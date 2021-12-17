package semana03.exercicio05;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Pessoa> pessoaArray = new ArrayList<>();

    public void armazenaPessoa(String nome, int idade, float altura) {
        if (pessoaArray.size() < 10) {
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            pessoaArray.add(pessoa);
        }
    }

    public int buscaPessoa(String nome) {
        int index = -1;
        for (Pessoa pessoa : pessoaArray) {
            if (pessoa.getNome().equals(nome)) {
                index = pessoaArray.indexOf(pessoa);
            }
        }
        return index;
    }

    public void removePessoa(String nome) {
        int index = this.buscaPessoa(nome);
        pessoaArray.remove(index);
    }

    public void imprimeAgenda() {
        pessoaArray.forEach(System.out::println);
    }

    public void buscaPessoa(int index) {
        Pessoa pessoa = pessoaArray.get(index);
        System.out.println(pessoa);

    }


}
