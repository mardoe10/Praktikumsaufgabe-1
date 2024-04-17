public class Lehrveranstaltungen {

    //Datenfelder
    private String Titel;
    Dozierender dozierender;
    Studierende[] studierende;
    private int anzahlStudierende;
    private int Stunden;
    private int Praktikumsstunden;

    //Konstruktor
    public Lehrveranstaltungen(String Titel, Dozierender dozierender, int Stunden, int Praktikumsstunden) {
        this.Titel = Titel;
        this.dozierender = dozierender;
        this.Stunden = Stunden;
        this.Praktikumsstunden = Praktikumsstunden;
        studierende = new Studierende[50];
        anzahlStudierende = 0;
    }
    
    //Getter für den Dozierenden
    public Dozierender getDozierender() {
        return dozierender;
    }

    //Getter für den Titel
    public String getTitel() {
        return Titel;
    }

    //Getter für die Stunden
    public int getStunden() {
        return Stunden;
    }

    //Getter für die Praktikumsstunden
    public int getPraktikumsstunden() {
        return Praktikumsstunden;
    }

    //Öffentliche Methode zum Hinzufügen von Studierenden
    public void hinzufügenVonStudierende(Studierende s) {
        studierende[anzahlStudierende] = s;
        anzahlStudierende++;
    }

    //Öffentliche Methode zum Entfernen von Studierenden
    public void entfernenVonStudierende(Studierende s) {
        for (int i = 0; i < anzahlStudierende; i++) {
            if (studierende[i] == s) {
                studierende[i] = studierende[anzahlStudierende - 1];
                anzahlStudierende--;
                break;
            }
        }
    }

    //Öffentliche Methode zum Hinzuügen von Praktikumsstunden
    public void hinzufügenVonPraktikumsstunden(int Praktikumsstunden) {
        this.Praktikumsstunden += Praktikumsstunden;
    }

    //Öffentliche Methode zum Hinzufügen von Vorlesungsstunden
    public void hinzufügenVonVorlesungsstunden(int Stunden) {
        this.Stunden += Stunden;
    }

    //Öffentliche Methode zum Anzeigen der Veranstaltungsdetails
    public void anzeigenVeranstaltungsdetails() {
        System.out.println("Titel: " + Titel);
        System.out.println("Dozierender: " + dozierender.getName());
        System.out.println("Fakultät: " + dozierender.getFakultaet());
        System.out.println("Büronummer: " + dozierender.getBueronummer());
        System.out.println("Stunden: " + Stunden);
        System.out.println("Praktikumsstunden: " + Praktikumsstunden);
        System.out.println("Studierende: ");
        for (int i = 0; i < anzahlStudierende; i++) {
            System.out.println(studierende[i].getName());
        }
    }


}
