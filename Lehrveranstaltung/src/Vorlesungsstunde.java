import java.util.Date;

public class Vorlesungsstunde {

    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    // Konstruktor
    public Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    //Anzeige Details der Vorlesungsstunde
    public void anzeigenVorlesungsstundeDetails(String thema, String Datum, String uhrzeit, String raum) {
        System.out.println("Thema: " + thema);
        System.out.println("Datum: " + datum);
        System.out.println("Uhrzeit: " + uhrzeit);
        System.out.println("Raum: " + raum);
    }

}
