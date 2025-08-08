package day17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame {

	public ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		Random ran = new Random();

		c.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
//					int r = (int) (Math.random() * 256);
//					int g = (int) (Math.random() * 256);
//					int b = (int) (Math.random() * 256);
//					int r = (int) (ran.nextInt() * 256);
//					int g = (int) (ran.nextInt() * 256);
//					int b = (int) (ran.nextInt() * 256);
					c.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
				}
			}
		});

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ClickAndDoubleClickEx();
	}

}
