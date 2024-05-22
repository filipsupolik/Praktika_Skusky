public class Opravar extends Clovek {
    private int rokNastupu;
    private boolean aktualny;
    public Opravar(String meno, String priezvisko, int rokNastupu, boolean aktualny) {
        super(meno, priezvisko);
        this.rokNastupu = rokNastupu;
        this.aktualny = aktualny;
    }

    public int getRokNastupu() {
        return this.rokNastupu;
    }

    public void setRokNastupu(int rokNastupu) {
        this.rokNastupu = rokNastupu;
    }

    public boolean isAktualny() {
        return this.aktualny;
    }

    public void setAktualny(boolean aktualny) {
        this.aktualny = aktualny;
    }

    @Override
    public String toString() {
        return "Opravar " + this + "nastupil do zamestnania v roku " + this.rokNastupu + "a ma stav " + this.aktualny;
    }

    @Override
    public String pracuj() {
        return "Opravuje auto";
    }
}
