package ejemploHerencia;

public abstract class Vehicle {

    //Declaración de variables
    private String owner;
    private int doors;
    private int wheels;

    //Constructor vacío
    public Vehicle(){

    }

    //Constructor sobrecargado
    public Vehicle(String owner, int doors, int wheels){
        this.owner = owner;
        this.doors = doors;
        this.wheels = wheels;

    }

    //Getter y setters
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    //En lugar del sout de caracteristicas, un toStrign
    @Override
    public String toString() {
        return "Vehicle{" +
                "owner='" + owner + '\'' +
                ", doors=" + doors +
                ", wheels=" + wheels +
                '}';
    }

}
