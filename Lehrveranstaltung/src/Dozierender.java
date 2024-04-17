public class Dozierender {
    
    // Datenfelder
    private String name;
    private String fakultaet;
    private String bueronummer;
    private String feedback;

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

    //Getter für das Feedback
    public String getFeedback() {
        return feedback;
    }

    // Öffentliche Methode zum Beantworten von Fragen
    public void frageBeantworten(String antwort) {
        System.out.println(name + " antwortet: " + antwort);
    }

    // Öffentliche Methode Feedback von Studierenden
    public void feedbackVonStudierenden(String feedback) {
        System.out.println(name + " hat folgendes Feedback erhalten: " + feedback);
    }
}