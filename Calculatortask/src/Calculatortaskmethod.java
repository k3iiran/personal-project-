import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventHandlerV1 implements ActionListener {
    private TextField screen;
    public EventHandlerV1(TextField screen) {
        this.screen  = screen;
    }
    public void actionPerformed(ActionEvent AE) {
        Button button = (Button) AE.getSource();
        if(button.getLabel().equals("AC")) {
        	
        }
        else {
        	screen.setText(screen.getText() + button.getLabel());
        }
        System.out.println(button.getLabel());
    }
    
}