package semana03.exercicio07;

public class AlunoRegular {
    private String matricula;
    private int creditos;

    public AlunoRegular(String matricula, int creditos) {
        this.matricula = matricula;
        this.creditos = creditos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return String.format("-Aluno (AR%s) - Créditos: %d",this.getMatricula(),this.getCreditos());
    }
}
