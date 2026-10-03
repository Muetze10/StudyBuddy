package studybuddy;
import java.time.LocalDateTime;

public class Main{
    public static void main(String[] arg){
        
        Aufgabe hausaufgabe = new Aufgabe("Iprog", "Beschreibung", 60, LocalDateTime.of(2026,10,5,19,10), false, Aufgabe.Prioritaet.Medium);
        

        System.out.println(hausaufgabe.name);
        System.out.println(hausaufgabe.aufgabenbeschreibung);
        System.out.println(hausaufgabe.aufgabendauer);
        System.out.println(hausaufgabe.prio);
        System.out.println(hausaufgabe.erledigt);
        System.out.println(hausaufgabe.datum);

    }
}