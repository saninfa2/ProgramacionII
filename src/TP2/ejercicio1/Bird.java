package TP2.ejercicio1;

class Bird extends Animal {
    private String species;
    private boolean speak;

    public Bird(String name, int age, double price, String species, boolean speak) {
        super(name, age, "pajaro", price);
        this.species = species;
        this.speak = speak;
    }

    @Override
    public String toString() {
        return super.toString() + ", especie: " + species + ", habla: " + speak;
    }
}