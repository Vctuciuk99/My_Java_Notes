
public class Expression extends $canner {
	public static void main(String []args) {
		//Expression = operand & operators
		//Operand = variables, number, quantity
		//Operators = Math operator like + - * / %
		
		int Apple = 10;
		int Grapes = 10;
		int Orange = 10;
		double pi = 3.14159;
		
		Apple = Apple + 2;
		//increment by 1
		Grapes++;
		//decrement by 1
		Orange--;
		pi = pi * 2;
		System.out.println(Apple);
		System.out.println(Grapes);
		System.out.println(Orange);
		System.out.println(pi);
	}
}
