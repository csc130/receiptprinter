import java.awt.Font;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import printer.util.Printer;

public class PrinterDemo {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Font f = new Font("Algerian", Font.BOLD, 15);
//		Scanner scan = new Scanner(System.in);
	//	System.out.println("Enter an item name: ")
		String name1 = "\tJames\t\t\t\tSmith\nNicholas\n";
		name1 += "\tJa\t\t\t\tSth\nNic\n";
		name1 += "\tJames\t\t\t\tSmith\nNicholas\n";
		name1 += "\tJames\t\t\t\tSmith\nNicholas\n";
		System.out.println(name1);
		JTextArea jarea = new JTextArea();
		jarea.setFont(f);
		jarea.setText(name1);
		JOptionPane.showMessageDialog(null,jarea);
		//String name2 = new String("Nicholas Test");
		//return ascii code of string class
		System.out.println(name1);
		
		Printer.printToPrinter(name1);
	}
	
}
