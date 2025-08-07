package day16;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {
	
	Random ran = new Random();

	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		for (int i = 1; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼생성
			// 윗줄에서 Integer.toString(i)인 이유는 문자열 밖에 못 들어감 // 그래서 편법으로 (i + "") 도 가능 
			b.setLocation(i * 15, i * 15);
			b.setSize(50, 20);
			b.setBackground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256))); // 컬러 랜덤
			c.add(b); // 버튼을 컨텐트팬에 부착
		}
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerEx();
	}

}
