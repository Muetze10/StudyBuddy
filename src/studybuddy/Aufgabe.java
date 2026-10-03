package studybuddy;

import java.time.LocalDateTime;

public class Aufgabe{

    enum Prioritaet{Hoch, Medium, Niedrig};

    String name;
    String aufgabenbeschreibung;
    int aufgabendauer;
    LocalDateTime datum;
    boolean erledigt;
    Prioritaet prio;

    public Aufgabe(String name, String aufgabenbeschreibung, int aufgabendauer,LocalDateTime datum, boolean erledigt, Prioritaet prio){
        this.name = name;
        this.aufgabenbeschreibung = aufgabenbeschreibung;
        this.aufgabendauer = aufgabendauer;
        this.datum = datum;
        this.erledigt = erledigt;
        this.prio = prio;
    }
}