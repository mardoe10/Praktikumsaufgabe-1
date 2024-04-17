public class App {
    public static void main(String[] args) throws Exception{
 
        // Erzeugen eines Dozierenden-Objekts
        Dozierender dozierender = new Dozierender("Prof. Dr. Müller", "Informatik", "A123");


        // Aufruf der Methode "frageBeantworten"
        dozierender.frageBeantworten("Das, was wir im Praktikum gemacht haben.");
      
         // Erzeugen eines Studenten-Objekts
         Studierende student1 = new Studierende("Maria Dörfler", 123456, "Informatik");
    }
}
