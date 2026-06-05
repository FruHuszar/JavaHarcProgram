package modell;

public class Harcos extends Jatekos {

    private int pajzs;

    public Harcos(String nev) {
        super(nev, 100, 15);
        this.pajzs = 10;
    }

    @Override
    public int specialisKepesseg() {
        return pajzs;
    }

    public int getPajzs() { return pajzs; }
}
