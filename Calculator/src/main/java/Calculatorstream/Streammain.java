package Calculatorstream;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Streammain {
	public static void main(String[] args) {
		Frame F= new Frame("Windows");
		final TextField T1= new TextField(10);
		final TextField T2= new TextField(10);
		final TextField T3= new TextField(10);
		
		Label L1= new Label("First N0");
		Label L2= new Label("Second N0");
		Label L3= new Label("Result");
		Label error= new Label();
		
		Button B1= new Button("+");
		Button B2= new Button("-");
		Button B3= new Button("*");
		Button B4= new Button("/");
		
		FlowLayout Flow= new FlowLayout();
		F.setLayout(Flow);
		
		F.add(L1);
		F.add(T1);
		F.add(L2);
		F.add(T2);
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);
		F.add(L3);
		F.add(T3);
		F.add(error);
		B1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent J) {
            int B;
            int A, C;
            A = Integer.parseInt(T1.getText());
            B = Integer.parseInt(T2.getText());
            C = A + B;
            T3.setText(Integer.toString(C));
        }
		});
    B2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent J) {
            int B;
            int A, C;
            A = Integer.parseInt(T1.getText());
            B = Integer.parseInt(T2.getText());
            C = A - B;
            T3.setText(Integer.toString(C));
        }
    });
    B3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent J) {
            int B;
            int A, C;
            A = Integer.parseInt(T1.getText());
            B = Integer.parseInt(T2.getText());
            C = A * B;
            T3.setText(Integer.toString(C));
        }
    });
    B4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent J) {
            int B;
            int A, C;
            A = Integer.parseInt(T1.getText());
            B = Integer.parseInt(T2.getText());
            C = A / B;
            T3.setText(Integer.toString(C));
        }
    });
    F.setSize(400, 400);
    F.setVisible(true);
}
}
