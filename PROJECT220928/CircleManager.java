import java.util.Scanner;
class Circle {
   private double x, y;
   private int radius;
   public Circle(double x, double y, int radius) {
      this.x = x; //x, y, radius �ʱ�ȭ
      this.y =y;
      this.radius = radius;
   }
   public void show() {
      System.out.println("(" + x + "," + y + ")"+ radius);
   }
   public int getRadius() {
      return radius;
   }
}

public class CircleManager {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      Circle c[] = new Circle[3]; // 3���� Circle �迭 ����
      int max=0; 
      for(int i=0; i < c.length; i ++) {
         System.out.print("x, y, radius >>");
         double x = sc.nextDouble(); // x�� �б�.
         double y = sc.nextDouble(); // y�� �б�.
         int radius = sc.nextInt(); // radius�� �б�.
         c[i] = new Circle(x, y, radius); // Circle ��ü ����
      }
      for(int i=0; i<c.length; i++) 
         if(max < c[i].getRadius())
            max = c[i].getRadius();
      for(int i=0; i<c.length; i++)
         if(max == c[i].getRadius()) {
            System.out.print("���� ������ ū ���� ");
            c[i].show();
         }
      sc.close();
   }

}