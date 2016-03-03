package unit6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InnerClassTest {
	public void startTest(){
		TalkingClock clock = new TalkingClock(10000, true);
		clock.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
	
	public class TalkingClock{
		private int interval;
		private boolean beep;
		
		public TalkingClock(int interval, boolean beep){
			this.interval = interval;
			this.beep = beep;
		}
		
		public void start(){
			ActionListener lietener = new TimerPrinter();
			Timer timer = new Timer(interval, lietener);
			timer.start();
			
		}
		
		public class TimerPrinter implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(beep)
					System.out.println("hello!!!");
			}
		}
	}
}
