package Calculator2forms;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
	public static void main(String[] args) {
		Frame F = new Frame();
		Button B1, B2, B3, B4;
		B1 = new Button("Addition");
		B2 = new Button("Subtraction");
		B3 = new Button("Multiplication");
		B4 = new Button("Division");
		F.setLayout(new GridLayout(4,2));
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);
		Operations Opt= new Operations();
		B1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				Opt.F.setTitle("Addition");
				Opt.B.setLabel("Addition");
				Opt.F.setVisible(true);
			}
		});
		B2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent E1) {
				Opt.F.setTitle("Subtraction");
				Opt.B.setLabel("Subtraction");
				Opt.F.setVisible(true);
			}
		});
		B3.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent E2) {
				Opt.F.setTitle("Multiplication");
				Opt.B.setLabel("Multiplication");
				Opt.F.setVisible(true);
			}
		});
		B4.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent E3) {
				Opt.F.setTitle("Division");
				Opt.B.setLabel("Division");
				Opt.F.setVisible(true);
			}
		});
		F.setSize(400,400);
		F.setVisible(true);
	}
}