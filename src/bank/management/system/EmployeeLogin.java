package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeLogin extends JFrame implements ActionListener {
    JLabel label1,label2,label3,label4;
    JTextField text1,text2,text3,text4;
    JPasswordField password1;
    JButton button1;
    EmployeeLogin(){

        super("This is Employee Login");

        label1 = new JLabel("Enter Employee id");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("AvantGarde",Font.BOLD,10));
        label1.setBounds(140,100,450,40);
        add(label1);
        text1 = new JTextField(10);
        text1.setForeground(Color.BLACK);
        text1.setFont(new Font("AvantGarde",Font.BOLD,10));
        text1.setBounds(250,110,100,20);
        add(text1);

        label2 = new JLabel("Enter name");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("AvantGarde",Font.BOLD,10));
        label2.setBounds(140,140,450,40);
        add(label2);
        text2 = new JTextField(10);
        text2.setForeground(Color.BLACK);
        text2.setFont(new Font("AvantGarde",Font.BOLD,10));
        text2.setBounds(250,150,100,20);
        add(text2);

        label3 = new JLabel("Enter password");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("AvantGarde",Font.BOLD,10));
        label3.setBounds(140,180,450,40);
        add(label3);
        password1 = new JPasswordField(10);
        password1.setForeground(Color.BLACK);
        password1.setFont(new Font("AvantGarde",Font.BOLD,10));
        password1.setBounds(250,190,100,20);
        add(password1);

        label4 = new JLabel("Enter position");
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("AvantGarde",Font.BOLD,10));
        label4.setBounds(140,220,450,40);
        add(label4);
        text4 = new JTextField(10);
        text4.setForeground(Color.BLACK);
        text4.setFont(new Font("AvantGarde",Font.BOLD,10));
        text4.setBounds(250,230,100,20);
        add(text4);

        button1 = new JButton("Login");
        button1.setForeground(Color.BLACK);
        button1.setFont(new Font("AvantGarde",Font.BOLD,10));
        button1.setBounds(150,300,100,40);
        add(button1);
        button1.addActionListener(this);









        setSize(500,500);
        setLayout(null);
        setLocation(360,40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (text1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }
            else if (e.getSource() == button1) {
                new EmployeeWindow();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new EmployeeLogin();

    }


}
