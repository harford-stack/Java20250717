package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		setTitle("ContentPane과JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
//		contentPane.setBackground(Color.ORANGE); // 자주 쓰는 색상은 상수 처리 되어 있음
		contentPane.setBackground(new Color(200, 150, 20)); // RGB // 0~255
		
		contentPane.setLayout(new FlowLayout()); // 배치 관리
		
//		JButton btn1 = new JButton("OK"); // 생략됨 // 원래는 btn1을 아랫줄 "OK" 대신에 넣었어야 함
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JCheckBoxMenuItem());
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
