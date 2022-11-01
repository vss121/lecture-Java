import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ex02 extends JFrame {
	ex02() {
		setTitle("BorderLayout Practice");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new BorderLayout(5,7));
		
		c.add(new JButton("North"), BorderLayout.NORTH);  //´ë¹®ÀÚ
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ex02();
	}
}