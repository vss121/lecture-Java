
public class BitOperator {

	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		//��Ʈ �� ����
		System.out.println("[��Ʈ ���� ���]");
		System.out.printf("%04x\n", (short)(a & b)); // ��Ʈ AND 
		System.out.printf("%04x\n", (short)(a | b)); // ��Ʈ OR 
		System.out.printf("%04x\n", (short)(a ^ b)); // ��Ʈ XOR 
		System.out.printf("%04x\n", (short)(~a)); // ��Ʈ NOT
	}

}
