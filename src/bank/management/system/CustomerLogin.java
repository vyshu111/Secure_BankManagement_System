package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerLogin extends JFrame implements ActionListener {
    JLabel label4,label5,label6;
    JTextField textField1;
    JPasswordField passwordField2;
    JButton Button4,Button5,Button6;

    CustomerLogin() {
        super("This is Customer Login");


        label4= new JLabel("Welcome to Bank Management System");
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("AvantGarde",Font.BOLD,20));
        label4.setBounds(240,125,450,40);
        add(label4);

        label5= new JLabel("Card No:");
        label5.setForeground(Color.BLACK);
        label5.setFont(new Font("AvantGarde",Font.BOLD,15));
        label5.setBounds(240,190,450,40);
        add(label5);

        textField1 = new JTextField(15);
        textField1.setFont(new Font("AvantGarde",Font.BOLD,14));
        textField1.setBounds(325,190,150,30);
        add(textField1);

        label6= new JLabel("PIN:");
        label6.setForeground(Color.BLACK);
        label6.setFont(new Font("AvantGarde",Font.BOLD,15));
        label6.setBounds(240,250,450,40);
        add(label6);


        passwordField2 = new JPasswordField();
        passwordField2.setFont(new Font("AvantGarde",Font.BOLD,20));
        passwordField2.setBounds(325,250,150,30);
        add(passwordField2);

        Button4 = new JButton("SIGN IN");
        Button4.setFont(new Font("AvantGarde",Font.BOLD,14));
        Button4.setForeground(Color.black);
        Button4.setBounds(225,290,100,30);
        Button4.addActionListener(this);
        add(Button4);

        Button5 = new JButton("CLEAR");
        Button5.setFont(new Font("AvantGarde",Font.BOLD,14));
        Button5.setForeground(Color.black);
        Button5.setBounds(350,290,100,30);
        Button5.addActionListener(this);
        add(Button5);

        Button6 = new JButton("SIGN UP");
        Button6.setFont(new Font("AvantGarde",Font.BOLD,14));
        Button6.setForeground(Color.black);
        Button6.setBounds(300,330,100,30);
        Button6.addActionListener(this);
        add(Button6);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(800,600);
        setLocation(360,40);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ev) {
        try{
            if(ev.getSource()==Button4){

            }
            else if(ev.getSource()==Button5){
                textField1.setText("");
                passwordField2.setText("");

            }
            else if(ev.getSource()==Button6){
                new SignUp();

            }

        }
        catch(Exception exp){
            exp.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new CustomerLogin();

    }
}
