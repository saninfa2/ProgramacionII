package TP2.ejercicio1;

class Dog extends Animal {
    private String race;
    private boolean vaccinated;

    public Dog(String name, int age, double price, String race, boolean vaccinated) {
        super(name, age, "perro", price);
        this.race = race;
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return super.toString() + ", raza: " + race + ", vacunado: " + vaccinated;
    }
}
