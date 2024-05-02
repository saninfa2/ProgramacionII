package Parcial.primerPacial;
//requisitos:
//Athlete debe participar de al menos una prueba
//cada prueba tendrá un codigo y un título
public class Test {
    //Declaración de atributos
    private int cod;
    private String title;
    private Athlete[] athletes;

    //Constructor sobrecargado
    public Test(int cod, String title, Athlete[] athletes) {
        this.cod = cod;
        this.title = title;
        this.athletes = athletes;
    }

    //Getters
    public int getCod() {
        return cod;
    }
    public Athlete[] getAthletes() {
        return athletes;
    }
}
