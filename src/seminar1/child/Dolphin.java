package seminar1.child;

import seminar1.parent.Animal;

public class Dolphin extends Animal {
    public Dolphin(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s ������ ���-�� ���������� ������������� ���...%n", getType());
    }

    @Override
    public void toGo() {
        System.out.println("���, �� ������� �� ����� ������, � ���� ��� ���");
    }

    @Override
    public void fly() {
        System.out.println("���, �� ������� �� ����� ������, � ���� ��� �������");
    }

    @Override
    public void swim() {
        System.out.printf("%s ����-�� ������%n", getType());
    }


}
