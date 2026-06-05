package modell;

public abstract class Jatekos {

    protected String nev;
    protected int eletero;
    protected int ero;
    protected int aktualisMezo;

    public Jatekos(String nev, int eletero, int ero) {
        this.nev = nev;
        this.eletero = eletero;
        this.ero = ero;
        this.aktualisMezo = 0;
    }

    public void sebestKap(int sebzes) {
        this.eletero -= sebzes;
        if (this.eletero < 0) {
            this.eletero = 0;
        }
    }

    public boolean isElo() {
        return this.eletero > 0;
    }

    public abstract int specialisKepesseg();

    public String getNev() { return nev; }
    public int getEletero() { return eletero; }
    public int getEro() { return ero; }
    public int getAktualisMezo() { return aktualisMezo; }
    public void setAktualisMezo(int mezo) { this.aktualisMezo = mezo; }
}
