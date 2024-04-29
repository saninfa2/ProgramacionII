package TP1.ejercicio10;

public class TextBook extends Book{
    private String course;


    public TextBook(String title, String autor, double price, String course) {
        super(title, autor, price);
        this.course = course;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Curso: " + course);
    }
}
