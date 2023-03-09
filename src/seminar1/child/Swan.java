package seminar1.child;

import seminar1.parent.Animal;

public class Swan extends Animal {
    public Swan(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s ������ ���-�� ����������!%n", getType());
    }

    @Override
    public void fly() {
        System.out.printf("%s �������!%n", getType());
    }

    @Override
    public void swim() {
        System.out.printf("%s ������!%n", getType());
    }

    @Override
    public void toGo() {
        System.out.printf("%s ����-�� �����%n", getType());
    }
}
