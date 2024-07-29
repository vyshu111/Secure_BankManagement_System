package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel label1,label2;
    Button button1,button2,button3;
    Login(){
        super("Bank Managemet System");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bankimage.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/cardimage.png"));
        Image ii2=ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3= new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(650,350,100,100);
        add(iimage);



        label1= new JLabel("Welcome to Bank Management System");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,20));
        label1.setBounds(240,125,450,40);
        add(label1);

        button1=new Button("Customer Login");
        button1.setBounds(300,155,100,40);
        button1.setBackground(Color.blue);
        button1.setFont(new Font("AvantGarde",Font.BOLD,10));
        button1.addActionListener(this);
        add(button1);

        button2=new Button("Employee Login");
        button2.setBounds(300,200,100,35);
        button2.setBackground(Color.blue);
        button2.setFont(new Font("AvantGarde",Font.BOLD,10));
        button2.addActionListener(this);
        add(button2);

        button3=new Button("Admin Login");
        button3.setBounds(300,240,100,38);
        button3.setBackground(Color.blue);
        button3.setFont(new Font("AvantGarde",Font.BOLD,10));
        button3.addActionListener(this);
        add(button3);

        label2=new JLabel("Thankyou For Choosing Our Bank");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("AvantGarde",Font.ITALIC,15));
        label2.setBounds(240,290,450,40);
        add(label2);



        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/background.png"));
        Image iii2=iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3= new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);








        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){
                new CustomerLogin();

            }
            else if(e.getSource()==button2){
                new EmployeeLogin();


            }
            else if(e.getSource()==button3){
                new AdminLogin();

            }

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}