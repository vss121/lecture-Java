import java.util.Scanner;

public class ex08 {
	   public static void main(String[] args) {

		      Scanner sc = new Scanner(System.in);
		      int arr[];
		      int num;
		      
		      System.out.print("���� �? >> ");
		      num = sc.nextInt();
		      
		      arr = new int[num];
		      for(int i=0; i<arr.length; i++) {
		         arr[i] = (int)(Math.random()*100+1);
		         for(int j=0; j<i; j++)
		            if(arr[i]==arr[j])
		               i--;
		      }
		      
		      for(int i=0; i<arr.length; i++) {
		         if(i%10 == 0 && i != 0) System.out.println();
		         System.out.print(arr[i] + " ");
		      }
		      
		      sc.close();
		   }
}
