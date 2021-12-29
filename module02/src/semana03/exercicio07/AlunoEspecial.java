package semana03.exercicio07;

public class AlunoEspecial extends AlunoRegular {

    public AlunoEspecial(String matricula, int creditos) {
        super(matricula, creditos);
        if(creditos > 10) this.setCreditos(10);
    }

    @Override
    public String toString() {
        return String.format("-Aluno (AE%s) - Créditos: %d",this.getMatricula(),this.getCreditos());
    }
}
