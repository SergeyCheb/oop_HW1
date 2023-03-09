package seminar1.child;

import seminar1.parent.Animal;

public class Wolf extends Animal {
    public Wolf(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s воет: ”ууу!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        toGo();
        findFood();
        eat();
        goToSleep();
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s;%n}", getType(), getName(), getColor(), getLegsCount()
        );
    }

    private void wakeUp() {
        System.out.println(getType() + ": проснулс€");
    }

    private void findFood() {
        String out = String.format("%s: нашел еду%n", getType());
        System.out.print(out);
    }

    private void eat() {
        System.out.printf("%s: поел%n", getType());
    }

    private void goToSleep() {
        System.out.printf("%s: уснул%n%n", getType());
    }

    @Override
    public void fly() {
        System.out.println("увы, но волк не умеет летать");
    }

    @Override
    public void toGo() {
        System.out.printf("%s куда-то пошел%n", this.getType());
    }

    @Override
    public void swim() {
        System.out.printf("%s куда-то поплыл%n", this.getType());
    }
}

