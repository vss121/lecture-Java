import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ����� ���� �Է� (��ĭ���� ����)");
		Scanner scanner = new Scanner(System.in);	// scanner ��ü ����

		String name = scanner.next(); 	// String �� �Է� �� ���� (���� ����)
		System.out.println("�̸� : "+name+", ");
		
		String city = scanner.next();
		System.out.println("���� : "+city+", ");
		
		int age = scanner.nextInt(); 	// int �� �Է� �� ����
		System.out.println("����: "+age+"��, ");
		
		
		double weight = scanner.nextDouble(); 
		System.out.println("ü��: "+weight+"kg, ");
		
		boolean isDormitory = scanner.nextBoolean(); 
		System.out.println("����� ����: "+isDormitory+"�Դϴ�. ");
		
		scanner.close();
	}

}
