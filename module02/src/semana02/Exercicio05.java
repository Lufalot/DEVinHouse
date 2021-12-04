package semana02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio05 {
    private static Scanner keyboard;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);

        System.out.println("Digite uma data no formato dd/mm/aaaa: ");
        String dataDigitada = keyboard.next();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = null;
        try {
            dataFormatada = formatter.parse(dataDigitada);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateFormat f = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(f.format(dataFormatada));

     }
}
