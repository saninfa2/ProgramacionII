package TP1.ejercicio10;

public class BookManagement{
    public static void main(String[] args) {

        Book libro1 = new Book("Alicia en el país de las maravillas", "Jane Doe", 20000);
        libro1.printInformation();
        System.out.println();

        TextBook libroTexto1 = new TextBook("Calculo 1", "Alice Maravilla", 240000, "Calculo");
        libroTexto1.printInformation();
        System.out.println();

        TextBookUN libroTextoUN1 = new TextBookUN("Historia de Colombia", "Carlos Escobar", 400, "Historia", "Facultad de Ciencias Humanas");
        libroTextoUN1.printInformation();
        System.out.println();

        Novel novela1 = new Novel("Caja de seguridad", "Elton Jonh", 1995, "Misterio");
        novela1.printInformation();
    }
}
