package TP1.ejercicio9;

public class Rectangle extends GeometricFigure{
        // Atributos para la longitud y la anchura
        private double length;
        private double width;

        // Constructor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Implementación del método para calcular el área del rectángulo
        @Override
        public double calculateArea() {
            return length * width;
        }

        // Implementación del método para calcular el perímetro del rectángulo
        @Override
        public double calculatePerimeter() {
            return 2 * (length + width);
        }

}
