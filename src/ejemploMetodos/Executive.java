package ejemploMetodos;

public class Executive extends Employee {
    //constructores

    public Executive() {
    }

    public Executive(String name) {
        super(name);
    }

    public Executive(String name, double workedhours, double price4hour) {
        super(name, workedhours, price4hour);
    }

    //metodo
    @Override
    public String toString() {
        return super.toString();
    }
}
