package TP2.ejercicio1;

class Cat extends Animal {
    private String race;
    private boolean sterilized;

    public Cat(String name, int age, double price, String race, boolean sterilized) {
        super(name, age, "Gato", price);
        this.race = race;
        this.sterilized = sterilized;
    }

    @Override
    public String toString() {
        return super.toString() + "raza: " + race + ", esterilizado: " + sterilized;
    }
}
