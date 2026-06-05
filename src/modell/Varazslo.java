package modell;

public class Varazslo extends Jatekos {

    private int varazsEro;

    public Varazslo(String nev) {
        super(nev, 80, 10);
        this.varazsEro = 20;
    }

    @Override
    public int specialisKepesseg() {
        return varazsEro;
    }

    public int getVarazsEro() { return varazsEro; }
}
