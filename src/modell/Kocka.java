package modell;

import java.util.Random;

public class Kocka {

    private Random random;
    private int lapok;

    public Kocka(int lapok) {
        this.lapok = lapok;
        this.random = new Random();
    }

    public int dobas() {
        return random.nextInt(lapok) + 1;
    }

    public int getLapok() { return lapok; }
}
