package semana03.exercicio01;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazAniversario() {
        idade += 1;
    }
}
