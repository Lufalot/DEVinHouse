package semana04.exercicio02;

public class Natal extends CartaoWeb {

    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.printf("Feliz Natal %s.\n", this.getDestinatario());
    }
}

