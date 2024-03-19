package ejemploMetodos;

public class Main {
    public static void main(String[] args) {
        //Test de operario
        Operator operator1 = new Operator("Joel", 80, 5, 1231231);
        System.out.println(operator1.salary());
        System.out.println(operator1.toString());

        //Test ejecutivo
        Executive executive1 = new Executive("Mariciel", 120, 6);
        System.out.println(executive1.toString());
    }
}
