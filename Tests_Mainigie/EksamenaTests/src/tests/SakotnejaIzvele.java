package tests;

import java.awt.Component;
import javax.swing.JOptionPane;

public class SakotnejaIzvele {

	public static int punkti;

	public static void main(String[] args) {
		int punkti = 0;
		Object[] options = {"Sākt", "Aizvert"};
		Component frame = null;
		int n = JOptionPane.showOptionDialog(frame,
			"Iesākt testu?",
			"Jautājums lietotājam",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[0]);
		
		if (n == 0) {
	        new CheckBoxTests();  
		}
	}
}