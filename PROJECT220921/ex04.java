import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s;
		char c;

		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>> ");
		s = scanner.next(); 
		c = s.charAt(0); 

		for (int i = 0; i <= c - 'a'; i++) {
			for (char j = 'a'; j <= c - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		scanner.close();
	}	
}
