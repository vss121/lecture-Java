import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ex06 extends JFrame {

	public ex06() {
		setTitle("9�� 6������");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		for (int i = 0; i < 20; i++) {
			int x = (int) (Math.random() * 200) + 50;
			int y = (int) (Math.random() * 200) + 50;
			
			JLabel label = new JLabel((int)(Math.random() * 100)+"");

			label.setBounds(x, y, 20, 20);
			label.setOpaque(true);
			label.setBackground(Color.red);
			c.add(label);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex06();
	}
}