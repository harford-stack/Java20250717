package day17;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz1 extends JFrame{
	
	public Quiz1() {
		setTitle("Quiz1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		Random ran = new Random();
		
		for(int i=1; i<=10; i++) {
			JButton btn = new JButton(i + "번 버튼");
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					btn.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
				}
			});
			c.add(btn);
		}
		
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Quiz1();
	}

}
