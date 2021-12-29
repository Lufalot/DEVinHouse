package semana03.mensageiroo.entidades;

public class Mensagem {
    private Pessoa remetente;
    private String corpoDeTexto;

    public Mensagem(Pessoa remetente, String corpoDeTesxto) {
        this.remetente = remetente;
        this.corpoDeTexto = corpoDeTesxto;
    }

    public Pessoa getRemetente() {
        return remetente;
    }

    public String getCorpoDeTexto() {
        return corpoDeTexto;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "corpoDeTexto='" + corpoDeTexto + '\'' +
                '}';
    }
}
