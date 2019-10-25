import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class SaveButton implements ActionListener{
    TextField txt1;
    TextField txt2;
    TextField txt3;
    int regno;
    String name;
    int marks;
    Connection c;
    Statement s;
    public SaveButton(TextField t1, TextField t2, TextField t3) {
        txt1 = t1;
        txt2 = t2;
        txt3 = t3;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/nationwide", "root", "root");
            s = c.createStatement();
            s.executeUpdate("set global time_zone='-1:00';");
        }
        catch(Exception c) {
            System.out.println(c.toString());
        }
    }
    public void actionPerformed(ActionEvent e) {
        regno = Integer.parseInt(txt1.getText());
        name = txt2.getText();
        marks = Integer.parseInt(txt3.getText());
        try {
            s.executeUpdate("insert into tdp values("+regno+",'"+name+"',"+marks+");");
        }
        catch(Exception c) {
            System.out.println(c.toString());
        }
    }
}