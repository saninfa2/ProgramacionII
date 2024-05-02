package Parcial.primerPacial;
//Requisitos:
//implementacion de math y contract
//herencia de person
//instanciar un athlete con todos sus atributos
//implementación de todos los métodos de las interfaces. PRIORIDAD: evaluar si el atleta está dentro de
//los valores de IMC estandar
public class Athlete extends Person implements Math, Contract {
    //Declaración de atributos
    private double height;
    private int age;
    private double weight;

    //Constructor sobrecargado, atributos propios y de superclase
    public Athlete(double height, int age, double weight, int dni, String name) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    //Implementación de los metodos de las interfaces Math y Contract
    //Calcular imc. IMC = peso/altura^2
    @Override
    public double calculateIMC() {
        return weight / (height * height);
    }

    //Peso extra: determina si el IMC obtenido está por encima de los valores aceptados
    @Override
    public boolean extraWeight(double idealIMC) {
        double currentIMC = calculateIMC();
        return currentIMC > idealIMC;
    }


    //Implementación ficticia de contorl de pulsos, no se me ocurrió cómo implementarla
    //con valores reales
    @Override
    public double takePulses() {
        return 70.0;
    }

    //Getters: obtención de peso
    public double getHeight() {
        return height;
    }

    //Método para imprimir el estado del IMC del atleta según los estandares dados
    public void printIMCStatus() {
        double imc = calculateIMC();
        String status;
        if (imc < 18.5) {
            status = "Peso insuficiente";
        } else if (imc >= 18.5 && imc <= 24.9) {
            status = "Peso normal o saludable";
        } else if (imc >= 25.0 && imc <= 29.9) {
            status = "Sobrepeso";
        } else {
            status = "Obesidad";
        }
        System.out.println(getName() + " - IMC: " + imc + " - Estado: " + status);
    }
}


