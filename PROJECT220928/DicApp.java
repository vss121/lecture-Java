import java.util.Scanner;

class Dictionary {
   private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
   private static String[] eng = {"love", "baby", "money", "future","hope"};
   public static String kor2Eng(String word) { /*�˻� �ڵ� �ۼ�*/ 
      for(int i=0; i<kor.length;i++) {
         if(word.equals(kor[i])) {
            if(i%2==0) 
               System.out.print(word+"�� ");
            else
               System.out.print(word+"�� ");
            return eng[i];
         }
      }
      return "false";
   }
}

public class DicApp {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
      while(true) {
         System.out.print("�ѱ� �ܾ�?");
         String search = sc.next();
         if(search.equals("�׸�")) break;
         String eng = Dictionary.kor2Eng(search);
         if(eng.equals("false"))
            System.out.println(search+"�� ���� ������ �����ϴ�.");
         else 
            System.out.println(eng);
      }
      sc.close();
   }

}