package TP2.ejercicio1;
class Animal {
    private String name;
    private int age;
    private String typeAnimal;
    private double price;

    public Animal(String name, int age, String typeAnimal, double price) {
            this.name = name;
            this.age = age;
            this.typeAnimal = typeAnimal;
            this.price = price;
    }

    public void feed(String name) {
            System.out.println(name + " está siendo alimentado");
    }
    @Override
    public String toString() {
        return "Nombre: " + name + ", edad: " + age + ", tipo: " + typeAnimal + ", precio: " + price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public double getPrice() {
        return price;
    }
}


