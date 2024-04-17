public class App {
    public static void main(String[] args) {
 
        // Erzeugen eines Dozierenden-Objekts
        Dozierender dozierender = new Dozierender("Prof. Dr. Müller", "Informatik", "A123");


        // Aufruf der Methode "frageBeantworten"
        dozierender.frageBeantworten("Das, was wir im Praktikum gemacht haben.");
        
    }
}
