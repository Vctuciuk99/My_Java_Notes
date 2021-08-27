
public class SwapVariables {
	public static void main(String[]args) {
		int x = 100;
		int y = 150;
		int z;
		
		//integer z will be temporary variable
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
