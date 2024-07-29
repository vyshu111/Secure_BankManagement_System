package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin extends JFrame implements ActionListener {
    JLabel label1,label2,label3,label4;
    JPasswordField password;
    JTextField text1,text2,text3;
    JButton button;
    AdminLogin() {
        super("This is Admin Login Page");

        label1 = new JLabel("Admin ID");
        label1.setBounds(150,130,150,30);
        label1.setFont(new Font("Arial",Font.BOLD,10));
        label1.setForeground(Color.BLACK);
        add(label1);
        text1 = new JTextField();
        text1.setBounds(250,130,150,30);
        text1.setFont(new Font("Arial",Font.BOLD,10));
        text1.setForeground(Color.BLACK);
        add(text1);

        label2 = new JLabel("password");
        label2.setBounds(150,170,150,30);
        label2.setFont(new Font("Arial",Font.BOLD,10));
        label2.setForeground(Color.BLACK);
        add(label2);


        password = new JPasswordField();
        password.setBounds(250,170,150,30);
        password.setFont(new Font("Arial",Font.BOLD,10));
        password.setForeground(Color.BLACK);
        add(password);

        label3 = new JLabel("Name");
        label3.setBounds(150,210,150,30);
        label3.setFont(new Font("Arial",Font.BOLD,10));
        label3.setForeground(Color.BLACK);
        add(label3);
        text2 = new JTextField();
        text2.setBounds(250,210,150,30);
        text2.setFont(new Font("Arial",Font.BOLD,10));
        text2.setForeground(Color.BLACK);
        add(text2);

        label4 = new JLabel("passkey");
        label4.setBounds(150,250,150,30);
        label4.setFont(new Font("Arial",Font.BOLD,10));
        label4.setForeground(Color.BLACK);
        add(label4);
        text3 = new JTextField();
        text3.setBounds(250,250,150,30);
        text3.setFont(new Font("Arial",Font.BOLD,10));
        text3.setForeground(Color.BLACK);
        add(text3);

        button = new JButton("Login");
        button.setBounds(250,300,150,30);
        button.setFont(new Font("Arial",Font.BOLD,10));
        button.setForeground(Color.BLACK);
        button.addActionListener(this);
        add(button);








        setSize(500,500);
        setLayout(null);
        setLocation(250,250);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button) {
                new AdminWindow();
            }
        }catch(Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new AdminLogin();
    }


}
