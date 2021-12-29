package semana03.mensageiroo;

import semana03.mensageiroo.entidades.Conversa;
import semana03.mensageiroo.entidades.Mensagem;
import semana03.mensageiroo.entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class AppMensageiro {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa("user1");
        Pessoa voce = new Pessoa("voce");

        List<Pessoa> participantesDaConversa = new ArrayList<Pessoa>();

        participantesDaConversa.add(eu);
        participantesDaConversa.add(voce);

        Conversa conversa = new Conversa(participantesDaConversa);

        conversa.enviarMensagem(eu, "Hello World");
        conversa.enviarMensagem(voce, "Foo!");
        conversa.enviarMensagem(eu, "Java Rocks!");

        for (Mensagem mensagem : conversa.getTimeline()) {
            System.out.println(mensagem);
        }
    }
}
