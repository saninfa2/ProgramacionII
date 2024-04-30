package TP2.ejercicio1;

import java.util.List;
import  java.util.ArrayList;
class PetShop {
    private final List<Animal> animals;

    public PetShop() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " fue agregado a la tienda de mascotas.");
    }

    public void saleAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                animals.remove(animal);
                System.out.println(animal.getName() + " fue vendido");
                return;
            }
        }
        System.out.println("Animal no encontrado");
    }

    public void feedAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                animal.feed(name);
                return;
            }
        }
        System.out.println("Animal no encontrado");
    }

    public void lsAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
