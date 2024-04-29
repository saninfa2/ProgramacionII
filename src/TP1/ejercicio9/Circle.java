package TP1.ejercicio9;

class Circle extends GeometricFigure{
    // Atributo para el radio
    private double radio;

    // Constructor
    public Circle(double radio) {
        this.radio = radio;
    }

    // Implementación del método para calcular el área del círculo
    @Override
    public double calculateArea() {
        return Math.PI * radio * radio;
    }

    // Implementación del método para calcular el perímetro del círculo
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radio;
    }
}
