package seminar1.child;

import seminar1.parent.Animal;

public class Titmouse extends Animal {
    public Titmouse(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s ��������� ���-�� ����������!%n", getType());
    }

    @Override
    public void fly() {
        System.out.printf("%s ��������!%n", getType());
    }

    //��������, ������ ����� �������, �� ��� ������������
    //������� �� ����, ��� ���
    @Override
    public void swim() {
        System.out.println("���, �� ������ �� ����� �������");
    }

    @Override
    public void toGo() {
        System.out.printf("%s ����-�� �����%n", getType());
    }
}
