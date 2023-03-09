package seminar1.child;

import seminar1.parent.Animal;

public class Wolf extends Animal {
    public Wolf(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s ����: ����!%n", getType());
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
        System.out.println(getType() + ": ���������");
    }

    private void findFood() {
        String out = String.format("%s: ����� ���%n", getType());
        System.out.print(out);
    }

    private void eat() {
        System.out.printf("%s: ����%n", getType());
    }

    private void goToSleep() {
        System.out.printf("%s: �����%n%n", getType());
    }

    @Override
    public void fly() {
        System.out.println("���, �� ���� �� ����� ������");
    }

    @Override
    public void toGo() {
        System.out.printf("%s ����-�� �����%n", this.getType());
    }

    @Override
    public void swim() {
        System.out.printf("%s ����-�� ������%n", this.getType());
    }
}

