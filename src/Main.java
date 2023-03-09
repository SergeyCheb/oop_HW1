import seminar1.child.*;
import seminar1.parent.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal vaska = new Cat("Васька", "серый");
        Animal wolf = new Wolf("Белый клык", "серый");
        Animal lion = new Lion("Симба", "желтый");
        Animal dolphin = new Dolphin("Дельфин", 0);
        Animal swan = new Swan("Лебедь", 2);

        System.out.println(vaska);
        System.out.println(vaska.getType());

        animal.speak();
        vaska.speak();
        Duck duck = new Duck("пёстрый", 2);
        System.out.println(duck);
        Dog dog = new Dog("Шарик", "рыжий");
        System.out.println("\n\n----------звуки-----------");

        List<Animal> animals = new ArrayList<>();
        animals.add(vaska);
        animals.add(duck);
        animals.add(dog);
        animals.add(animal);
        animals.add(wolf);
        animals.add(lion);
        animals.add(dolphin);
        animals.add(swan);
        animals.forEach(Animal::speak);
        System.out.println("--------летчики------------");

        for (Animal a : animals) {
            a.fly();
        }
        System.out.println("--------плавание------------");

        for (Animal a : animals) {
            a.swim();
        }

        System.out.println("--------ходьба------------");

        for (Animal a : animals) {
            a.toGo();
        }

        System.out.println("\n\n\n--------охота------------");

        vaska.hunt();
        wolf.hunt();
        lion.hunt();
    }
}
