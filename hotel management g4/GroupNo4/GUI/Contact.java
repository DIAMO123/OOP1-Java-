package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contact extends JFrame implements ActionListener
{

    ImageIcon icon, img;
    JLabel add, phone, mail, web, fb ;

    JButton back;
    Font f1,f2;
    Container c;
    Cursor cur;
    Contact()
    {
        super("Employee Login"); // Frame Title
        this.setBounds(0,0,1920,1080);// Frame Size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Backgroud Operation close

        //this part changes the icon
        icon=new ImageIcon(getClass().getClassLoader().getResource("IMAGE/hotel_icon.png")); //Interface Icon Location
        this.setIconImage(icon.getImage());// Interface Icon Set

        c=this.getContentPane();// retrive the content pane that can add object
        c.setLayout(null);
        c.setBackground(Color.WHITE);// set Background Color
        f1=new Font("Arial", Font.BOLD,22);//set Hotel_name font details
        f2=new Font("Airal", Font.ITALIC, 14);//set tag_line font details
        cur =new Cursor(Cursor.HAND_CURSOR); //Cursor for button

        add =new JLabel("Address: KURATOLI ROAD ");
        add.setBounds(310, 160, 500, 60);
        c.add(add);

        phone =new JLabel("PHONE: 1234567 ");
        phone.setBounds(310, 220, 500, 60);
        c.add(phone);

        mail =new JLabel("MAIL: mail@diamondhotel.com ");
        mail.setBounds(310, 280, 500, 50);
        c.add(mail);

        web =new JLabel("WEB: diamondhotel.com");
        web.setBounds(310, 340, 500, 50);
        c.add(web);

        add =new JLabel("FACEBOOK: fb/diamond hotel ");
        add.setBounds(310, 400, 500, 50);
        c.add(add);

        back = new JButton("Back");
        back.setBounds(310, 460, 100, 30);
        back.setFont(f2);
        back.setCursor(cur);
        c.add(back);
        back.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(back))
        {
            this.dispose();
            this.setVisible(false);
            new Homepage().setVisible(true);
        }
    }


}
