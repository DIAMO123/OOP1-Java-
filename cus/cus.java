//package GUI;


//import CLASS.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class cus extends JFrame implements ActionListener
{
    ImageIcon icon, img;
    Container c;
    JLabel phone, password, bgpic, headTitle;
    JTextField tf1;
    JButton login, clear, backbtn, registerbtn;
    JPasswordField pf;
    Font f1, f2;
    Cursor cur;
    int i;

   public  cus()
    {
        super("Customer Login");
        this.setBounds(0,0,1000,700);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c=this.getContentPane();
        c.setBackground(Color.WHITE);// set Background Color
        f1=new Font("Arial", Font.BOLD,22);//set Hotel_name font details
        f2=new Font("Airal", Font.ITALIC, 14);//set tag_line font details
        cur =new Cursor(Cursor.HAND_CURSOR); //Cursor for button

        // creates head title jlabel

        // this part creates username JLabel
        headTitle = new JLabel();
        headTitle.setText("Customer Login");
        headTitle.setBounds(310, 160, 500, 50);
        headTitle.setFont(f1);
        headTitle.setForeground(Color.WHITE);
        headTitle.setToolTipText("enter your ID");
        c.add(headTitle);

        // this part creates username JLabel
        phone = new JLabel();
        phone.setText("Enter Number");
        phone.setBounds(310, 230, 150, 30);
        phone.setFont(f2);
        phone.setForeground(Color.WHITE);
        phone.setToolTipText("enter your ID");
        c.add(phone);

        // text field
        tf1 = new JTextField();
        tf1.setBounds(475, 230, 200, 30);
        tf1.setFont(f2);
        c.add(tf1);

        // this part creates password JLabel

        password = new JLabel("Enter Password");
        password.setBounds(310, 280, 150, 30);
        password.setFont(f2);
        password.setForeground(Color.WHITE);

        password.setToolTipText("Please enter your password carefully");
        c.add(password);

        // password field
        pf = new JPasswordField();
        pf.setBounds(475, 280, 200, 30);
        pf.setFont(f2);
        pf.setEchoChar('*');
        c.add(pf);

        // cursor for button
        cur = new Cursor(Cursor.HAND_CURSOR);

        // Login button
        login = new JButton("Login");
        login.setBounds(380, 340, 100, 30);
        login.setFont(f2);
        login.setCursor(cur);
        c.add(login);
        //login.addActionListener(this);


        //registration Button
        registerbtn =new JButton("Register");
        registerbtn.setBounds(505,340,100,30);
        registerbtn.setFont(f2);
        registerbtn.setCursor(cur);
        c.add(registerbtn);


        // clear button
        clear = new JButton("Clear");
        clear.setBounds(505, 380, 100, 30);
        clear.setFont(f2);
        clear.setCursor(cur);
        c.add(clear);
        //clear.addActionListener(this);

        // back button
        backbtn = new JButton("Back");
        backbtn.setBounds(380, 380, 100, 30);
        backbtn.setFont(f2);
		backbtn.addActionListener(this);
        clear.setCursor(cur);
        c.add(backbtn);
       

        //Backgroud Image
        img =new ImageIcon(ClassLoader.getSystemResource("IMAGE/Hotel_BG.jpg"));
        bgpic=new JLabel(img);
        bgpic.setBounds(0,0,1000,700);
        c.add(bgpic);
    }




    public void actionPerformed(ActionEvent e)
	{
        // TODO Auto-generated method stub
      /*  if (e.getSource().equals(login)) {
            String phoneNumber = tf1.getText();
            String password = pf.getText();
            String filepath = "DATA/userPass.txt";
            CusLogin2 login = new CusLogin2();
            boolean b = login.verifyLogin(phoneNumber, password, filepath);
            i = login.verifyLogin2(phoneNumber, password, filepath);
            CusDataSeparator cds = new CusDataSeparator();
            cds.dataSeparator(i);
            if (b) {
                dispose();
                String path = "DATA/member.txt";
                CusPanel frame = new CusPanel(path);
                frame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect password or phone number");
            }
			
			else if (e.getSource().equals(clear))
		    {
            dispose();
            tf1.setText("");
            pf.setText("");
            }*/

        // back button
		if(e.getSource().equals(backbtn))
		{
			// Homepage h1 = new Homepage();
			// h1.setVisible(true);
             this.setVisible(false);
		}
        
    }
		

    




}
