package ejemploMetodos;

public class Employee {

    //Declaracion de atributo
    private String name;
    private double workedhours;
    private double price4hour;

    //Constructores
    public Employee(){
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double workedhours, double price4hour) {
        this.name = name;
        this.workedhours = workedhours;
        this.price4hour = price4hour;
    }

    //Getter y setter
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //No generamos setters para salario por hora ni horas trabajadas

    public double getWorkedhours() {
        return workedhours;
    }

    public double getPrice4hour() {
        return price4hour;
    }

    //Metodos
    public String salary(){
        return "$" + this.workedhours * this.price4hour;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + name + '\'' + "Salario: " + salary();
    }
}
