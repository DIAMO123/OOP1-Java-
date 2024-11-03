import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener
{
	JLabel label;
	JButton backBtn;
	JPanel panel;
	frame f1;
	public login(){}
	
	public login(String s1,String s2,frame f1)
	{
		super("Login Gui");
		this.setBounds(0,0,1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.f1=f1;
		
		panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel();
		label.setText("WELCOME");
		label.setBounds(0,0,200,30);
		panel.add(label);
		
		
		backBtn = new JButton("Back");
		backBtn.setBounds(150, 150,80, 30);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		this.add(panel);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(backBtn.getText().equals(command))
		{
			frame fi = new frame();
			fi.setVisible(true);
			this.setVisible(false);
		}
		
	}
}