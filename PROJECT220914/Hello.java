
public class Hello {	// 클래스

	public static int sum(int n, int m) {	// 메소드
		return n+m;
	}
	
	public static void main(String[] args) {	// 메소드
		int i = 20;
		int s;
		char a;
		
		s = sum(i,10);	// 메소드 호출
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);

	}

}
