package ejemploHerencia;

public class Truck extends Vehicle{

    //Declaracion de atributo
    private float burden;

    //Constructores
    public Truck(){

    }
    public Truck(float burden) {
        this.burden = burden;
    }

    //Constructor: herencia + propios
    public Truck(String owner, int doors, int wheels, float carga) {
        super(owner, doors, wheels);
        this.burden = carga;
    }

    //Getter y setter
    public float getBurden() {
        return burden;
    }

    public void setBurden(float burden) {
        this.burden = burden;
    }

    //Sobreescritura del toString super
    @Override
    public String toString() {
        return "Camion{" +
                "carga=" + burden +
                '}';
    }

}
