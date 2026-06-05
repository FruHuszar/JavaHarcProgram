package app;

import modell.JatekTer;
public class Program {

    public static void main(String[] args) {
        JatekTer jatekTer = new JatekTer();
        int korSzamlalo = 0;

        System.out.println(jatekTer.getUtolsoEsemeny());

        while (!jatekTer.isJatekVege()) {
            System.out.println("");
            korSzamlalo++;
            System.out.println("-- Kor " + korSzamlalo + " --");
            System.out.println(jatekTer.korLejatszasa());
        }

        System.out.println("\nJatek vege! Gyoztes: " + jatekTer.getGyoztes());
    }
}