package semana04.exercicio03;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String menu = "" +
                "|-------------------------------|\n" +
                "|   Cáulo de área de figuras    |\n" +
                "|-------------------------------|\n" +
                "|  1: Quadrado              	|\n" +
                "|  2: Retângulo              	|\n" +
                "|  3: Triângulo             	|\n" +
                "|  0: Sair                  	|\n" +
                "|-------------------------------|\n";

        int opcao;

        do {
            System.out.println(menu);
            opcao = keyboard.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira a medida do lado:");
                    float lado = keyboard.nextFloat();
                    FiguraGeometrica quadrado = new Quadrado(lado);
                    System.out.printf("Área: %.2f.\n",quadrado.getArea());
                    break;
                case 2:
                    System.out.println("Insira a medida da base:");
                    float baseR = keyboard.nextFloat();
                    System.out.println("Insira a medida da altura:");
                    float alturaR = keyboard.nextFloat();
                    FiguraGeometrica retangulo = new Retangulo(baseR, alturaR);
                    System.out.printf("Área: %.2f.\n",retangulo.getArea());
                    break;
                case 3:
                    System.out.println("Insira a medida da base:");
                    float baseT = keyboard.nextFloat();
                    System.out.println("Insira a medida da altura:");
                    float alturaT = keyboard.nextFloat();
                    FiguraGeometrica triangulo = new Triangulo(baseT, alturaT);
                    System.out.printf("Área: %.2f.\n",triangulo.getArea());
                    break;
                case 0:
                    break;
            }
        } while (opcao != 0);
    }
}
