package day17;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {

	private JLabel la = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		 setTitle("MouseListener와MouseMotionListener예제");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setLayout(new FlowLayout());
		 
		 c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				 la.setText("MouseReleased ("+e.getX()+", "+e.getY()+")");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				la.setText("mousePressed ("+e.getX()+", "+e.getY()+")");				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				c.setBackground(Color.CYAN);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		 
		 c.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				la.setText("mousePressed ("+e.getX()+", "+e.getY()+")");
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				la.setText("mousePressed ("+e.getX()+", "+e.getY()+")");
			}
		});
		 
		 c.add(la);
		 setSize(300,200);
		 setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}

}
