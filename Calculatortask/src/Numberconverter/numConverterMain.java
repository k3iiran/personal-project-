package Numberconverter;

import java.awt.TextField;

public class numConverterMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextField t1 = new TextField();
		Numberconverter numC = new Numberconverter();
		String result = numC.convert(6237);
		System.out.println(result);
	}
}