package unit7;

import javax.swing.JFrame;

public class SimpleFrameTest {
	
	public void startTest(){
		SimpleFrame frame = new SimpleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}

class SimpleFrame extends JFrame{
	private static final int width = 300;
	private static final int height = 200;
	
	public SimpleFrame(){
		super.setSize(width, height);
	}
}
