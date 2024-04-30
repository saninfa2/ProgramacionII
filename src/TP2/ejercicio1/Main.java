package TP2.ejercicio1;

public class Main {
    public static void main(String[] args) {
        PetShop petStore = new PetShop();

        Dog dog = new Dog("Max", 3, 200, "Labrador", true);
        Cat cat = new Cat("Pacha", 5, 150, "Sin especificar", false);
        Bird bird = new Bird("Cacatua", 2, 50, "Cacatua", true);
        Fish fish = new Fish("Nemo", 1, 20);

        petStore.addAnimal(dog);
        petStore.addAnimal(cat);
        petStore.addAnimal(bird);
        petStore.addAnimal(fish);

        petStore.lsAnimals();

        petStore.saleAnimal("Pacha");
        petStore.feedAnimal("Max");
    }
}
