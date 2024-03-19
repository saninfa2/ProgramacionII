package ejemploHerencia;

public class Car extends Vehicle {

    //Declaracion de atributo
    private boolean convertible;

    //Constructores
    public Car(){

    }
    public Car(boolean convertible) {
        this.convertible = convertible;
    }

    //Constructor: herencia + propios
    public Car(String owner, int doors, int wheels, boolean convertible) {
        super(owner, doors, wheels);
        this.convertible = convertible;
    }

    //Getter y setter
    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public String toString() {
        return "Auto{ "+ "El propietario del auto es "+this.getOwner() +
                " Puertas:"+this.getDoors() +
                " Ruedas:"+this.getWheels() +
                " Descapotable= " + convertible +
                '}';
    }
}
