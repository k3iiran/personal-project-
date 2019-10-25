package RadioButtons;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.*;

public class RadioButtonMain {
	public static void main(String[] args) {
		Frame F= new Frame();
		Button B1;
		JRadioButton JRB1, JRB2, JRB3, JRB4;
		TextField T1, T2, T3;
		Label L1, L2, L3;
		L1= new Label("First No");
		L2= new Label("Second No");
		L3= new Label("Result");
		T1= new TextField();
		T2= new TextField();
		T3= new TextField();
		B1= new Button("Equals");
		JRB1= new JRadioButton("Addition");
		JRB2 = new JRadioButton("Subtraction");
		JRB3 = new JRadioButton("Multiplication");
		JRB4 = new JRadioButton("Division");
		F.setLayout(new GridLayout(8,2));
		F.add(L1);
		F.add(T1);
		F.add(L2);
		F.add(T2);
		F.add(JRB1);
		F.add(new Label());
		F.add(JRB2);
		F.add(new Label());
		F.add(JRB3);
		F.add(new Label());
		F.add(JRB4);
		F.add(new Label());
		F.add(B1);
		F.add(new Label());
		F.add(L3);
		F.add(T3);
		F.setSize(400,400);
		F.setVisible(true);
		
		ButtonGroup BG= new ButtonGroup();
		BG.add(JRB1);
		BG.add(JRB2);
		BG.add(JRB3);
		BG.add(JRB4);
	}
}