public class Studierende {

    private String name;
    private int matrikelnummer;
    private String studiengang;

    // Konstruktor
    public Studierende(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    // Öffentliche Methode Frageatellen
    public void frageStellen(String frage) {
        System.out.println(name + " :"+ frage);
    }

}
