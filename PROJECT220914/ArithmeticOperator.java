import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ʴ����� ������ �Է��ϼ��� : ");
		int time = scanner.nextInt();
		
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.println(time+"�ʴ� "+hour+"�ð� "+minute+"�� "+second+"�� �Դϴ�.");
		
		scanner.close();
	}

}
