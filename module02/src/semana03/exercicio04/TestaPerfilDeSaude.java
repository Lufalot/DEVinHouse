package semana03.exercicio04;

import java.util.Scanner;

public class TestaPerfilDeSaude {

        static Scanner keyboard = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.println("Insira seu nome:");
            String nome = keyboard.nextLine();

            System.out.println("Insira seu sobrenome:");
            String sobrenome = keyboard.nextLine();

            System.out.println("Insira seu sexo:");
            String sexo = keyboard.nextLine();

            System.out.println("Insira sua data de nascimento no formato yyyy-MM-dd:");
            String dataNascimento = keyboard.nextLine();

            System.out.println("Insira sua altura em metros");
            float altura = keyboard.nextFloat();

            System.out.println("Insira seu peso em Kg:");
            float peso = keyboard.nextFloat();

            PerfilDeSaude teste = new PerfilDeSaude(nome, sobrenome, sexo, dataNascimento, altura, peso);

            System.out.printf("%s %s %n", teste.getNome(), teste.getSobrenome());
            System.out.println(teste.getDataNascimento());
            System.out.println(teste.getIdade());

            System.out.printf("Frequência Cardíaca Máxima: %s %n", teste.getFreqCardiacaMax());
            System.out.printf("Frequência Cardíaca Alvo: %s %n", teste.getFreqCardiacaAlvo());
            System.out.printf("IMC: %.2f Kg/m² %n", teste.getIMC());
        }
}
