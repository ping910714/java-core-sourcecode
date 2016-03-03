package unit6;

public class StaticInnerClassTest {
	public void startTest(){
		double[] values = new double[20];
		for(int i = 0; i < values.length; i++){
			values[i] = 100 * Math.random();
		}
		ArrayAlg.Pair pair = ArrayAlg.minmax(values);
		System.out.println("min = " + pair.getFirst());
		System.out.println("max = " + pair.getSecond());
	}
}
	
class ArrayAlg{
	
	public static class Pair{
		private double first;
		private double second;
		
		public Pair(double f, double s){
			this.first = f;
			this.second = s;
		}
		
		public double getFirst(){
			return first;
		}
		
		public double getSecond(){
			return second;
		}
	}
	
	public static Pair minmax(double[] values){
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		for(double d : values){
			if(d < min)
				min = d;
			else if(d > max)
				max = d;
		}
		return new Pair(min, max);
	}
}
