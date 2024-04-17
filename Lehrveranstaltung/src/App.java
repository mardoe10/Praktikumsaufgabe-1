public class App {
    public static void main(String[] args) throws Exception {
         
        // Erzeugen eines Studenten-Objekts
         Studierende student1 = new Studierende("Maria Dörfler", 123456, "Informatik");

        // Methode frageStellen
        student1.frageStellen("Was kommt alles in der Prüfung dran?");
    }
}
