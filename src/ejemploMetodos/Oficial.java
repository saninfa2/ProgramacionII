package ejemploMetodos;

public class Oficial extends Operator {
    //Constructores

    public Oficial() {
    }

    public Oficial(String name, double workedhours, double price4hour, int dni) {
        super(name, workedhours, price4hour, dni);
    }

    //Metodo
    @Override
    public String toString() {
        return super.toString();
    }
}
