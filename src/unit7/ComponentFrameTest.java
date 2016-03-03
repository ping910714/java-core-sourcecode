package unit7;

import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class ComponentFrameTest {
	public void startTest(){
		MyFrame frame = new MyFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = frame.getContentPane();
		MyComponent com = new MyComponent();
		contentPane.add(com);
		frame.setVisible(true);
	}
}

class MyFrame extends JFrame{
	private static final int width = 300;
	private static final int height = 200;
	
	public MyFrame(){
		super.setSize(width, height);
	}
}

class MyComponent extends JComponent{
	private static final int Message_x = 75;
	private static final int Message_y = 100;
	
	public void paintComponent(Graphics g){
		g.drawString("Hello World!!!", Message_x, Message_y);
	}
}
