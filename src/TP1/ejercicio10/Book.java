package TP1.ejercicio10;

public class Book{
    private String title;
    private String autor;
    private double price;

    public Book(String title, String autor, double price) {
        this.title = title;
        this.autor = autor;
        this.price = price;
    }

    //SETTERS y GETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void printInformation() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + price);
    }
}
