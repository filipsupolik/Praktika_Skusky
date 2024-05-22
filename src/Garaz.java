import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Garaz {
    private HashMap<String, Auto> auta;

    public Garaz() {
        this.auta = new HashMap<>();
    }

    public void pridajAuto(Auto auto) {
        this.auta.put(auto.getSpz(), auto);
    }

    public void vypisAuta() {
        for (Auto auto : this.auta.values()) {
            auto.vypisInfo();
        }
    }

    public boolean obsahujeSPZ(String spzNaKontrolu) {
        return this.auta.containsKey(spzNaKontrolu);
    }

    public boolean obsahujeAuto(Auto auto) {
        return this.auta.containsValue(auto);
    }

    public int pocetAut() {
        return this.auta.size();
    }

    public void vymazAuto(String spz) {
        this.auta.remove(spz);
    }

    public void zapisAuta() throws IOException {
        var file = new File("C:\\Users\\filip\\IdeaProjects\\Skuska_garaz_praktika\\assets\\autaUlozeneVKontajneri.txt");
        var zapis = new PrintWriter(file);
        for (Map.Entry<String, Auto> entry : this.auta.entrySet()) {
            zapis.print(entry.getKey() + " ");
            zapis.print(entry.getValue().getZnacka() + " ");
            zapis.print(entry.getValue().getHmotnost() + " ");
            zapis.print(entry.getValue().getRokVyroby() + " ");
            zapis.println(entry.getValue().isNakladne());
        }
        zapis.close();
    }

    public void nacitajAuta() throws IOException {
        var subor = new File("C:\\Users\\filip\\IdeaProjects\\Skuska_garaz_praktika\\assets\\auta.txt");
        var nacitaj = new Scanner(subor);
        while (nacitaj.hasNextLine()) {
            String spz = nacitaj.next();
            if (!this.obsahujeSPZ(spz)) {
                String znackaAuta = nacitaj.next();
                double hmotnost = nacitaj.nextDouble();
                int rokVyroby = nacitaj.nextInt();
                boolean nakladne = nacitaj.nextBoolean();
                this.auta.put(spz, new Auto(
                        spz, znackaAuta, hmotnost, rokVyroby, nakladne
                ));
            } else {
                System.out.println("Auto s takouto SPZ uz existuje.");
            }
        }
    }
}
