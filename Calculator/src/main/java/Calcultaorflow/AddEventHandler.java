package Calcultaorflow;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class AddEventHandler implements ActionListener {
	TextField Txt1, Txt2, Txt3;
	Label error;
	public AddEventHandler(TextField T1, TextField T2, TextField T3, Label e) {
		Txt1=T1;
		Txt2=T2;
		Txt3=T3;
		error=e;
	}	
	public void actionPerformed(ActionEvent E) {
		int Result;
	try {
		Result= Integer.parseInt(Txt1.getText())+Integer.parseInt(Txt2.getText());
		Txt3.setText(Integer.toString(Result));
	}
	catch(NumberFormatException fe) {
		error.setText("Digits only please");
		}
	}
}
		