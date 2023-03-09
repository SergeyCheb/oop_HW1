package seminar1.child;

import seminar1.parent.Animal;

public class Duck extends Animal {
    public Duck(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Кря!%n", getType());
    }

    @Override
    public void fly() {
        System.out.printf("%s полетела!%n", getType());
    }

    @Override
    public void swim() {
        System.out.printf("%s поплыла!%n", getType());
    }

    @Override
    public void toGo() {
        System.out.printf("%s куда-то пошла%n", getType());
    }
}
