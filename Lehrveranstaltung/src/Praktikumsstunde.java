import java.util.Date;


public class Praktikumsstunde {
   
   
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;
    private String aufgaben;

    // Konstruktor
    public Praktikumsstunde(String thema, String datum, String uhrzeit, String raum, String aufgaben) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = aufgaben;
    }

    //Anzeige Details der Praktikumsstunde
    public void anzeigenDetails(String thema, String Datum, String uhrzeit, String raum, String aufgaben) {
        System.out.println("Thema: " + thema);
        System.out.println("Datum: " + datum);
        System.out.println("Uhrzeit: " + uhrzeit);
        System.out.println("Raum: " + raum);
        System.out.println("Aufgaben: " + aufgaben);
    }
}
