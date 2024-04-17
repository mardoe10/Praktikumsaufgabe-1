public class Studierende {

    private String name;
    private int matrikelnummer;
    private String studiengang;
    private String tag;
    private int datum;
    private int uhrzeit;

    // Konstruktor
    public Studierende(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    //  Aufgabe 1  Öffentliche Methode Frageatellen
    public void frageStellen(String frage) {
        //System.out.println(name + " :"+ frage);
        dozierender.frageBeantworten(this, frage);
    }

    public void sprechStundenAnfrage(String tag, int datum, int uhrzeit){
        System.out.println(name + " :Haben Sie am " + Tag + " den " + Datum + " um " + Uhrzeit + " Uhr Zeit für eine Sprechstunde?");
    }
}
