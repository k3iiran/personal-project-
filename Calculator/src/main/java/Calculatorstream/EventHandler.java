package Calculatorstream;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
	TextField Txt1, Txt2, Txt3;
	Label error;
	public EventHandler(TextField T1, TextField T2, TextField T3, Label er) {
		Txt1=T1;
		Txt2=T2;
		Txt3=T3;
		error=er;
	}
	public void actionPerformed(ActionEvent ae) {
		int a,b,c;
		c=0;
		Button Btn;
		Btn=(Button)ae.getSource();
		String sign= Btn.getLabel();
		a= Integer.parseInt(Txt1.getText());
		b= Integer.parseInt(Txt2.getText());
		if(sign.equals("+"))
			c=a+b;
			Txt3.setText(Integer.toString(c));
		if(sign.equals("-"))
			c=a-b;
			Txt3.setText(Integer.toString(c));
		if(sign.equals("*"))
			c=a*b;
			Txt3.setText(Integer.toString(c));
		if(sign.equals("/"))
			c=a/b;
			Txt3.setText(Integer.toString(c));
		}
	}
