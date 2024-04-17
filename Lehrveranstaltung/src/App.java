public class App {
 
    public static void main(String[] args) throws Exception{
 

        
        // Erzeugen eines Studenten-Objekts
        Studierende student1 = new Studierende("Maria Dörfler", 123456, "Informatik");
        
       
        // Erzeugen eines Dozierenden-Objekts
        Dozierender dozierender = new Dozierender("Prof. Dr. Müller", "Informatik", "A123");
        
        
        // Methode frageStellen
        student1.frageStellen("Was kommt alles in der Prüfung dran?");

        
        // Aufruf der Methode "frageBeantworten"
        dozierender.frageBeantworten("Das, was wir im Praktikum gemacht haben.");
        

        
        // Aufruf der Methode "sprechStundenAnfrage"
        student1.sprechStundenAnfrage("Montag", 18, 04, 2024, 14);

        
        //aufruf der Methode "feedbackVonStudierenden"
        dozierender.feedbackVonStudierenden("Das Praktikum war sehr interessant.");

        //aufruf der Methode Hinzufügen von Praktikumsstunden
        Lehrveranstaltungen lehrveranstaltung = new Lehrveranstaltungen("Programmieren", dozierender, 2, 2);

        //aufruf der Methode Hinzufügen von studierenden
        lehrveranstaltung.hinzufügenVonStudierende(student1);

        //aufruf der Methode entfernen von studierenden
        lehrveranstaltung.entfernenVonStudierende(student1);

        //aufruf der Methode Hinzufügen von Vorlesungsstunden
        lehrveranstaltung.hinzufügenVonVorlesungsstunden(2);
        
        //aufruf der Methode Hinzufügen von Praktikumsstunden
        lehrveranstaltung.hinzufügenVonPraktikumsstunden(2);

        //aufruf der Methode Anzeigen der Veranstaltungsdetails
        lehrveranstaltung.anzeigenVeranstaltungsdetails(); 

        //aufruf der Methode Details der Praktikumsstunde
        Praktikumsstunde praktikumsstunde = new Praktikumsstunde("Praktikum 1", "01.01.2024", "14:00", "A123", "Aufgabe 1");
        praktikumsstunde.anzeigenDetails("Praktikum 1", "01.01.2024", "14:00", "A123", "Aufgabe 1");

        //aufruf der Methode details der Vorlesungsstunde
        Vorlesungsstunde vorlesungsstunde = new Vorlesungsstunde("Vorlesung 1", "01.01.2024", "14:00", "A123");
        vorlesungsstunde.anzeigenVorlesungsstundeDetails("Vorlesung 1", "01.01.2024", "14:00", "A123");
    
    }
}
