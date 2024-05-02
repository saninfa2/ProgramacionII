package Parcial.primerPacial;
//Requisitos:
//Cada atleta pertenece a 0 o más equipos
//Si pertenece, se establece un color y un país

public class NationalTeam {
    private String color;
    private String country;
    private Athlete[] athletes;

    //Constructor sobrecargado
    public NationalTeam(String color, String country, Athlete[] athletes) {
        this.color = color;
        this.country = country;
        this.athletes = athletes;
    }

    //Getter: array de atletas en un equipo nacional
    public Athlete[] getAthletes() {
        return athletes;
    }
}
