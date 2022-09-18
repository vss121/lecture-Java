import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 기숙사 여부 입력 (빈칸으로 구분)");
		Scanner scanner = new Scanner(System.in);	// scanner 객체 생성

		String name = scanner.next(); 	// String 형 입력 및 리턴 (공백 기준)
		System.out.println("이름 : "+name+", ");
		
		String city = scanner.next();
		System.out.println("도시 : "+city+", ");
		
		int age = scanner.nextInt(); 	// int 형 입력 및 리턴
		System.out.println("나이: "+age+"살, ");
		
		
		double weight = scanner.nextDouble(); 
		System.out.println("체중: "+weight+"kg, ");
		
		boolean isDormitory = scanner.nextBoolean(); 
		System.out.println("기숙사 여부: "+isDormitory+"입니다. ");
		
		scanner.close();
	}

}
