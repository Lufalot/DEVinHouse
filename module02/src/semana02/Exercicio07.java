package semana02;

import java.util.Scanner;

public class Exercicio07 {
    private static Scanner keyboard;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe seu gênero (M ou F):");
        String genero = keyboard.nextLine();

        if (!genero.equals("M") && !genero.equals("F")) {
            System.out.println("Informação incorreta, aboartando execução.");
            return;
        }

        System.out.println("Informe seu peso (Kg):");
        float peso = keyboard.nextFloat();

        System.out.println("Informe sua altura (cm):");
        float altura = keyboard.nextFloat();

        System.out.println("Informe sua idade:");
        int idade = keyboard.nextInt();

        System.out.println("Quantas horas de atividade física por dia?");
        float horasAtividade = keyboard.nextFloat();

        System.out.println("Quantos Kg deseja perder em um mês?");
        float kgEmagrecer = keyboard.nextFloat();
        if (kgEmagrecer > 3) {
            System.out.println("Perder mais do que 3 Kg por mês pode ser prejudicial.");
            return;
        }

        float kcalEmagrecer = kgEmagrecer * 7000;
        float kcalAtividade = horasAtividade * 400 * 30;

        float basal;
        if (genero.equals("M")) {
            basal = (float) ((10 * peso) + (6.25 * altura) - (5 * idade) + 5);
        } else {
            basal = (float) ((10 * peso) + (6.25 * altura) - (5 * idade) - 161);
        }

        float kcalMagro = kcalEmagrecer - kcalAtividade;
        float dietaMes = basal * 30;
        float dietaDia = (dietaMes - kcalMagro) / 30;

        System.out.println("Seu consumo basal é "+basal);
        System.out.printf("Para emagrecer %s Kg, você precisa de uma dieta de %.2f kcal/dia", kgEmagrecer, dietaDia);
    }

}
