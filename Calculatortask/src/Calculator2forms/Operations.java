package Calculator2forms;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Operations {
	Frame F;
	Button B;
	TextField T1, T2, T3;
	public Operations() {
		F = new Frame(); 
		B = new Button();
		T1= new TextField();
		T2= new TextField();
		T3= new TextField();
		F.setLayout(new GridLayout(4,2));
		F.add(new Label("First No"));
		F.add(T1);
		F.add(new Label("Second No"));
		F.add(T2);
		F.add(new Label());
		F.add(B);
		F.add(new Label("Result"));
		F.add(T3);
		B.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int No1= Integer.parseInt(T1.getText());
				int No2= Integer.parseInt(T2.getText());
				int Result=0;
				String sign= B.getLabel();
				if(sign.equals("Addition")) {
					Result= No1+No2;
					T3.setText(Integer.toString(Result));
				}
				if(sign.equals("Subtraction")) {
					Result= No1-No2;
					T3.setText(Integer.toString(Result));
				}
				if(sign.equals("Multiplication")) {
					Result= No1*No2;
					T3.setText(Integer.toString(Result));
				}
				if(sign.equals("Division")) {
					Result= No1/No2;
					T3.setText(Integer.toString(Result));
				}
			}
		});
		F.setSize(400,400);
	}
}
