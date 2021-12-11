package semana03.exercicio02;

public class TestaFatura {


    public static void main(String[] args) {
        Fatura novopedido = new Fatura("001","monitor", 1, 1500);

        novopedido.setNumero("002");
        novopedido.setDescricao("placa mae");
        novopedido.setQtdItem(2);
        novopedido.setPreco(-1000);

        System.out.println(novopedido.getNumero());
        System.out.println(novopedido.getDescricao());
        System.out.println(novopedido.getQtdItem());
        System.out.println(novopedido.getPreco());

        System.out.println(novopedido.getValorFatura());
    }
}
