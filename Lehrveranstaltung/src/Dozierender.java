public class Dozierender {
    
    // Datenfelder
    private String name;
    private String fakultaet;
    private String bueronummer;

    // Konstruktor
    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }
    // Getter für die Fakultät
    public String getFakultaet() {
        return fakultaet;
    }

    // Getter für die Büronummer
    public String getBueronummer() {
        return bueronummer;
    }

    // Getter für den Namen
    public String getName() {
        return name;
    }

    // Öffentliche Methode zum Beantworten von Fragen
    public void frageBeantworten(String antwort) {
        System.out.println(name + " antwortet: " + antwort);
    }
}