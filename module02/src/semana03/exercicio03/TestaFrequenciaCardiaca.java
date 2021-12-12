package semana03.exercicio03;

import java.util.Scanner;

public class TestaFrequenciaCardiaca {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Insira seu nome:");
        String nome = keyboard.nextLine();

        System.out.println("Insira seu sobrenome:");
        String sobrenome = keyboard.nextLine();

        System.out.println("Insira sua data de nascimento no formato yyyy-MM-dd:");
        String dataNascimento = keyboard.nextLine();

        FrequenciaCardiaca teste = new FrequenciaCardiaca(nome, sobrenome, dataNascimento);

        System.out.printf("%s %s %n", teste.getNome(), teste.getSobrenome());
        System.out.println(teste.getDataNascimento());
        System.out.println(teste.getIdade());

        System.out.printf("Frequência Cardíaca Máxima: %s %n", teste.getFreqCardiacaMax());
        System.out.printf("Frequência Cardíaca Alvo: %s %n", teste.getFreqCardiacaAlvo());
    }
}
