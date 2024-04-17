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
        

        
        
  
      
    }
}
