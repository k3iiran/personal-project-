package Numberconverter;
import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.sql.ResultSet;

public class Dataview extends Frame {
	TextField Regno, Name, Marks; ResultSet Records;
	Label L1, L2, L3;
	Button Back, Next;
	public Dataview() {
		Regno= new TextField();
		Name= new TextField();
		Marks= new TextField();
		L1= new("Regno");
		L2= new("Name");
		L3= new("Marks");
		Back= new Button("Back");
		Next= new Button("Next");
		GridLayout Grid= new GridLayout(4,4);
		setLayout(Grid);
		add(new label());
		add(new L1);
		add(new Regno);
		add(new label());
		add(new label());
		add(new L2);
		add(new Name);
		add(new label());
		add(new label());
		add(new L3);
		add(new Marks);
		add(new label());
		add(new Back);
		add(new label());
		add(new label());
		add(new Next);
	
		
		
		
		
	}
	
	
	
}
