package seminar1.child;

import seminar1.parent.Animal;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s ������: ���!%n", getType());
    }

    @Override
    public void fly() {
        System.out.println("���, �� ������ �� ����� ������");
    }

    @Override
    public void toGo() {
        System.out.printf("%s ����-�� �����%n", this.getType());
    }

    @Override
    public void swim() {
        System.out.printf("%s ����-�� �������%n", this.getType());
    }
}
