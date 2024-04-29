package TP1.ejercicio10;

public class TextBookUN extends TextBook{
    private String faculty;

    public TextBookUN(String title, String autor, double price, String course, String faculty) {
        super(title, autor, price, course);
        this.faculty = faculty;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Facultad: " + faculty);
    }
}
