package seminar1.child;

import seminar1.parent.Animal;

public class Titmouse extends Animal {
    public Titmouse(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s пропищала что-то непонятное!%n", getType());
    }

    @Override
    public void fly() {
        System.out.printf("%s полетела!%n", getType());
    }

    //возможно, синица умеет плавать, но для разнообразия
    //исходим из того, что нет
    @Override
    public void swim() {
        System.out.println("увы, но синица не умеет плавать");
    }

    @Override
    public void toGo() {
        System.out.printf("%s куда-то пошла%n", getType());
    }
}
