import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Elektro {
    private HashMap< String, Notebook> notebooky;

    public Elektro() {
        this.notebooky = new HashMap<String, Notebook>();
    }

    public void pridajNotebook(String znacka, Notebook notebook) {
        this.notebooky.put(znacka, notebook);
    }

    public void notebookInfo() {
        for (Map.Entry<String, Notebook> entry : this.notebooky.entrySet()) {
            entry.getValue().vypisInfo();
        }
    }

    public boolean obsahujeKod(String kodNaKontrolu) {
        return this.notebooky.containsKey(kodNaKontrolu);
    }

    public boolean obsahujeNotebook(Notebook notebook) {
        return this.notebooky.containsValue(notebook);
    }


    public int pocetNotebookov() {
        return this.notebooky.size();
    }

    public void vymazNotebook(String kod) {
        this.notebooky.remove(kod);
    }

    public void zapisNotebooky() throws FileNotFoundException {
        var file = new File("C:\\Users\\filip\\IdeaProjects\\Skuska_garaz_praktika\\Skuska_testElektro\\zoznam_Notebookov.txt");
        try (var zapis = new PrintWriter(file)) {
            for (Map.Entry<String, Notebook> entry : this.notebooky.entrySet()) {
                zapis.print(entry.getKey() + " ");
                zapis.print(entry.getValue().getNazov() + " ");
                zapis.print(entry.getValue().getTyp() + " ");
                zapis.print(entry.getValue().getUhlopriecka() + " ");
                zapis.println(entry.getValue().isDotykovy() + " ");
            }
        }
    }
}
