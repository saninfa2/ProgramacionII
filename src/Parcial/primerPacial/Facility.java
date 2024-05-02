package Parcial.primerPacial;
//requisitos:
//Cada prueba se realiza en al menos una instalacion
//De esta instalacion se toma la categoria, locación, nombre y tipo de prueba
public class Facility {
    //Declaración de atributos
    private String category;
    private String location;
    private String name;
    private String type;

    //Constructor sobrecargado
    public Facility(String category, String location, String name, String type) {
        this.category = category;
        this.location = location;
        this.name = name;
        this.type = type;
    }
}
