package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class EmployeeWindow extends JFrame {
    JLabel label1;
    public EmployeeWindow() {
        super("Employee window");

        label1=new JLabel("You have successfully logged in");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Italic",Font.BOLD,20));
        label1.setBounds(100,50,350,30);
        add(label1);



        setSize(500,500);
        setLayout(null);
        setLocation(350,40);
        setVisible(true);

    }
    public static void main(String[] args) {
        new EmployeeWindow();
    }
}
