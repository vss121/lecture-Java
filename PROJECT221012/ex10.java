import java.util.Scanner;
import java.util.Vector;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Shape> v = new Vector<Shape>();
		Shape shape = null;
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		while (true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4) >> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					shape = new Line();
					break;
				case 2:
					shape = new Rect();
					break;
				case 3:
					shape = new Circle();
					break;
				}
				v.add(shape);
				break;
			case 2:
				System.out.print("������ ������ ��ġ >> ");
				int position = sc.nextInt();
				if (v.size() == 0 || v.size() <= position)
					System.out.println("������ �� �����ϴ�.");
				else
					v.remove(position);
				break;
			case 3:
				for (int i = 0; i < v.size(); i++)
					v.get(i).draw();
				break;
			case 4:
				System.out.println("beauty�� �����մϴ�.");
				sc.close();
				return;
			}
		}
	}
}

abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	} // ��ũ ����

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}