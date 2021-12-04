package semana02;

import java.util.Scanner;

public class Exercicio06 {
    private static Scanner keyboard;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);

        float precoEtanol, precoGasolina, custoEtanol, custoGasolina;
        int rendimentoEtanol, rendimentoGasolina, kilometragem;

        System.out.println("Digite o preço do etanol: ");
        precoEtanol = keyboard.nextFloat();

        System.out.println("Digite o preço da gosalina: ");
        precoGasolina = keyboard.nextFloat();

        System.out.println("Digite o rendimento do carro com etanol: ");
        rendimentoEtanol = keyboard.nextInt();

        System.out.println("Digite o rendimento do carro com gasolina: ");
        rendimentoGasolina = keyboard.nextInt();

        System.out.println("Digite a kilometragem rodada: ");
        kilometragem = keyboard.nextInt();

        custoEtanol = kilometragem / rendimentoEtanol * precoEtanol;
        custoGasolina = kilometragem / rendimentoGasolina * precoGasolina;

        System.out.println("O custo da viajem com etanol é " + custoEtanol);
        System.out.println("O custo da viajem com gasolina é " + custoGasolina);
    }

}
