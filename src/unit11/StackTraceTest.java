package unit11;

import java.util.Scanner;

public class StackTraceTest {
	public void startTest(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = in.nextInt();
		factories(n);
	}
	
	public static int factories(int n){
		System.out.println("factorial(" + n + ")");
		Throwable t = new Throwable();
		StackTraceElement[] frames = t.getStackTrace();
		for(StackTraceElement s : frames){
			System.out.println(s);
		}
		int r;
		if(n <= 1)
			r = 1;
		else{
			r = n * factories(n - 1);
		}
		System.out.println("return " + r);
		return r;
	}
}
