import java.awt.event.*;
public class BEventhandler implements ActionListener {
}
	TextField TXT;
	public BEventhandler(TextField x) {
		TXT=x;
	}
	public void ActionPerformed(ActionEvent e) {
		TXT.setText("Hello my friends");
}