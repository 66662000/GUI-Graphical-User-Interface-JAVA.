import javax.swing.JOptionPane;
public class GUImain {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Plse type your name");
		JOptionPane.showMessageDialog(null, "Hello "+name+" how are you doing?");
		int age= Integer.parseInt(JOptionPane.showInputDialog("Plse type your age"));
		JOptionPane.showConfirmDialog(null, "You are "+age+" years old");
		double height= Double.parseDouble(JOptionPane.showInputDialog("What is your height? "));
		JOptionPane.showConfirmDialog(null, "You are "+height+" cm tall");
		
	}

}
