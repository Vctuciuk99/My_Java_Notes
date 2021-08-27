import javax.swing.JOptionPane;
public class Simple_Gui {
	public static void main(String[]args) {
		
		String name = JOptionPane.showInputDialog("Enter you name:");
		JOptionPane.showMessageDialog(null,"Hello"+ name);
		
		//parseInt method convert input dialog into integer
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age:"));
		JOptionPane.showMessageDialog(null,"Your age is" + age + "years old!");
		
		//same thing with double parseDouble will convert input dialog into double
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height in cm:"));
		JOptionPane.showMessageDialog(null,"Your height is" + age + "cm");
		
	}
}
