package modell;

public class JatekTer {

    private Harcos harcos;
    private Varazslo varazslo;
    private Kocka kocka;
    private boolean jatekVege;
    private String utolsoEsemeny;

    public JatekTer() {
        harcos = new Harcos("Harcos");
        varazslo = new Varazslo("Varazslo");
        kocka = new Kocka(6);
        jatekVege = false;
        utolsoEsemeny = "A jatek elkezdodott!";
    }

    public String korLejatszasa() {
        if (jatekVege) {
            return utolsoEsemeny;
        }

        int harcosDobase = kocka.dobas();
        int varazsloDobase = kocka.dobas();

        String esemeny = harcos.getNev() + " dobott: " + harcosDobase + "\n";
        esemeny += varazslo.getNev() + " dobott: " + varazsloDobase + "\n";

        if (harcosDobase > varazsloDobase) {
            esemeny += harc(harcos, varazslo, harcosDobase);
        } else if (varazsloDobase > harcosDobase) {
            esemeny += harc(varazslo, harcos, varazsloDobase);
        } else {
            esemeny += "Dontetlen! Senki nem sebez ebben a korben.";
        }

        if (!harcos.isElo()) {
            jatekVege = true;
            esemeny += "\n" + varazslo.getNev() + " nyert!";
        } else if (!varazslo.isElo()) {
            jatekVege = true;
            esemeny += "\n" + harcos.getNev() + " nyert!";
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
        jatekVege = false;
        utolsoEsemeny = "A jatek elkezdodott!";
    }

    public Harcos getHarcos() { return harcos; }
    public Varazslo getVarazslo() { return varazslo; }
    public boolean isJatekVege() { return jatekVege; }
    public String getUtolsoEsemeny() { return utolsoEsemeny; }

    public String getGyoztes() {
        if (!jatekVege) return null;
        return harcos.isElo() ? harcos.getNev() : varazslo.getNev();
    }
}