import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str[] = { "����", "����", "��" };
		String UserSelect, ComSelect;
		int n; // ��ǻ�Ͱ� ���� ��
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		do {
			System.out.print("���� ���� ��! >> ");
			UserSelect = sc.next();
			if (UserSelect.equals("�׸�"))
				break;
			n = (int) (Math.random() * 3);
			ComSelect = str[n];
			if (UserSelect.equals("����")) {
				if (str[n].equals("����")) {
					System.out.println("����� = " + UserSelect + " , ��ǻ�� = " + ComSelect + " �����ϴ�.");
					continue;
				} else if (str[n].equals("����")) {
					System.out.println("����� = " + UserSelect + " , ��ǻ�� = " + ComSelect + " ����ڰ� �����ϴ�.");
					continue;
				} else if (str[n].equals("��")) {
					System.out.println("����� = " + UserSelect + " , ��ǻ�� = " + ComSelect + " ����ڰ� �̰���ϴ�.");
					continue;
				}
			} else if (UserSelect.equals("����")) {
				if (str[n].equals("����")) {
					System.out.println("����� = " + UserSelect + " , ��ǻ�� = " + ComSelect + " ����ڰ� �̰���ϴ�.");
					continue;
				} else if (str[n].equals("����")) {
					System.out.println("����� = " + UserSelect + " , ��ǻ�� = " + ComSelect + " �����ϴ�.");
					continue;
				} else if (str[n].equals("��")) {
					System.out.println("����� = " + UserSelect + " , ��ǻ�� = " + ComSelect + " ����ڰ� �����ϴ�.");
					continue;
				}
			} else if (UserSelect.equals("��")) {
				if (str[n].equals("����")) {
					System.out.println("����� = " + UserSelect + " , ��ǻ�� = " + ComSelect + " ����ڰ� �����ϴ�.");
					continue;
				} else if (str[n].equals("����")) {
					System.out.println("����� = " + UserSelect + " , ��ǻ�� = " + ComSelect + " ����ڰ� �̰���ϴ�.");
					continue;
				} else if (str[n].equals("��")) {
					System.out.println("����� = " + UserSelect + " , ��ǻ�� = " + ComSelect + " �����ϴ�.");
					continue;
				}
			}
			System.out.print("����� = " + UserSelect + " , ��ǻ�� = " + ComSelect + " ");
		} while (true);
		System.out.println("������ �����մϴ�...");
		sc.close();
	}
}
