package unit14;

public class ThreadTest {
	public void startTest(){
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 100; ++i){
					System.out.println("1号线程:" + i);
				}
			}
		});
		thread1.start();
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 100; ++i){
					System.out.println("2号线程:" + i);
					if(i == 3)
						Thread.currentThread().interrupt();
					if(i == 20)
						Thread.currentThread().interrupt();
				}
			}
		});
		thread2.start();
	}
	
	
}
