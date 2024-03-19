package ejemploHerencia;

public class Main {
    public static void main(String[] args) {
        //Instanciamos un auto
        Car car1 = new Car("Sabina", 4, 4, true);
        System.out.println(car1.toString());

        //Instanciamos un camion
        Truck truck1 = new Truck("Sabina", 2, 8, 400);
        System.out.println(truck1.toString());
    }
}
