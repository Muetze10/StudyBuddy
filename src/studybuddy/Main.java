package studybuddy;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main{
    public static void main(String[] arg){
        
        Aufgabe hausaufgabe = new Aufgabe("Iprog", "Beschreibung", 60, LocalDateTime.of(2026,10,5,19,10), false, Aufgabe.Prioritaet.Medium);
        
        ArrayList<Aufgabe> aufgaben = new ArrayList<>();
        aufgaben.add(hausaufgabe);
        aufgaben.add(new Aufgabe("AT", "Beschreibung", 60, LocalDateTime.of(2025,10,5,19,10), false, Aufgabe.Prioritaet.Medium));

        for(Aufgabe h : aufgaben){
            System.out.println(h.name);
            System.out.println(h.aufgabenbeschreibung);
            System.out.println(h.aufgabendauer);
            System.out.println(h.prio);
            System.out.println(h.erledigt);
            System.out.println(h.datum);
        }
    }
}