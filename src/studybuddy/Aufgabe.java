package studybuddy;

import java.time.LocalDateTime;

public class Aufgabe{
    String name;
    String aufgabenbeschreibung;
    int aufgabendauer;
    LocalDateTime datum;
    boolean erledigt;
    enum Prioritaet{Hoch, Medium, Niedrig};
    Prioritaet prio;
}