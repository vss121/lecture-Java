public class Circle3 {
	int radius;
	String name;

	public Circle3() { // �Ű� ���� ���� ������
		radius = 1;
		name = ""; // radius�� �ʱⰪ�� 1
	}

	public Circle3(int r, String n) { // �Ű� ������ ���� ������
		radius = r;
		name = n;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle3 pizza = new Circle3(10, "�ڹ�����"); // Circle ��ü ����, ������ 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		Circle3 donut = new Circle3(); // Circle ��ü ����, ������ 1
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}
}