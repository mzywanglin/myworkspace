package test;

public class MaximumTest {
	public static <U extends Comparable<U>> U maximum(U x, U y, U z)
	{
		U max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		return max;		
	}
	public static void main(String[] args) {
		System.out.printf("%d, %d 和 %d中最大的数为 %d\n\r", 3, 4, 5, maximum(3,4,5));
		while(true)
		{
			
		}
	}
}
