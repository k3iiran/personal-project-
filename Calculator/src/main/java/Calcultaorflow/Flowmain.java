package Calcultaorflow;
import java.awt.*;

public class Flowmain {
	public static void main(String[] args) {
		Frame F= new Frame("Marks");
		TextField T1= new TextField(10);
		TextField T2= new TextField(10);
		TextField T3= new TextField(10);
		Label L1= new Label("Regno N0");
		Label L2= new Label("Name");
		Label L3= new Label("Marks");
		Label L4= new Label(""); 
		Button B1= new Button("Save");
		FlowLayout Flow= new FlowLayout();
		F.setLayout(Flow);
		F.add(L1);
		F.add(T1);
		F.add(L2);
		F.add(T2);
		F.add(L3);
		F.add(T3);
		F.add(L4);
		F.add(B1);
		F.setSize(235,300);
		F.setVisible(true);
	}
}
