package app;

import modell.JatekTer;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        JatekTer jatekTer = new JatekTer();
        Scanner scanner = new Scanner(System.in);
        int korSzamlalo = 0;

        System.out.println(jatekTer.getUtolsoEsemeny());

        while (!jatekTer.isJatekVege()) {
            System.out.println("\nNyomj Entert a kovetkezo korhoz...");
            scanner.nextLine();

            korSzamlalo++;
            System.out.println("-- Kor " + korSzamlalo + " --");
            System.out.println(jatekTer.korLejatszasa());
        }

        System.out.println("\nJatek vege! Gyoztes: " + jatekTer.getGyoztes());
        scanner.close();
    }
}