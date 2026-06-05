package modell;

public class JatekTer {

    private Harcos harcos;
    private Varazslo varazslo;
    private Kocka kocka;
    private boolean harcosKore;
    private boolean jatekVege;
    private String utolsoEsemeny;

    public JatekTer() {
        harcos = new Harcos("Harcos");
        varazslo = new Varazslo("Varazslo");
        kocka = new Kocka(6);
        harcosKore = true;
        jatekVege = false;
        utolsoEsemeny = "A jatek elkezdodott! A Harcos kezd.";
    }

    public String korLejatszasa() {
        if (jatekVege) {
            return utolsoEsemeny;
        }

        Jatekos tamado;
        Jatekos vedekezo;

        if (harcosKore) {
            tamado = harcos;
            vedekezo = varazslo;
        } else {
            tamado = varazslo;
            vedekezo = harcos;
        }

        int dobottErtek = kocka.dobas();
        String esemeny = tamado.getNev() + " dobott: " + dobottErtek + "\n";
        esemeny += harc(tamado, vedekezo, dobottErtek);

        if (!vedekezo.isElo()) {
            jatekVege = true;
            esemeny += "\n" + tamado.getNev() + " nyert!";
        } else {
            harcosKore = !harcosKore;
            Jatekos kovetkezo = harcosKore ? harcos : varazslo;
            esemeny += "\nKovetkezo: " + kovetkezo.getNev();
        }

        utolsoEsemeny = esemeny;
        return utolsoEsemeny;
    }

    // A instanceof ellenorzi, hogy a tamado vagy vedekezo objektum
    // pontosan Harcos vagy Varazslo tipusu-e, mivel a specialisKepesseg()
    // hatasat tipustol fuggoen kell alkalmazni.
    private String harc(Jatekos tamado, Jatekos vedekezo, int dobas) {
        int sebzes = tamado.getEro() + dobas;
        String eredmeny = "";

        if (vedekezo instanceof Harcos) {
            Harcos harcosVedekezo = (Harcos) vedekezo;
            int vedekezes = harcosVedekezo.specialisKepesseg();
            sebzes = Math.max(0, sebzes - vedekezes);
            eredmeny += vedekezo.getNev() + " pajzsa " + vedekezes + " sebzest blokkolt.\n";
        }

        if (tamado instanceof Varazslo) {
            Varazslo varazsloTamado = (Varazslo) tamado;
            int bonus = varazsloTamado.specialisKepesseg();
            sebzes += bonus;
            eredmeny += tamado.getNev() + " varazsereje +" + bonus + " extra sebzest okozott.\n";
        }

        vedekezo.sebestKap(sebzes);
        eredmeny += tamado.getNev() + " " + sebzes + " sebzest okozott. "
                + vedekezo.getNev() + " eletero: " + vedekezo.getEletero();

        return eredmeny;
    }

    public void ujJatek() {
        harcos = new Harcos("Harcos");
        varazslo = new Varazslo("Varazslo");
        harcosKore = true;
        jatekVege = false;
        utolsoEsemeny = "A jatek elkezdodott! A Harcos kezd.";
    }

    public Harcos getHarcos() { return harcos; }
    public Varazslo getVarazslo() { return varazslo; }
    public boolean isJatekVege() { return jatekVege; }
    public boolean isHarcosKore() { return harcosKore; }
    public String getUtolsoEsemeny() { return utolsoEsemeny; }

    public String getGyoztes() {
        if (!jatekVege) return null;
        return harcos.isElo() ? harcos.getNev() : varazslo.getNev();
    }
}