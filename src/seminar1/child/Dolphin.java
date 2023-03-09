package seminar1.child;

import seminar1.parent.Animal;

public class Dolphin extends Animal {
    public Dolphin(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал что-то неслышимое человеческому уху...%n", getType());
    }

    @Override
    public void toGo() {
        System.out.println("увы, но дельфин не умеет ходить, у него нет лап");
    }

    @Override
    public void fly() {
        System.out.println("увы, но дельфин не умеет летать, у него нет крыльев");
    }

    @Override
    public void swim() {
        System.out.printf("%s куда-то поплыл%n", getType());
    }


}
