package semana04.exercicio02;

public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.printf("Feliz Aniversário %s.\n", this.getDestinatario());
    }
}
