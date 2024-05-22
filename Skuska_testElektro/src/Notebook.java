public class Notebook implements IPocitac {
    private String nazov;
    private String typ;
    private double uhlopriecka;
    private boolean dotykovy;

    public Notebook(String nazov, String typ, double uhlopriecka, boolean dotykovy) {
        this.nazov = nazov;
        this.typ = typ;
        this.uhlopriecka = uhlopriecka;
        this.dotykovy = dotykovy;
    }

    public Notebook() {
        this.nazov = "Lenovo";
        this.typ = "A6698VB";
        this.uhlopriecka = 16;
        this.dotykovy = true;
    }

    public String getNazov() {
        return this.nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getTyp() {
        return this.typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getUhlopriecka() {
        return this.uhlopriecka;
    }

    public void setUhlopriecka(double uhlopriecka) {
        this.uhlopriecka = uhlopriecka;
    }

    public boolean isDotykovy() {
        return this.dotykovy;
    }

    public void setDotykovy(boolean dotykovy) {
        this.dotykovy = dotykovy;
    }

    @Override
    public String toString() {
        return this.nazov + " " + this.typ + " " + this.uhlopriecka + " " + this.dotykovy;
    }

    @Override
    public void vypisInfo() {
        System.out.println("NOTEBOOK " + this);
    }
}
