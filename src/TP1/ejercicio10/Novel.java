package TP1.ejercicio10;

public class Novel extends Book{
    private String type;

    public Novel(String title, String autor, double price, String type) {
        super(title, autor, price);
        this.type = type;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Tipo: " + type);
    }
}
