package day16;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {

	public GridLayoutEx() {
		setTitle("GridLayoutSample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5); // 따로 메소드 호출을 통해서도 가능 // 윗줄 생성자에서 3, 4번째 파라미터에 넣어서 해도 되고
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
