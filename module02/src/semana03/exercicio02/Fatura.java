package semana03.exercicio02;

public class Fatura {
    private String numero;
    private String descricao;
    private int qtdItem;
    private double preco;

    public Fatura(String numero, String descricao, int qtdItem, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdItem = qtdItem;
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }
    public int getQtdItem() {
        return qtdItem;
    }

    public double getValorFatura() {
        double total = preco * qtdItem;
        return (total > 0) ? total : 0;

    }
}
