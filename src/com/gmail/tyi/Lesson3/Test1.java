package com.gmail.tyi.Lesson3;

import javax.swing.JOptionPane;

import com.gmail.tyi.Lesson3.exeptions.NegativeValueExeption;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		for (;;) {
			try {
				a = Double.valueOf(JOptionPane.showInputDialog("Input double number"));
				if (a < 0) {
					throw new NegativeValueExeption("Negative Value!!!");
				}
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				a = 0;
				JOptionPane.showMessageDialog(null, "Cancel");
				break;
			} catch (NegativeValueExeption e) {
				System.out.println(e);
			}
		}

		System.out.println(a);
		JOptionPane.showMessageDialog(null, a);
		
		
	}

}
