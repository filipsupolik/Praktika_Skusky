public class Auto implements IVozidlo {
    private String spz;
    private String znacka;
    private double hmotnost;
    private int rokVyroby;
    private boolean nakladne;

    public Auto(String spz, String znacka, double hmotnost, int rokVyroby, boolean nakladne) {
        this.spz = spz;
        this.znacka = znacka;
        this.hmotnost = hmotnost;
        this.rokVyroby = rokVyroby;
        this.nakladne = nakladne;
    }

    public Auto() {
        this.spz = "AA256FG";
        this.znacka = "Porsche";
        this.hmotnost = 2800;
        this.rokVyroby = 2014;
        this.nakladne = false;
    }

    public String getSpz() {
        return this.spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public String getZnacka() {
        return this.znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public double getHmotnost() {
        return this.hmotnost;
    }

    public void setHmotnost(double hmotnost) {
        this.hmotnost = hmotnost;
    }

    public int getRokVyroby() {
        return this.rokVyroby;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }

    public boolean isNakladne() {
        return this.nakladne;
    }

    public void setNakladne(boolean nakladne) {
        this.nakladne = nakladne;
    }

    @Override
    public String toString() {
        return this.spz + " " + this.znacka + " " + this.hmotnost + " " + this.rokVyroby + " " + this.nakladne;
    }

    @Override
    public void vypisInfo() {
        System.out.println("Auto " + this);
    }
}
