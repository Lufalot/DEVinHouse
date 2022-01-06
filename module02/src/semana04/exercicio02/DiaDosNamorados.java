package semana04.exercicio02;

public class DiaDosNamorados extends CartaoWeb {
    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }
    @Override
    public void showMessage() {
        System.out.printf("Feliz dia dos namorados %s.\n",this.getDestinatario());
    }
}
