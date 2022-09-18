
public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		int a=3, b=3, c=3;
		a+=3;	//6
		b*=3;	//9
		c%=2;	//1
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		int d=3;
		a=d++;
		System.out.println("a="+a+", d="+d);	//3, 4
		a=++d;
		System.out.println("a="+a+", d="+d);	//5, 5
		a=d--;
		System.out.println("a="+a+", d="+d);	//5, 4
		a=--d;
		System.out.println("a="+a+", d="+d);	//3, 3

	}

}
