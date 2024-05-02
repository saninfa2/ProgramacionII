package Parcial.primerPacial;
public class Person {
    //Declaración de atributos
    private int dni;
    private String name;

    //Constructor sorbecargado: no quiero crear a una persona sin dni o nombre
    public Person(int dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    //Getters
    public int getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }
}
