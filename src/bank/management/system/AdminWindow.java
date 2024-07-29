package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminWindow extends JFrame implements ActionListener {
    JButton button1,button2;
    AdminWindow(){
        super("This is Admin Window");

        button1 = new JButton("Customer details");
        button1.setForeground(Color.BLACK);
        button1.setFont(new Font("Arial",Font.BOLD,20));
        button1.setBounds(100,100,200,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Employee details");
        button2.setForeground(Color.BLACK);
        button2.setFont(new Font("Arial",Font.BOLD,20));
        button2.setBounds(100,150,200,30);
        button2.addActionListener(this);
        add(button2);


        setSize(500,500);
        setLayout(null);
        setLocation(250,250);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){
                new CustomerDetails();
            }
            else if(e.getSource()==button2){
                new EmployeeDetails();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new AdminWindow();

    }


}
