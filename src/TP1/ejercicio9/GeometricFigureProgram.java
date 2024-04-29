package TP1.ejercicio9;
public class GeometricFigureProgram{
    public static void main(String[] args) {
        // Crear instancias de Circle y Rectangle
        Circle circle1 = new Circle(5);
        Rectangle rectangle1 = new Rectangle(4, 6);

        //Areas y perimetros
        System.out.println("Círculo:");
        System.out.println("Área: " + circle1.calculateArea());
        System.out.println("Perímetro: " + circle1.calculatePerimeter());

        System.out.println("\nRectángulo:");
        System.out.println("Área: " + rectangle1.calculateArea());
        System.out.println("Perímetro: " + rectangle1.calculatePerimeter());
    }
}
