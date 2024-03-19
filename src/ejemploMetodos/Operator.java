package ejemploMetodos;

public class Operator extends Employee {

    //Declaración de atributos
    private int dni;

    //Constructor
    public Operator() {
    }

    public Operator(String name, double workedhours, double price4hour, int dni) {
        super(name, workedhours, price4hour);
        this.dni = dni;
    }

    @Override
    public String toString() {
        return super.toString() + " Dni: " + dni;
    }
}
