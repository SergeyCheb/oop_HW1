import seminar1.child.*;
import seminar1.parent.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal vaska = new Cat("������", "�����");
        Animal wolf = new Wolf("����� ����", "�����");
        Animal lion = new Lion("�����", "������");
        Animal dolphin = new Dolphin("�������", 0);
        Animal swan = new Swan("������", 2);

        System.out.println(vaska);
        System.out.println(vaska.getType());

        animal.speak();
        vaska.speak();
        Duck duck = new Duck("������", 2);
        System.out.println(duck);
        Dog dog = new Dog("�����", "�����");
        System.out.println("\n\n----------�����-----------");

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
        System.out.println("--------�������------------");

        for (Animal a : animals) {
            a.fly();
        }
        System.out.println("--------��������------------");

        for (Animal a : animals) {
            a.swim();
        }

        System.out.println("--------������------------");

        for (Animal a : animals) {
            a.toGo();
        }

        System.out.println("\n\n\n--------�����------------");

        vaska.hunt();
        wolf.hunt();
        lion.hunt();
    }
}
