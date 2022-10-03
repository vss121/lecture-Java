class Rectangle2 {
   private int x;
   private int y;
   private int width;
   private int height;
   
   Rectangle2(int x, int y, int width, int height) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }
   public void show() {
      System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
   }
   public int square() {
      return (width*height);
   }
   boolean contains(Rectangle2 r) {
      if(x < r.x && y < r.y)
         if((width+x) > (r.x+r.width) && (height+y) > (r.y+r.height))
            return true;
      return false;
   }
}

public class ex04 {

   public static void main(String[] args) {
     
      Rectangle2 r = new Rectangle2(2, 2, 8, 7);
      Rectangle2 s = new Rectangle2(5, 5, 6, 6);
      Rectangle2 t = new Rectangle2(1, 1, 10, 10);
      
      r.show();
      System.out.println("s�� ������ "+s.square());
      if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
      if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
   }

}