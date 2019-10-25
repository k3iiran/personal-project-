package AnnonymousClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows {
	public static void main(String[] args) {
		Frame F= new Frame();
		Button B1 = new Button("A");
		Button B2 = new Button ("B");
		F.setLayout(new GridLayout(1,2));
		B1.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent x) {
						System.out.println("A is clicked");
					}
				});
		F.add(B1);
		F.add(B2);
		B2.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent J) {
						System.out.println("B is clicked");
						
					}
				});	
		F.setSize(400,400);
		F.setVisible(true);
	}
}
	
