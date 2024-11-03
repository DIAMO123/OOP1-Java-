
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Employee1 extends JFrame implements ActionListener {
    private ImageIcon icon, icon2, image;
    private Container c;
    private JTable table;
    private String path;

    private DefaultTableModel model;

    private JLabel titleLabel, fnLabel, lnLabel, phoneLabel, gndLabel, nidLabel,
            daysPerWeekLabel, positionLabel, incomeLabel, bgpic;

    private JButton backButton;
    private JTextField titleTf, fnTf, lnTf, phoneTf, gndTf, nidTf,
            daysPerWeekTf, positionTf, incomeTf;

    Employee1() {

        initComponents();
    }

    private void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        this.setTitle("Employee Panel");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);

        // this part changes the icon
        icon = new ImageIcon(getClass().getResource("icon1.png"));
        this.setIconImage(icon.getImage());

        Font font = new Font("Arial", Font.BOLD, 16);

        titleLabel = new JLabel("Employee Profile Panel");
        titleLabel.setFont(font);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(80, 10, 250, 50);
        c.add(titleLabel);

        // JLabels Start
        fnLabel = new JLabel("First Name");
        fnLabel.setBounds(10, 80, 140, 30);
        fnLabel.setFont(font);
        fnLabel.setForeground(Color.WHITE);
        c.add(fnLabel);

        fnTf = new JTextField();
        fnTf.setBounds(110, 80, 200, 30);
        fnTf.setText("Sarowar");
        fnTf.setEditable(false);
        fnTf.setFont(font);
        c.add(fnTf);

        lnLabel = new JLabel("Last Name ");
        lnLabel.setBounds(10, 130, 140, 30);
        lnLabel.setFont(font);
        lnLabel.setForeground(Color.WHITE);
        c.add(lnLabel);

        lnTf = new JTextField();
        lnTf.setBounds(110, 130, 200, 30);
        lnTf.setText("Khan");
        lnTf.setEditable(false);
        lnTf.setFont(font);
        c.add(lnTf);

        // Phone
        phoneLabel = new JLabel("Phone ");
        phoneLabel.setBounds(10, 180, 140, 30);
        phoneLabel.setFont(font);
        phoneLabel.setForeground(Color.WHITE);
        c.add(phoneLabel);

        phoneTf = new JTextField();
        phoneTf.setBounds(110, 180, 200, 30);
        phoneTf.setText("01999999999");
        phoneTf.setEditable(false);
        phoneTf.setFont(font);
        c.add(phoneTf);

        // Gender
        gndLabel = new JLabel("Gender");
        gndLabel.setBounds(10, 230, 140, 30);
        gndLabel.setFont(font);
        gndLabel.setForeground(Color.WHITE);
        c.add(gndLabel);

        gndTf = new JTextField();
        gndTf.setBounds(110, 230, 200, 30);
        gndTf.setText("Male");
        gndTf.setEditable(false);
        gndTf.setFont(font);
        c.add(gndTf);

        // Nid Number
        nidLabel = new JLabel("Nid Number");
        nidLabel.setBounds(10, 280, 140, 30);
        nidLabel.setFont(font);
        nidLabel.setForeground(Color.WHITE);
        c.add(nidLabel);

        nidTf = new JTextField();
        nidTf.setBounds(110, 280, 200, 30);
        nidTf.setText("0123456789");
        nidTf.setEditable(false);
        nidTf.setFont(font);
        c.add(nidTf);

        daysPerWeekLabel = new JLabel("Working Days");
        daysPerWeekLabel.setBounds(10, 330, 140, 30);
        daysPerWeekLabel.setFont(font);
        daysPerWeekLabel.setForeground(Color.WHITE);
        c.add(daysPerWeekLabel);

        daysPerWeekTf = new JTextField("Sat,Mon,Wed");
        daysPerWeekTf.setBounds(150, 330, 140, 30);
        daysPerWeekTf.setEditable(false);
        daysPerWeekTf.setFont(font);

        c.add(daysPerWeekTf);

        positionLabel = new JLabel("Position");
        positionLabel.setBounds(10, 380, 140, 30);
        positionLabel.setFont(font);
        positionLabel.setForeground(Color.WHITE);
        c.add(positionLabel);

        positionTf = new JTextField("Manager");
        positionTf.setBounds(110, 380, 140, 30);
        positionTf.setFont(font);
        positionTf.setEditable(false);

        c.add(positionTf);

        incomeLabel = new JLabel("Salary");
        incomeLabel.setBounds(10, 430, 140, 30);
        incomeLabel.setFont(font);
        incomeLabel.setForeground(Color.WHITE);
        c.add(incomeLabel);

        incomeTf = new JTextField("100000tk");
        incomeTf.setBounds(110, 430, 140, 30);
        incomeTf.setFont(font);
        incomeTf.setEditable(false);

        c.add(incomeTf);

        // Cursor cur=new Cursor();

        backButton = new JButton("Back");
        backButton.setBounds(850, 180, 120, 30);
        // backButton.setCursor(cur);
        backButton.setFont(font);
        c.add(backButton);
        backButton.addActionListener(this);

        icon2 = new ImageIcon("a5.jpg");// pic->ImageIcon->JLabel
        bgpic = new JLabel("", icon2, JLabel.CENTER);
        bgpic.setBounds(0, 0, 1000, 700);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getSource().equals(backButton)) {
            this.dispose();
            new EmployeeLogin().setVisible(true);
        }
    }
}