
public class BitOperator {

	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		//비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b)); // 비트 AND 
		System.out.printf("%04x\n", (short)(a | b)); // 비트 OR 
		System.out.printf("%04x\n", (short)(a ^ b)); // 비트 XOR 
		System.out.printf("%04x\n", (short)(~a)); // 비트 NOT
	}

}
