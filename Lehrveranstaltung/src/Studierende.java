public class Studierende {

    private String name;
    private int matrikelnummer;
    private String studiengang;
    private String wochentag;
    private String tag;
    private int monat;
    private int jahr;
    private int uhrzeit;

    // Konstruktor
    public Studierende(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    //  Aufgabe 1  Öffentliche Methode Frageatellen
    public void frageStellen( String frage) {
        System.out.println(name + " :"+ frage);
    }

    public void sprechStundenAnfrage(String wochentag, int tag, int monat, int jahr, int uhrzeit){
        System.out.println(name + " :Haben Sie am " + wochentag + " den " + tag + "." + monat + "." + jahr + "." + " um " + uhrzeit + " Uhr Zeit für eine Sprechstunde?");
    }
    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public String getTag() {
        return tag;
    }

    public int getMonat() {
        return monat;
    }

    public int getJahr() {
        return jahr;
    }

    public int getUhrzeit() {
        return uhrzeit;
    }

    
}
