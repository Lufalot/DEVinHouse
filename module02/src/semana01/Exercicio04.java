package semana01;

import java.util.Random;
import java.util.Scanner;

public class Exercicio04 {
    private static Scanner keyboard;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(5) + 1;

        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando.");
        int digitedNumber = keyboard.nextInt();

        while (randomNumber != digitedNumber) {
            System.out.println("Você errou, tente novamente.");
            digitedNumber = keyboard.nextInt();
        }

        System.out.println("Você acertou, parabéns!");

       /* if (digitedNumber == randomNumber) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou, o número correto era "+randomNumber);
        }*/

    }
}
