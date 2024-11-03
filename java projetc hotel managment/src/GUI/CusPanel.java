package GUI;
import CLASS.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class CusPanel extends JFrame implements ActionListener
{
    ImageIcon icon, img, image;
    Container c;
    JTable table;
    String path;
    DefaultTableModel model;
    JLabel titleLabel, fnLabel, lnLabel, phoneLabel, ocpLabel, gndLabel, nidLabel,
            membShowLabel, checkInTimeLabel, checkInTimeShowLabel, daysLabel, roomsLabel,
            rtLabel, rnLabel,
            adLabel, arLabel, rbLabel, rbShowLabel, paidLabel, paidShowLabel, dueLabel, dueShowLabel, passLabel,
            bgpic, billShowLabel, fishShowLabel, beefShowLabel, muttonShowLabel, porkShowLabel,
            riceShowLabel,
            apShowLabel, mkShowLabel, ltShowLabel, ckShowLabel, ccShowLabel, tShowLabel, cShowLabel, ojShowLabel,
            mjShowLabel, csShowLabel, fishBillShowLabel, beefBillShowLabel, muttonBillShowLabel, porkBillShowLabel,
            riceBillShowLabel,
            apBillShowLabel, mkBillShowLabel, ltBillShowLabel, ckBillShowLabel, ccBillShowLabel, tBillShowLabel,
            cBillShowLabel, ojBillShowLabel,
            mjBillShowLabel, csBillShowLabel, foodBillShowLabel, foodBill;

    JButton fishBillButton, beefBillButton, muttonBillButton, porkBillButton,
            riceBillButton,
            apBillButton, mkBillButton, ltBillButton, ckBillButton, ccBillButton, tBillButton,
            cBillButton, ojBillButton,
            mjBillButton, csBillButton, fishCancelButton, beefCancelButton, muttonCancelButton, porkCancelButton,
            riceCancelButton,
            apCancelButton, mkCancelButton, ltCancelButton, ckCancelButton, ccCancelButton, tCancelButton,
            cCancelButton, ojCancelButton,
            mjCancelButton, csCancelButton, paymentButton, backButton, billButton;

    JTextField fnTf, lnTf, phoneTf, ocpTf, gndTf, nidTf, membTf,
            checkInTimeTf, daysTf, roomsTf,
            rtTf, rnTf,
            adTf, arTf, rbTf, paidTf, dueTf, passTf;

    JSpinner fishSpinner, beefSpinner, muttonSpinner, porkSpinner, riceSpinner,
            apSpinner, mkSpinner, ltSpinner, ckSpinner, ccSpinner, tSpinner, cSpinner, ojSpinner,
            mjSpinner, csSpinner;

    JCheckBox fishCheckBox, beefCheckBox, muttonCheckBox, porkCheckBox, riceCheckBox,
            applePieCheckBox, malaiKulfiCheckBox, lemonTartCheckBox, coconutKheerCheckBox, cupCakeCheckBox, tCheckBox,
            cCheckBox, ojCheckBox,
            mjCheckBox, csCheckBox;

    SpinnerNumberModel valueOfFish, valueOfBeef, valueOfMutton, valueOfPork, valueOfRice, valueOfAp, valueOfMk,
            valueOfLt, valueOfCk, valueOfCc, valueOfT, valueOfC, valueOfOj, valueOfMj, valueOfCs;

    JScrollBar scroll;
    Font f1, font, font2;
    Cursor cur;
    String[] cols = { "First name", "Last name", "Occupation", "Gender", "NID",
            "Days", "Room no", "Room bill", "Paid", "Due", "Phone number", "Password" };


    public CusPanel(){
        super("Customer Panel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1370,1080);

    }
    public CusPanel(String path)
    {
        this.path=path;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,700);
        this.setLocationRelativeTo(null);
        this.setTitle("Customer Panel");

        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        //this part changes the icon
        icon=new ImageIcon(getClass().getClassLoader().getResource("IMAGE/hotel_icon.png")); //Interface Icon Location
        this.setIconImage(icon.getImage());// Interface Icon Set

        Font font = new Font("Arial", Font.BOLD, 16);
        titleLabel = new JLabel("Customer Profile Panel");
        titleLabel.setFont(font);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(80, 10, 250, 50);
        c.add(titleLabel);

        TableReader tt5 = new TableReader();
        model = new DefaultTableModel();
        File f=new File(path);
        if(f.length() !=0)
        {
            model=tt5.createModel(path);
        }
        model.setColumnIdentifiers(cols);
        table.setModel(model);

        // JLabels Start
        fnLabel = new JLabel("First Name");
        fnLabel.setBounds(10, 80, 140, 30);
        fnLabel.setFont(font);
        fnLabel.setForeground(Color.WHITE);
        c.add(fnLabel);

        fnTf = new JTextField();
        fnTf.setBounds(110, 80, 200, 30);
        fnTf.setFont(font);
        c.add(fnTf);

        lnLabel = new JLabel("Last Name ");
        lnLabel.setBounds(10, 130, 140, 30);
        lnLabel.setFont(font);
        lnLabel.setForeground(Color.WHITE);
        c.add(lnLabel);

        lnTf = new JTextField();
        lnTf.setBounds(110, 130, 200, 30);
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
        phoneTf.setFont(font);
        c.add(phoneTf);

        // Occupation
        ocpLabel = new JLabel("Occupation");
        ocpLabel.setBounds(10, 230, 140, 30);
        ocpLabel.setFont(font);
        ocpLabel.setForeground(Color.WHITE);
        c.add(ocpLabel);

        ocpTf = new JTextField();
        ocpTf.setBounds(110, 230, 200, 30);
        ocpTf.setFont(font);
        c.add(ocpTf);

        // Gender
        gndLabel = new JLabel("Gender");
        gndLabel.setBounds(10, 280, 140, 30);
        gndLabel.setFont(font);
        gndLabel.setForeground(Color.WHITE);
        c.add(gndLabel);

        gndTf = new JTextField();
        gndTf.setBounds(110, 280, 200, 30);
        gndTf.setFont(font);
        c.add(gndTf);

        // Nid Number
        nidLabel = new JLabel("Nid Number");
        nidLabel.setBounds(10, 330, 140, 30);
        nidLabel.setFont(font);
        nidLabel.setForeground(Color.WHITE);
        c.add(nidLabel);

        nidTf = new JTextField();
        nidTf.setBounds(110, 330, 200, 30);
        nidTf.setFont(font);
        c.add(nidTf);

        daysLabel = new JLabel("Days");
        daysLabel.setBounds(10, 380, 150, 30);
        daysLabel.setFont(font);
        daysLabel.setForeground(Color.WHITE);
        c.add(daysLabel);

        daysTf = new JTextField();
        daysTf.setBounds(110, 380, 200, 30);
        daysTf.setFont(font);
        c.add(daysTf);

        rnLabel = new JLabel("Room No");
        rnLabel.setBounds(10, 430, 150, 30);
        rnLabel.setFont(font);
        rnLabel.setForeground(Color.WHITE);
        c.add(rnLabel);

        rnTf = new JTextField();
        rnTf.setBounds(110, 430, 200, 30);
        rnTf.setFont(font);
        c.add(rnTf);

        rbLabel = new JLabel("Room Bill");
        rbLabel.setBounds(10, 480, 150, 30);
        rbLabel.setFont(font);
        rbLabel.setForeground(Color.WHITE);
        c.add(rbLabel);

        rbTf = new JTextField();
        rbTf.setBounds(110, 480, 200, 30);
        rbTf.setFont(font);
        c.add(rbTf);

        paidLabel = new JLabel("Paid Amount");
        paidLabel.setBounds(10, 530, 150, 30);
        paidLabel.setFont(font);
        paidLabel.setForeground(Color.WHITE);
        c.add(paidLabel);

        paidTf = new JTextField();
        paidTf.setBounds(110, 530, 200, 30);
        paidTf.setFont(font);
        c.add(paidTf);

        dueLabel = new JLabel("Due Amount");
        dueLabel.setBounds(10, 580, 150, 30);
        dueLabel.setFont(font);
        dueLabel.setForeground(Color.WHITE);
        c.add(dueLabel);

        dueTf = new JTextField();
        dueTf.setBounds(110, 580, 200, 30);
        dueTf.setFont(font);
        c.add(dueTf);

        passLabel = new JLabel("Password");
        passLabel.setBounds(10, 630, 150, 30);
        passLabel.setFont(font);
        passLabel.setForeground(Color.WHITE);
        c.add(passLabel);

        passTf = new JTextField();
        passTf.setBounds(110, 630, 200, 30);
        passTf.setFont(font);
        c.add(passTf);

        //JLabels End
        //JTextField Start

        String f_name = model.getValueAt(0, 0).toString();
        String l_name = model.getValueAt(0, 1).toString();

        String ocp = model.getValueAt(0, 2).toString();
        String gnd = model.getValueAt(0, 3).toString();
        String nid = model.getValueAt(0, 4).toString();
        // String checkInTime = model.getValueAt(0, 6).toString();
        String days = model.getValueAt(0, 5).toString();
        String r_no = model.getValueAt(0, 6).toString();
        String r_bill = model.getValueAt(0, 7).toString();
        String paid = model.getValueAt(0, 8).toString();
        String due = model.getValueAt(0, 9).toString();
        String phone = model.getValueAt(0, 10).toString();
        String pass = model.getValueAt(0, 11).toString();

        fnTf.setText(f_name);
        lnTf.setText(l_name);

        ocpTf.setText(ocp);

        gndTf.setText(gnd);
        nidTf.setText(nid);
        // checkInTimeTf.setText(checkInTime);
        daysTf.setText(days);
        rnTf.setText(r_no);
        rbTf.setText(r_bill);
        paidTf.setText(paid);
        dueTf.setText(due);
        phoneTf.setText(phone);
        passTf.setText(pass);

        /*
         * int num = table.getRowCount();
         * String tnum = String.valueOf(num);
         * totalMembersTextField.setText(tnum);
         *
         * String aString = reader("absbill.txt");
         * absoluteBillTextField.setText(aString);
         *
         * String bString = reader("dmc.txt");
         * dailyMealTextField.setText(bString);
         *
         * String cString = reader("immc.txt");
         * indiMonthlyMTextField.setText(cString);
         *
         * String dString = reader("indiuti.txt");
         * individualUtilityTextField.setText(dString);
         *
         * String eString = reader("mmc.txt");
         * monthlyMealTextField.setText(eString);
         *
         * String fString = reader("utility.txt");
         * utilyTextField.setText(fString);
         *
         * File imgFile = new File(profile);
         * if (imgFile.exists()) {
         * image = new ImageIcon(getClass().getResource(profile));
         * profilePhoto = new JLabel(image);
         * profilePhoto.setBounds(950, 100, 300, 300);
         * profilePhoto.setVisible(true);
         * c.add(profilePhoto);
         * } else {
         * profilePhoto = new JLabel("Photo Not Found");
         * profilePhoto.setBounds(950, 100, 300, 300);
         * profilePhoto.setVisible(true);
         * c.add(profilePhoto);
         * }
         * /
         */

        fnTf.setEditable(false);
        lnTf.setEditable(false);
        ocpTf.setEditable(false);
        gndTf.setEditable(false);
        nidTf.setEditable(false);
        // checkInTimeTf.setEditable(false);
        daysTf.setEditable(false);
        rnTf.setEditable(false);
        rbTf.setEditable(false);
        paidTf.setEditable(false);
        dueTf.setEditable(false);
        phoneTf.setEditable(false);
        passTf.setEditable(false);

        fnTf.setBackground(Color.WHITE);
        lnTf.setBackground(Color.WHITE);
        ocpTf.setBackground(Color.WHITE);

        gndTf.setBackground(Color.WHITE);
        nidTf.setBackground(Color.WHITE);
        // checkInTimeTf.setBackground(Color.GRAY);
        daysTf.setBackground(Color.WHITE);
        rnTf.setBackground(Color.WHITE);
        rbTf.setBackground(Color.WHITE);
        paidTf.setBackground(Color.WHITE);
        dueTf.setBackground(Color.WHITE);
        phoneTf.setBackground(Color.WHITE);
        passTf.setBackground(Color.WHITE);

        // JTextField End

        Font font5 = new Font("Arial", Font.BOLD, 20);
        JLabel menu = new JLabel("Food Menu");
        menu.setBounds(410, 70, 200, 30);
        menu.setFont(font5);
        menu.setForeground(Color.WHITE);
        c.add(menu);
        // Food========order//

        JLabel meals = new JLabel("Meals");
        meals.setBounds(410, 110, 200, 20);
        meals.setFont(font);
        meals.setForeground(Color.WHITE);
        c.add(meals);

        fishCheckBox = new JCheckBox("Fish(500tk)");
        fishCheckBox.setBounds(410, 130, 200, 20);
        fishCheckBox.setFont(font);
        fishCheckBox.setBackground(Color.WHITE);
        // fishCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(fishCheckBox);
        beefCheckBox = new JCheckBox("Beef(700tk)");
        beefCheckBox.setBounds(410, 150, 200, 20);
        beefCheckBox.setFont(font);
        beefCheckBox.setBackground(Color.WHITE);
        // beefCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(beefCheckBox);

        muttonCheckBox = new JCheckBox("Mutton(900tk)");
        muttonCheckBox.setBounds(410, 170, 200, 20);
        muttonCheckBox.setFont(font);
        muttonCheckBox.setBackground(Color.WHITE);
        // muttonCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(muttonCheckBox);

        porkCheckBox = new JCheckBox("Pork(1000tk)");
        porkCheckBox.setBounds(410, 190, 200, 20);
        porkCheckBox.setFont(font);
        porkCheckBox.setBackground(Color.WHITE);
        // muttonCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(porkCheckBox);

        riceCheckBox = new JCheckBox("Rice(100tk)");
        riceCheckBox.setBounds(410, 210, 200, 20);
        riceCheckBox.setFont(font);
        riceCheckBox.setBackground(Color.WHITE);
        // muttonCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(riceCheckBox);

        valueOfFish = new SpinnerNumberModel(1, 0, 1000, 1);
        fishSpinner = new JSpinner(valueOfFish);
        fishSpinner.setBounds(643, 130, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(fishSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        fishShowLabel = new JLabel("1");
        fishShowLabel.setBounds(610, 130, 33, 20);
        fishShowLabel.setOpaque(true);
        fishShowLabel.setBackground(Color.WHITE);
        fishShowLabel.setFont(font);
        c.add(fishShowLabel);

        fishSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number =fishSpinner.getValue().toString();

                // then se int ke String e niye gelam
                int intNumber=Integer.parseInt(number);

                //then seta show koralam
                fishShowLabel.setText(""+intNumber);
            }
        });

        valueOfBeef = new SpinnerNumberModel(1, 1, 1000, 1);
        beefSpinner = new JSpinner(valueOfBeef);
        beefSpinner.setBounds(643, 150, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(beefSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        beefShowLabel = new JLabel("1");
        beefShowLabel.setBounds(610, 150, 33, 20);
        beefShowLabel.setOpaque(true);
        beefShowLabel.setBackground(Color.WHITE);
        beefShowLabel.setFont(font);
        c.add(beefShowLabel);

        beefSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = beefSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                beefShowLabel.setText("" + intNumber);

            }

        });

        valueOfMutton = new SpinnerNumberModel(1, 1, 1000, 1);
        muttonSpinner = new JSpinner(valueOfMutton);
        muttonSpinner.setBounds(643, 170, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(muttonSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        muttonShowLabel = new JLabel("1");
        muttonShowLabel.setBounds(610, 170, 33, 20);
        muttonShowLabel.setOpaque(true);
        muttonShowLabel.setBackground(Color.WHITE);
        muttonShowLabel.setFont(font);
        c.add(muttonShowLabel);

        muttonSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = muttonSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                muttonShowLabel.setText("" + intNumber);

            }

        });

        valueOfPork = new SpinnerNumberModel(1, 1, 1000, 1);
        porkSpinner = new JSpinner(valueOfPork);
        porkSpinner.setBounds(643, 190, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(porkSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        porkShowLabel = new JLabel("1");
        porkShowLabel.setBounds(610, 190, 33, 20);
        porkShowLabel.setOpaque(true);
        porkShowLabel.setBackground(Color.WHITE);
        porkShowLabel.setFont(font);
        c.add(porkShowLabel);

        porkSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = porkSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                porkShowLabel.setText("" + intNumber);

            }

        });

        valueOfRice = new SpinnerNumberModel(1, 1, 1000, 1);
        riceSpinner = new JSpinner(valueOfRice);
        riceSpinner.setBounds(643, 210, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(riceSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        riceShowLabel = new JLabel("1");
        riceShowLabel.setBounds(610, 210, 33, 20);
        riceShowLabel.setOpaque(true);
        riceShowLabel.setBackground(Color.WHITE);
        riceShowLabel.setFont(font);
        c.add(riceShowLabel);

        riceSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = riceSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                riceShowLabel.setText("" + intNumber);

            }

        });

        // Desserts
        JLabel desserts = new JLabel("Desserts");
        desserts.setBounds(410, 260, 200, 20);
        desserts.setFont(font);
        desserts.setForeground(Color.WHITE);
        c.add(desserts);

        applePieCheckBox = new JCheckBox("Apple Pie(200tk)");
        applePieCheckBox.setBounds(410, 280, 200, 20);
        applePieCheckBox.setFont(font);
        applePieCheckBox.setBackground(Color.WHITE);
        // fishCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(applePieCheckBox);

        malaiKulfiCheckBox = new JCheckBox("Malai Kulfie(200tk)");
        malaiKulfiCheckBox.setBounds(410, 300, 200, 20);
        malaiKulfiCheckBox.setFont(font);
        malaiKulfiCheckBox.setBackground(Color.WHITE);
        // beefCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(malaiKulfiCheckBox);

        lemonTartCheckBox = new JCheckBox("Lemon Tart(200tk)");
        lemonTartCheckBox.setBounds(410, 320, 200, 20);
        lemonTartCheckBox.setFont(font);
        lemonTartCheckBox.setBackground(Color.WHITE);
        // muttonCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(lemonTartCheckBox);

        coconutKheerCheckBox = new JCheckBox("Coconut Kheer(250tk)");
        coconutKheerCheckBox.setBounds(410, 340, 200, 20);
        coconutKheerCheckBox.setFont(font);
        coconutKheerCheckBox.setBackground(Color.WHITE);
        // muttonCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(coconutKheerCheckBox);

        cupCakeCheckBox = new JCheckBox("Cup Cake(250tk)");
        cupCakeCheckBox.setBounds(410, 360, 200, 20);
        cupCakeCheckBox.setFont(font);
        cupCakeCheckBox.setBackground(Color.WHITE);
        // muttonCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(cupCakeCheckBox);

        valueOfAp = new SpinnerNumberModel(1, 0, 1000, 1);
        apSpinner = new JSpinner(valueOfAp);
        apSpinner.setBounds(643, 280, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(apSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        apShowLabel = new JLabel("1");
        apShowLabel.setBounds(610, 280, 33, 20);
        apShowLabel.setOpaque(true);
        apShowLabel.setBackground(Color.WHITE);
        apShowLabel.setFont(font);
        c.add(apShowLabel);

        apSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = apSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                apShowLabel.setText("" + intNumber);

            }

        });
        valueOfMk = new SpinnerNumberModel(1, 1, 1000, 1);
        mkSpinner = new JSpinner(valueOfMk);
        mkSpinner.setBounds(643, 300, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(mkSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        mkShowLabel = new JLabel("1");
        mkShowLabel.setBounds(610, 300, 33, 20);
        mkShowLabel.setOpaque(true);
        mkShowLabel.setBackground(Color.WHITE);
        mkShowLabel.setFont(font);
        c.add(mkShowLabel);

        mkSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = mkSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                mkShowLabel.setText("" + intNumber);

            }

        });

        valueOfLt = new SpinnerNumberModel(1, 1, 1000, 1);
        ltSpinner = new JSpinner(valueOfLt);
        ltSpinner.setBounds(643, 320, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(ltSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        ltShowLabel = new JLabel("1");
        ltShowLabel.setBounds(610, 320, 33, 20);
        ltShowLabel.setOpaque(true);
        ltShowLabel.setBackground(Color.WHITE);
        ltShowLabel.setFont(font);
        c.add(ltShowLabel);

        ltSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = ltSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                ltShowLabel.setText("" + intNumber);

            }

        });

        valueOfCk = new SpinnerNumberModel(1, 1, 1000, 1);
        ckSpinner = new JSpinner(valueOfCk);
        ckSpinner.setBounds(643, 340, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(ckSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        ckShowLabel = new JLabel("1");
        ckShowLabel.setBounds(610, 340, 33, 20);
        ckShowLabel.setOpaque(true);
        ckShowLabel.setBackground(Color.WHITE);
        ckShowLabel.setFont(font);
        c.add(ckShowLabel);

        ckSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = ckSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                ckShowLabel.setText("" + intNumber);

            }

        });

        valueOfCc = new SpinnerNumberModel(1, 1, 1000, 1);
        ccSpinner = new JSpinner(valueOfCc);
        ccSpinner.setBounds(643, 360, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(ccSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        ccShowLabel = new JLabel("1");
        ccShowLabel.setBounds(610, 360, 33, 20);
        ccShowLabel.setOpaque(true);
        ccShowLabel.setBackground(Color.WHITE);
        ccShowLabel.setFont(font);
        c.add(ccShowLabel);

        ccSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = ccSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                ccShowLabel.setText("" + intNumber);

            }

        });

        // Drinks

        JLabel drinks = new JLabel("Drinks");
        drinks.setBounds(410, 410, 200, 20);
        drinks.setFont(font);
        drinks.setForeground(Color.WHITE);
        c.add(drinks);

        tCheckBox = new JCheckBox("Tea(100tk)");
        tCheckBox.setBounds(410, 430, 200, 20);
        tCheckBox.setFont(font);
        tCheckBox.setBackground(Color.WHITE);
        // fishCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(tCheckBox);
        cCheckBox = new JCheckBox("Coffee(150tk)");
        cCheckBox.setBounds(410, 450, 200, 20);
        cCheckBox.setFont(font);
        cCheckBox.setBackground(Color.WHITE);
        // beefCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(cCheckBox);

        ojCheckBox = new JCheckBox("Orange Juice(300tk)");
        ojCheckBox.setBounds(410, 470, 200, 20);
        ojCheckBox.setFont(font);
        ojCheckBox.setBackground(Color.WHITE);
        // muttonCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(ojCheckBox);

        mjCheckBox = new JCheckBox("Mango Juice(300tk)");
        mjCheckBox.setBounds(410, 490, 200, 20);
        mjCheckBox.setFont(font);
        mjCheckBox.setBackground(Color.WHITE);
        // muttonCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(mjCheckBox);

        csCheckBox = new JCheckBox("Chocolateshake(350tk)");
        csCheckBox.setBounds(410, 510, 200, 20);
        csCheckBox.setFont(font);
        csCheckBox.setBackground(Color.WHITE);
        // muttonCheckBox.setBackground(Color.BLUE);
        // male.setSelected(true);// run korar por first ei auto male select thkbe
        c.add(csCheckBox);

        valueOfT = new SpinnerNumberModel(1, 0, 1000, 1);
        tSpinner = new JSpinner(valueOfT);
        tSpinner.setBounds(643, 430, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(tSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        tShowLabel = new JLabel("1");
        tShowLabel.setBounds(610, 430, 33, 20);
        tShowLabel.setOpaque(true);
        tShowLabel.setBackground(Color.WHITE);
        tShowLabel.setFont(font);
        c.add(tShowLabel);

        tSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = tSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                tShowLabel.setText("" + intNumber);

            }

        });

        valueOfC = new SpinnerNumberModel(1, 1, 1000, 1);
        cSpinner = new JSpinner(valueOfC);
        cSpinner.setBounds(643, 450, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(cSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        cShowLabel = new JLabel("1");
        cShowLabel.setBounds(610, 450, 33, 20);
        cShowLabel.setOpaque(true);
        cShowLabel.setBackground(Color.WHITE);
        cShowLabel.setFont(font);
        c.add(cShowLabel);

        cSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = cSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                cShowLabel.setText("" + intNumber);

            }

        });

        valueOfOj = new SpinnerNumberModel(1, 1, 1000, 1);
        ojSpinner = new JSpinner(valueOfOj);
        ojSpinner.setBounds(643, 470, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(ojSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        ojShowLabel = new JLabel("1");
        ojShowLabel.setBounds(610, 470, 33, 20);
        ojShowLabel.setOpaque(true);
        ojShowLabel.setBackground(Color.WHITE);
        ojShowLabel.setFont(font);
        c.add(ojShowLabel);

        ojSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = ltSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                ojShowLabel.setText("" + intNumber);

            }

        });
        valueOfMj = new SpinnerNumberModel(1, 1, 1000, 1);
        mjSpinner = new JSpinner(valueOfMj);
        mjSpinner.setBounds(643, 490, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(mjSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        mjShowLabel = new JLabel("1");
        mjShowLabel.setBounds(610, 490, 33, 20);
        mjShowLabel.setOpaque(true);
        mjShowLabel.setBackground(Color.WHITE);
        mjShowLabel.setFont(font);
        c.add(mjShowLabel);

        mjSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = mjSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                mjShowLabel.setText("" + intNumber);

            }

        });
        valueOfCs = new SpinnerNumberModel(1, 1, 1000, 1);
        csSpinner = new JSpinner(valueOfCs);
        csSpinner.setBounds(643, 510, 17, 20);
        // spinner er width short nilam karon amra value ta spinner e dekhbo na
        // value dekhbo JLabel e jate user edit korte na pare
        c.add(csSpinner);

        // Jlabel e create korlam jate user edit korte na pare
        csShowLabel = new JLabel("1");
        csShowLabel.setBounds(610, 510, 33, 20);
        csShowLabel.setOpaque(true);
        csShowLabel.setBackground(Color.WHITE);
        csShowLabel.setFont(font);
        c.add(csShowLabel);

        csSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // membSpinner er value ta ekta string variable number er moddhe rakhlam
                String number = csSpinner.getValue().toString();

                // then se int ke String e niye gelam

                int intNumber = Integer.parseInt(number);

                // then seta show koralam
                csShowLabel.setText("" + intNumber);

            }

        });

        /*
         * ftComboBox.addItemListener(new ItemListener() {
         *
         * public void itemStateChanged(ItemEvent e) {
         *
         * String roomType = ftComboBox.getSelectedItem().toString();
         *
         * if (roomType.equals("Meals")) {
         *
         * fishCheckBox.setVisible(true);
         * beefCheckBox.setVisible(true);
         * muttonCheckBox.setVisible(true);
         * porkCheckBox.setVisible(true);
         * riceCheckBox.setVisible(true);
         * applePieCheckBox.setVisible(false);
         * malaiKulfiCheckBox.setVisible(false);
         * lemonTartCheckBox.setVisible(false);
         * coconutKheerCheckBox.setVisible(false);
         * cupCakeCheckBox.setVisible(false);
         * tCheckBox.setVisible(false);
         * cCheckBox.setVisible(false);
         * ojCheckBox.setVisible(false);
         * mjCheckBox.setVisible(false);
         * csCheckBox.setVisible(false);
         * fishSpinner.setVisible(true);
         * beefSpinner.setVisible(true);
         * muttonSpinner.setVisible(true);
         * porkSpinner.setVisible(true);
         * riceSpinner.setVisible(true);
         * apSpinner.setVisible(false);
         * mkSpinner.setVisible(false);
         * ltSpinner.setVisible(false);
         * ckSpinner.setVisible(false);
         * ccSpinner.setVisible(false);
         * tSpinner.setVisible(false);
         * cSpinner.setVisible(false);
         * ojSpinner.setVisible(false);
         * mjSpinner.setVisible(false);
         * csSpinner.setVisible(false);
         * fishShowLabel.setVisible(true);
         * beefShowLabel.setVisible(true);
         * muttonShowLabel.setVisible(true);
         * porkShowLabel.setVisible(true);
         * riceShowLabel.setVisible(true);
         * apShowLabel.setVisible(false);
         * mkShowLabel.setVisible(false);
         * ltShowLabel.setVisible(false);
         * ckShowLabel.setVisible(false);
         * ccShowLabel.setVisible(false);
         * tShowLabel.setVisible(false);
         * cShowLabel.setVisible(false);
         * ojShowLabel.setVisible(false);
         * mjShowLabel.setVisible(false);
         * csShowLabel.setVisible(false);
         *
         * } else if (roomType.equals("Desserts")) {
         *
         * fishCheckBox.setVisible(false);
         * beefCheckBox.setVisible(false);
         * muttonCheckBox.setVisible(false);
         * porkCheckBox.setVisible(false);
         * riceCheckBox.setVisible(false);
         * applePieCheckBox.setVisible(true);
         * malaiKulfiCheckBox.setVisible(true);
         * lemonTartCheckBox.setVisible(true);
         * coconutKheerCheckBox.setVisible(true);
         * cupCakeCheckBox.setVisible(true);
         * tCheckBox.setVisible(false);
         * cCheckBox.setVisible(false);
         * ojCheckBox.setVisible(false);
         * mjCheckBox.setVisible(false);
         * csCheckBox.setVisible(false);
         * fishSpinner.setVisible(false);
         * beefSpinner.setVisible(false);
         * muttonSpinner.setVisible(false);
         * porkSpinner.setVisible(false);
         * riceSpinner.setVisible(false);
         * apSpinner.setVisible(true);
         * mkSpinner.setVisible(true);
         * ltSpinner.setVisible(true);
         * ckSpinner.setVisible(true);
         * ccSpinner.setVisible(true);
         * tSpinner.setVisible(false);
         * cSpinner.setVisible(false);
         * ojSpinner.setVisible(false);
         * mjSpinner.setVisible(false);
         * csSpinner.setVisible(false);
         * fishShowLabel.setVisible(false);
         * beefShowLabel.setVisible(false);
         * muttonShowLabel.setVisible(false);
         * porkShowLabel.setVisible(false);
         * riceShowLabel.setVisible(false);
         * apShowLabel.setVisible(true);
         * mkShowLabel.setVisible(true);
         * ltShowLabel.setVisible(true);
         * ckShowLabel.setVisible(true);
         * ccShowLabel.setVisible(true);
         * tShowLabel.setVisible(false);
         * cShowLabel.setVisible(false);
         * ojShowLabel.setVisible(false);
         * mjShowLabel.setVisible(false);
         * csShowLabel.setVisible(false);
         *
         * } else {
         *
         * fishCheckBox.setVisible(false);
         * beefCheckBox.setVisible(false);
         * muttonCheckBox.setVisible(false);
         * porkCheckBox.setVisible(false);
         * riceCheckBox.setVisible(false);
         * applePieCheckBox.setVisible(false);
         * malaiKulfiCheckBox.setVisible(false);
         * lemonTartCheckBox.setVisible(false);
         * coconutKheerCheckBox.setVisible(false);
         * cupCakeCheckBox.setVisible(false);
         * tCheckBox.setVisible(true);
         * cCheckBox.setVisible(true);
         * ojCheckBox.setVisible(true);
         * mjCheckBox.setVisible(true);
         * csCheckBox.setVisible(true);
         * fishSpinner.setVisible(false);
         * beefSpinner.setVisible(false);
         * muttonSpinner.setVisible(false);
         * porkSpinner.setVisible(false);
         * riceSpinner.setVisible(false);
         * apSpinner.setVisible(false);
         * mkSpinner.setVisible(false);
         * ltSpinner.setVisible(false);
         * ckSpinner.setVisible(false);
         * ccSpinner.setVisible(false);
         * tSpinner.setVisible(true);
         * cSpinner.setVisible(true);
         * ojSpinner.setVisible(true);
         * mjSpinner.setVisible(true);
         * csSpinner.setVisible(true);
         * fishShowLabel.setVisible(false);
         * beefShowLabel.setVisible(false);
         * muttonShowLabel.setVisible(false);
         * porkShowLabel.setVisible(false);
         * riceShowLabel.setVisible(false);
         * apShowLabel.setVisible(false);
         * mkShowLabel.setVisible(false);
         * ltShowLabel.setVisible(false);
         * ckShowLabel.setVisible(false);
         * ccShowLabel.setVisible(false);
         * tShowLabel.setVisible(true);
         * cShowLabel.setVisible(true);
         * ojShowLabel.setVisible(true);
         * mjShowLabel.setVisible(true);
         * csShowLabel.setVisible(true);
         *
         * }
         * }
         * });
         *
         */

        // ============Bill===================//

        fishBillShowLabel = new JLabel("0");
        fishBillShowLabel.setBounds(660, 130, 50, 20);
        fishBillShowLabel.setFont(font2);
        fishBillShowLabel.setOpaque(true);
        fishBillShowLabel.setBackground(Color.WHITE);
        c.add(fishBillShowLabel);

        beefBillShowLabel = new JLabel("0");
        beefBillShowLabel.setBounds(660, 150, 50, 20);
        beefBillShowLabel.setFont(font2);
        beefBillShowLabel.setOpaque(true);
        beefBillShowLabel.setBackground(Color.WHITE);
        c.add(beefBillShowLabel);

        muttonBillShowLabel = new JLabel("0");
        muttonBillShowLabel.setBounds(660, 170, 50, 20);
        muttonBillShowLabel.setFont(font2);
        muttonBillShowLabel.setOpaque(true);
        muttonBillShowLabel.setBackground(Color.WHITE);
        c.add(muttonBillShowLabel);

        porkBillShowLabel = new JLabel("0");
        porkBillShowLabel.setBounds(660, 190, 50, 20);
        porkBillShowLabel.setFont(font2);
        porkBillShowLabel.setOpaque(true);
        porkBillShowLabel.setBackground(Color.WHITE);
        c.add(porkBillShowLabel);

        riceBillShowLabel = new JLabel("0");
        riceBillShowLabel.setBounds(660, 210, 50, 20);
        riceBillShowLabel.setFont(font2);
        riceBillShowLabel.setOpaque(true);
        riceBillShowLabel.setBackground(Color.WHITE);
        c.add(riceBillShowLabel);

        apBillShowLabel = new JLabel("0");
        apBillShowLabel.setBounds(660, 280, 50, 20);
        apBillShowLabel.setFont(font2);
        apBillShowLabel.setOpaque(true);
        apBillShowLabel.setBackground(Color.WHITE);
        c.add(apBillShowLabel);

        mkBillShowLabel = new JLabel("0");
        mkBillShowLabel.setBounds(660, 300, 50, 20);
        mkBillShowLabel.setFont(font2);
        mkBillShowLabel.setOpaque(true);
        mkBillShowLabel.setBackground(Color.WHITE);
        c.add(mkBillShowLabel);

        ltBillShowLabel = new JLabel("0");
        ltBillShowLabel.setBounds(660, 320, 50, 20);
        ltBillShowLabel.setFont(font2);
        ltBillShowLabel.setOpaque(true);
        ltBillShowLabel.setBackground(Color.WHITE);
        c.add(ltBillShowLabel);

        ckBillShowLabel = new JLabel("0");
        ckBillShowLabel.setBounds(660, 340, 50, 20);
        ckBillShowLabel.setFont(font2);
        ckBillShowLabel.setOpaque(true);
        ckBillShowLabel.setBackground(Color.WHITE);
        c.add(ckBillShowLabel);

        ccBillShowLabel = new JLabel("0");
        ccBillShowLabel.setBounds(660, 360, 50, 20);
        ccBillShowLabel.setFont(font2);
        ccBillShowLabel.setOpaque(true);
        ccBillShowLabel.setBackground(Color.WHITE);
        c.add(ccBillShowLabel);

        tBillShowLabel = new JLabel("0");
        tBillShowLabel.setBounds(660, 430, 50, 20);
        tBillShowLabel.setFont(font2);
        tBillShowLabel.setOpaque(true);
        tBillShowLabel.setBackground(Color.WHITE);
        c.add(tBillShowLabel);

        cBillShowLabel = new JLabel("0");
        cBillShowLabel.setBounds(660, 450, 50, 20);
        cBillShowLabel.setFont(font2);
        cBillShowLabel.setOpaque(true);
        cBillShowLabel.setBackground(Color.WHITE);
        c.add(cBillShowLabel);

        ojBillShowLabel = new JLabel("0");
        ojBillShowLabel.setBounds(660, 470, 50, 20);
        ojBillShowLabel.setFont(font2);
        ojBillShowLabel.setOpaque(true);
        ojBillShowLabel.setBackground(Color.WHITE);
        c.add(ojBillShowLabel);

        mjBillShowLabel = new JLabel("0");
        mjBillShowLabel.setBounds(660, 490, 50, 20);
        mjBillShowLabel.setFont(font2);
        mjBillShowLabel.setOpaque(true);
        mjBillShowLabel.setBackground(Color.WHITE);
        c.add(mjBillShowLabel);

        csBillShowLabel = new JLabel("0");
        csBillShowLabel.setBounds(660, 510, 50, 20);
        csBillShowLabel.setFont(font2);
        csBillShowLabel.setOpaque(true);
        csBillShowLabel.setBackground(Color.WHITE);
        c.add(csBillShowLabel);

        foodBill = new JLabel("Total food bill :");
        foodBill.setBounds(410, 550, 220, 30);
        foodBill.setCursor(cur);
        foodBill.setFont(font2);
        foodBill.setOpaque(true);
        foodBill.setBackground(Color.WHITE);
        c.add(foodBill);

        foodBillShowLabel = new JLabel("");
        foodBillShowLabel.setBounds(610, 550, 100, 30);
        foodBillShowLabel.setCursor(cur);
        foodBillShowLabel.setFont(font2);
        foodBillShowLabel.setOpaque(true);
        foodBillShowLabel.setBackground(Color.WHITE);
        c.add(foodBillShowLabel);

        // **Cursor***//

        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        // *******Button********//

        font2 = new Font("Arial", Font.PLAIN, 10);
        fishBillButton = new JButton("add");
        fishBillButton.setBounds(710, 130, 55, 20);
        fishBillButton.setCursor(cur);
        fishBillButton.setBackground(new Color(122, 136, 164));
        fishBillButton.setForeground(Color.WHITE);
        fishBillButton.setFont(font2);
        c.add(fishBillButton);

        beefBillButton = new JButton("add");
        beefBillButton.setBounds(710, 150, 55, 20);
        beefBillButton.setCursor(cur);
        beefBillButton.setFont(font2);
        beefBillButton.setBackground(new Color(122, 136, 164));
        beefBillButton.setForeground(Color.WHITE);
        c.add(beefBillButton);

        muttonBillButton = new JButton("add");
        muttonBillButton.setBounds(710, 170, 55, 20);
        muttonBillButton.setCursor(cur);
        muttonBillButton.setFont(font2);
        muttonBillButton.setBackground(new Color(122, 136, 164));
        muttonBillButton.setForeground(Color.WHITE);
        c.add(muttonBillButton);

        porkBillButton = new JButton("add");
        porkBillButton.setBounds(710, 190, 55, 20);
        porkBillButton.setCursor(cur);
        porkBillButton.setFont(font2);
        porkBillButton.setBackground(new Color(122, 136, 164));
        porkBillButton.setForeground(Color.WHITE);
        c.add(porkBillButton);

        riceBillButton = new JButton("add");
        riceBillButton.setBounds(710, 210, 55, 20);
        riceBillButton.setCursor(cur);
        riceBillButton.setFont(font2);
        riceBillButton.setBackground(new Color(122, 136, 164));
        riceBillButton.setForeground(Color.WHITE);
        c.add(riceBillButton);

        apBillButton = new JButton("add");
        apBillButton.setBounds(710, 280, 55, 20);
        apBillButton.setCursor(cur);
        apBillButton.setFont(font2);
        apBillButton.setBackground(new Color(122, 136, 164));
        apBillButton.setForeground(Color.WHITE);
        c.add(apBillButton);

        mkBillButton = new JButton("add");
        mkBillButton.setBounds(710, 300, 55, 20);
        mkBillButton.setCursor(cur);
        mkBillButton.setFont(font2);
        mkBillButton.setBackground(new Color(122, 136, 164));
        mkBillButton.setForeground(Color.WHITE);
        c.add(mkBillButton);

        ltBillButton = new JButton("add");
        ltBillButton.setBounds(710, 320, 55, 20);
        ltBillButton.setCursor(cur);
        ltBillButton.setFont(font2);
        ltBillButton.setBackground(new Color(122, 136, 164));
        ltBillButton.setForeground(Color.WHITE);
        c.add(ltBillButton);

        ckBillButton = new JButton("add");
        ckBillButton.setBounds(710, 340, 55, 20);
        ckBillButton.setCursor(cur);
        ckBillButton.setFont(font2);
        ckBillButton.setBackground(new Color(122, 136, 164));
        ckBillButton.setForeground(Color.WHITE);
        c.add(ckBillButton);

        ccBillButton = new JButton("add");
        ccBillButton.setBounds(710, 360, 55, 20);
        ccBillButton.setCursor(cur);
        ccBillButton.setFont(font2);
        ccBillButton.setBackground(new Color(122, 136, 164));
        ccBillButton.setForeground(Color.WHITE);
        c.add(ccBillButton);

        tBillButton = new JButton("add");
        tBillButton.setBounds(710, 430, 55, 20);
        tBillButton.setCursor(cur);
        tBillButton.setFont(font2);
        tBillButton.setBackground(new Color(122, 136, 164));
        tBillButton.setForeground(Color.WHITE);
        c.add(tBillButton);

        cBillButton = new JButton("add");
        cBillButton.setBounds(710, 450, 55, 20);
        cBillButton.setCursor(cur);
        cBillButton.setFont(font2);
        cBillButton.setBackground(new Color(122, 136, 164));
        cBillButton.setForeground(Color.WHITE);
        c.add(cBillButton);

        ojBillButton = new JButton("add");
        ojBillButton.setBounds(710, 470, 55, 20);
        ojBillButton.setCursor(cur);
        ojBillButton.setFont(font2);
        ojBillButton.setBackground(new Color(122, 136, 164));
        ojBillButton.setForeground(Color.WHITE);
        c.add(ojBillButton);

        mjBillButton = new JButton("add");
        mjBillButton.setBounds(710, 490, 55, 20);
        mjBillButton.setCursor(cur);
        mjBillButton.setFont(font2);
        mjBillButton.setBackground(new Color(122, 136, 164));
        mjBillButton.setForeground(Color.WHITE);
        c.add(mjBillButton);

        csBillButton = new JButton("add");
        csBillButton.setBounds(710, 510, 55, 20);
        csBillButton.setCursor(cur);
        csBillButton.setFont(font2);
        csBillButton.setBackground(new Color(122, 136, 164));
        csBillButton.setForeground(Color.WHITE);
        c.add(csBillButton);

        // remove button

        fishCancelButton = new JButton("rem");
        fishCancelButton.setBounds(765, 130, 55, 20);
        fishCancelButton.setCursor(cur);
        fishCancelButton.setFont(font2);
        fishCancelButton.setBackground(new Color(122, 136, 164));
        fishCancelButton.setForeground(Color.WHITE);
        c.add(fishCancelButton);

        beefCancelButton = new JButton("rem");
        beefCancelButton.setBounds(765, 150, 55, 20);
        beefCancelButton.setCursor(cur);
        beefCancelButton.setFont(font2);
        beefCancelButton.setBackground(new Color(122, 136, 164));
        beefCancelButton.setForeground(Color.WHITE);
        c.add(beefCancelButton);

        muttonCancelButton = new JButton("rem");
        muttonCancelButton.setBounds(765, 170, 55, 20);
        muttonCancelButton.setCursor(cur);
        muttonCancelButton.setFont(font2);
        muttonCancelButton.setBackground(new Color(122, 136, 164));
        muttonCancelButton.setForeground(Color.WHITE);
        c.add(muttonCancelButton);

        porkCancelButton = new JButton("rem");
        porkCancelButton.setBounds(765, 190, 55, 20);
        porkCancelButton.setCursor(cur);
        porkCancelButton.setFont(font2);
        porkCancelButton.setBackground(new Color(122, 136, 164));
        porkCancelButton.setForeground(Color.WHITE);
        c.add(porkCancelButton);

        riceCancelButton = new JButton("rem");
        riceCancelButton.setBounds(765, 210, 55, 20);
        riceCancelButton.setCursor(cur);
        riceCancelButton.setFont(font2);
        riceCancelButton.setBackground(new Color(122, 136, 164));
        riceCancelButton.setForeground(Color.WHITE);
        c.add(riceCancelButton);

        apCancelButton = new JButton("rem");
        apCancelButton.setBounds(765, 280, 55, 20);
        apCancelButton.setCursor(cur);
        apCancelButton.setFont(font2);
        apCancelButton.setBackground(new Color(122, 136, 164));
        apCancelButton.setForeground(Color.WHITE);
        c.add(apCancelButton);

        mkCancelButton = new JButton("rem");
        mkCancelButton.setBounds(765, 300, 55, 20);
        mkCancelButton.setCursor(cur);
        mkCancelButton.setFont(font2);
        mkCancelButton.setBackground(new Color(122, 136, 164));
        mkCancelButton.setForeground(Color.WHITE);
        c.add(mkCancelButton);

        ltCancelButton = new JButton("rem");
        ltCancelButton.setBounds(765, 320, 55, 20);
        ltCancelButton.setCursor(cur);
        ltCancelButton.setFont(font2);
        ltCancelButton.setBackground(new Color(122, 136, 164));
        ltCancelButton.setForeground(Color.WHITE);
        c.add(ltCancelButton);

        ckCancelButton = new JButton("rem");
        ckCancelButton.setBounds(765, 340, 55, 20);
        ckCancelButton.setCursor(cur);
        ckCancelButton.setFont(font2);
        ckCancelButton.setBackground(new Color(122, 136, 164));
        ckCancelButton.setForeground(Color.WHITE);
        c.add(ckCancelButton);

        ccCancelButton = new JButton("rem");
        ccCancelButton.setBounds(765, 360, 55, 20);
        ccCancelButton.setCursor(cur);
        ccCancelButton.setFont(font2);
        ccCancelButton.setBackground(new Color(122, 136, 164));
        ccCancelButton.setForeground(Color.WHITE);
        c.add(ccCancelButton);

        tCancelButton = new JButton("rem");
        tCancelButton.setBounds(765, 430, 55, 20);
        tCancelButton.setCursor(cur);
        tCancelButton.setFont(font2);
        tCancelButton.setBackground(new Color(122, 136, 164));
        tCancelButton.setForeground(Color.WHITE);
        c.add(tCancelButton);

        cCancelButton = new JButton("rem");
        cCancelButton.setBounds(765, 450, 55, 20);
        cCancelButton.setCursor(cur);
        cCancelButton.setFont(font2);
        cCancelButton.setBackground(new Color(122, 136, 164));
        cCancelButton.setForeground(Color.WHITE);
        c.add(cCancelButton);

        ojCancelButton = new JButton("rem");
        ojCancelButton.setBounds(765, 470, 55, 20);
        ojCancelButton.setCursor(cur);
        ojCancelButton.setFont(font2);
        ojCancelButton.setBackground(new Color(122, 136, 164));
        ojCancelButton.setForeground(Color.WHITE);
        c.add(ojCancelButton);

        mjCancelButton = new JButton("rem");
        mjCancelButton.setBounds(765, 490, 55, 20);
        mjCancelButton.setCursor(cur);
        mjCancelButton.setFont(font2);
        mjCancelButton.setBackground(new Color(122, 136, 164));
        mjCancelButton.setForeground(Color.WHITE);
        c.add(mjCancelButton);

        csCancelButton = new JButton("rem");
        csCancelButton.setBounds(765, 510, 55, 20);
        csCancelButton.setCursor(cur);
        csCancelButton.setFont(font2);
        csCancelButton.setBackground(new Color(122, 136, 164));
        csCancelButton.setForeground(Color.WHITE);
        c.add(csCancelButton);

        billButton = new JButton("Food Bill");
        billButton.setBounds(850, 130, 120, 30);
        billButton.setCursor(cur);
        billButton.setFont(font);
        billButton.setBackground(new Color(122, 136, 164));
        billButton.setForeground(Color.WHITE);
        c.add(billButton);

        paymentButton = new JButton("Payment");
        paymentButton.setBounds(850, 180, 120, 30);
        paymentButton.setCursor(cur);
        paymentButton.setFont(font);
        paymentButton.setBackground(new Color(122, 136, 164));
        paymentButton.setForeground(Color.WHITE);
        c.add(paymentButton);

        backButton = new JButton("Back");
        backButton.setBounds(850, 230, 120, 30);
        backButton.setCursor(cur);
        backButton.setFont(font);
        backButton.setBackground(new Color(122, 136, 164));
        backButton.setForeground(Color.WHITE);
        c.add(backButton);

        c.add(billButton);

        // Action Listener
        billButton.addActionListener(this);
        paymentButton.addActionListener(this);
        backButton.addActionListener(this);
        billButton.addActionListener(this);
        fishBillButton.addActionListener(this);
        muttonBillButton.addActionListener(this);
        beefBillButton.addActionListener(this);
        porkBillButton.addActionListener(this);
        riceBillButton.addActionListener(this);
        apBillButton.addActionListener(this);
        mkBillButton.addActionListener(this);
        ltBillButton.addActionListener(this);
        ckBillButton.addActionListener(this);
        ccBillButton.addActionListener(this);
        tBillButton.addActionListener(this);
        cBillButton.addActionListener(this);
        ojBillButton.addActionListener(this);
        mjBillButton.addActionListener(this);
        csBillButton.addActionListener(this);

        fishCancelButton.addActionListener(this);
        muttonCancelButton.addActionListener(this);
        beefCancelButton.addActionListener(this);
        porkCancelButton.addActionListener(this);
        riceCancelButton.addActionListener(this);
        apCancelButton.addActionListener(this);
        mkCancelButton.addActionListener(this);
        ltCancelButton.addActionListener(this);
        ckCancelButton.addActionListener(this);
        ccCancelButton.addActionListener(this);
        tCancelButton.addActionListener(this);
        cCancelButton.addActionListener(this);
        ojCancelButton.addActionListener(this);
        mjCancelButton.addActionListener(this);
        csCancelButton.addActionListener(this);

        //Backgroud Image
        img =new ImageIcon(ClassLoader.getSystemResource("IMAGE/Hotel_BG.jpg"));
        bgpic=new JLabel(img);
        bgpic.setBounds(0,0,1920,1080);
        c.add(bgpic);
    }



    public void actionPerformed(ActionEvent e)
    {
        if(fishCheckBox.isSelected())
        {
            if(e.getSource().equals(fishBillButton))
            {
                String number = fishShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                fishBillShowLabel.setText("" + 500 * numberInt);
            }
        }

        if (muttonCheckBox.isSelected()) {
            if (e.getSource().equals(muttonBillButton)) {
                String number = muttonShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                muttonBillShowLabel.setText("" + 900 * numberInt);
            }
        }

        if (porkCheckBox.isSelected()) {
            if (e.getSource().equals(porkBillButton)) {
                String number = porkShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                porkBillShowLabel.setText("" + 1000 * numberInt);
            }
        }
        if (riceCheckBox.isSelected()) {
            if (e.getSource().equals(riceBillButton)) {
                String number = riceShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                riceBillShowLabel.setText("" + 100 * numberInt);
            }
        }
        if (applePieCheckBox.isSelected()) {
            if (e.getSource().equals(apBillButton)) {
                String number = apShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                apBillShowLabel.setText("" + 200 * numberInt);
            }
        }
        if (malaiKulfiCheckBox.isSelected()) {
            if (e.getSource().equals(mkBillButton)) {
                String number = mkShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                mkBillShowLabel.setText("" + 200 * numberInt);
            }
        }
        if (lemonTartCheckBox.isSelected()) {
            if (e.getSource().equals(ltBillButton)) {
                String number = ltShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                ltBillShowLabel.setText("" + 200 * numberInt);
            }
        }
        if (coconutKheerCheckBox.isSelected()) {
            if (e.getSource().equals(ckBillButton)) {
                String number = ckShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                ckBillShowLabel.setText("" + 250 * numberInt);
            }
        }
        if (cupCakeCheckBox.isSelected()) {
            if (e.getSource().equals(ccBillButton)) {
                String number = ccShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                ccBillShowLabel.setText("" + 250 * numberInt);
            }
        }
        if (tCheckBox.isSelected()) {
            if (e.getSource().equals(tBillButton)) {
                String number = tShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                tBillShowLabel.setText("" + 100 * numberInt);
            }
        }
        if (cCheckBox.isSelected()) {
            if (e.getSource().equals(cBillButton)) {
                String number = cShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                cBillShowLabel.setText("" + 150 * numberInt);
            }
        }
        if (ojCheckBox.isSelected()) {
            if (e.getSource().equals(ojBillButton)) {
                String number = ojShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                ojBillShowLabel.setText("" + 300 * numberInt);
            }
        }
        if (mjCheckBox.isSelected()) {
            if (e.getSource().equals(mjBillButton)) {
                String number = mjShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                mjBillShowLabel.setText("" + 300 * numberInt);
            }
        }
        if (csCheckBox.isSelected()) {
            if (e.getSource().equals(csBillButton)) {
                String number = csShowLabel.getText().toString();
                int numberInt = Integer.parseInt(number);
                csBillShowLabel.setText("" + 350 * numberInt);
            }
        }

        if (e.getSource().equals(fishCancelButton)) {

            fishBillShowLabel.setText("0");
        }

        if (e.getSource().equals(beefCancelButton)) {

            beefBillShowLabel.setText("0");
        }

        if (e.getSource().equals(muttonCancelButton)) {

            muttonBillShowLabel.setText("0");
        }

        if (e.getSource().equals(porkCancelButton)) {

            porkBillShowLabel.setText("0");
        }

        if (e.getSource().equals(riceCancelButton)) {

            riceBillShowLabel.setText("0");
        }

        if (e.getSource().equals(apCancelButton)) {

            apBillShowLabel.setText("0");
        }

        if (e.getSource().equals(mkCancelButton)) {

            mkBillShowLabel.setText("0");
        }

        if (e.getSource().equals(ltCancelButton)) {

            ltBillShowLabel.setText("0");
        }

        if (e.getSource().equals(ckCancelButton)) {

            ckBillShowLabel.setText("0");
        }

        if (e.getSource().equals(ccCancelButton)) {

            ccBillShowLabel.setText("0");
        }

        if (e.getSource().equals(tCancelButton)) {

            tBillShowLabel.setText("0");
        }

        if (e.getSource().equals(cCancelButton)) {

            cBillShowLabel.setText("0");
        }

        if (e.getSource().equals(ojCancelButton)) {

            ojBillShowLabel.setText("0");
        }

        if (e.getSource().equals(mjCancelButton)) {

            mjBillShowLabel.setText("0");
        }

        if (e.getSource().equals(csCancelButton)) {

            csBillShowLabel.setText("0");
        }

        // Bill Button

        if (e.getSource().equals(billButton)) {

            int fish = 0;
            int beef = 0;
            int mutton = 0;
            int pork = 0;
            int rice = 0;
            int ap = 0;
            int mk = 0;
            int lt = 0;
            int ck = 0;
            int cc = 0;
            int t = 0;
            int c = 0;
            int oj = 0;
            int mj = 0;
            int cs = 0;

            fish = Integer.parseInt(fishBillShowLabel.getText().toString());
            beef = Integer.parseInt(beefBillShowLabel.getText().toString());
            mutton = Integer.parseInt(muttonBillShowLabel.getText().toString());
            pork = Integer.parseInt(porkBillShowLabel.getText().toString());
            rice = Integer.parseInt(riceBillShowLabel.getText().toString());
            ap = Integer.parseInt(apBillShowLabel.getText().toString());
            mk = Integer.parseInt(mkBillShowLabel.getText().toString());
            lt = Integer.parseInt(ltBillShowLabel.getText().toString());
            ck = Integer.parseInt(ckBillShowLabel.getText().toString());
            cc = Integer.parseInt(ccBillShowLabel.getText().toString());
            t = Integer.parseInt(tBillShowLabel.getText().toString());
            c = Integer.parseInt(cBillShowLabel.getText().toString());
            oj = Integer.parseInt(ojBillShowLabel.getText().toString());
            mj = Integer.parseInt(mjBillShowLabel.getText().toString());
            cs = Integer.parseInt(csBillShowLabel.getText().toString());

            int totalBill = fish + beef + mutton + pork + rice + ap + mk + lt + ck + cc + t + c + oj + mj + cs;

            foodBillShowLabel.setText("" + totalBill);
        }

        if (e.getSource() == paymentButton) {

            ImageIcon iconOfYesNo = new ImageIcon("paid.png");
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to pay food bill through online?", "Payment",
                    JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, iconOfYesNo);

            if (choice == JOptionPane.YES_OPTION) {

                ImageIcon icon = new ImageIcon("onlinepayment.png");
                String[] options = { "Card", "Mobile Banking" };
                int method = JOptionPane.showOptionDialog(null, "Select method",
                        "Payment", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options,
                        options[0]);

                if (method == 0) {

                    ImageIcon iconOfCard = new ImageIcon("card.png");
                    String cardNumber = (String) JOptionPane.showInputDialog(null, "Enter your Card number",
                            "Card number", JOptionPane.QUESTION_MESSAGE, iconOfCard, null, "xxxx-xxxxxx-xxxxx");// as
                    // it's
                    // string
                    // initial
                    // selection value
                    // string hobe

                    // eikhane kew dui ba tar otodik bar payment korte pare..se khetre kintu total
                    // bill ekoi thakbe ebong joto bar payment korbe totobar due,and paidbill
                    // immidiate ager payment er sapekkhe change hobe..
                    // ejonno due=deu-paidamount;
                    // totalPaid=totalPaid+paidAmount

                    // thinking erokom na kore direct int totalPaid=0 diye ki ki problem hoto
                    int totalPaid = 0;
                    int due = Integer.parseInt(foodBillShowLabel.getText());// Integer.parseInt() diye int e convert
                    // kore

                    String paid = (String) JOptionPane.showInputDialog(null,
                            "Your food bill:" + due,
                            "Amount", JOptionPane.QUESTION_MESSAGE, iconOfCard, null, "" + due);

                    String pin = (String) JOptionPane.showInputDialog(null,
                            "Enter otp code", "Pin number", JOptionPane.INFORMATION_MESSAGE, iconOfCard, null,
                            "");

                    int paidAmount = Integer.parseInt(paid);
                    due = due - paidAmount;

                    totalPaid = totalPaid + paidAmount;

                    JOptionPane.showMessageDialog(null,
                            "Your payment is succesfully paid " + paidAmount + "tk" + "\nYour due payment " + due
                                    + "tk",
                            "Payment succesful", JOptionPane.QUESTION_MESSAGE, iconOfCard);

                    foodBillShowLabel.setText("" + due);

                } else {

                    String[] optionsOfMobileBanking = { "BKash", "Rocket", "Nagad" };
                    ImageIcon iconOfMobileBanking = new ImageIcon("mobilebanking.png");
                    String methodOfMobileBanking = (String) JOptionPane.showInputDialog(null, "Select method",
                            "Mobile banking", JOptionPane.QUESTION_MESSAGE, iconOfMobileBanking, optionsOfMobileBanking,
                            optionsOfMobileBanking[2]);
                    if (methodOfMobileBanking.equals("BKash")) {

                        ImageIcon iconOfCard = new ImageIcon("bkash.jpg");
                        String MobileNumber = (String) JOptionPane.showInputDialog(null, "Enter your mobile number",
                                "Mobile number", JOptionPane.QUESTION_MESSAGE, iconOfCard, null, "xxx-xxxxxxxx");// as

                        // eikhane kew dui ba tar otodik bar payment korte pare..se khetre kintu total
                        // bill ekoi thakbe ebong joto bar payment korbe totobar due,and paidbill
                        // immidiate ager payment er sapekkhe change hobe..
                        // ejonno due=deu-paidamount;
                        // totalPaid=totalPaid+paidAmount

                        // thinking erokom na kore direct int totalPaid=0 diye ki ki problem hoto
                        int totalPaid = 0;
                        int due = Integer.parseInt(foodBillShowLabel.getText());// Integer.parseInt() diye int e convert
                        // kore

                        String paid = (String) JOptionPane.showInputDialog(null,
                                "Your bill :" + due,
                                "Amount", JOptionPane.QUESTION_MESSAGE, iconOfCard, null, "" + due);

                        String pin = (String) JOptionPane.showInputDialog(null,
                                "Enter otp number", "Pin number", JOptionPane.INFORMATION_MESSAGE, iconOfCard, null,
                                "");

                        int paidAmount = Integer.parseInt(paid);
                        due = due - paidAmount;

                        totalPaid = totalPaid + paidAmount;

                        JOptionPane.showMessageDialog(null,
                                "Your payment is succesfully paid " + paidAmount + "tk" + "\nYour due payment " + due
                                        + "tk",
                                "Payment succeful", JOptionPane.QUESTION_MESSAGE, iconOfCard);

                        // paidShowLabel.setText("" + totalPaid);
                        foodBillShowLabel.setText("" + due);

                    } else if (methodOfMobileBanking.equals("Rocket")) {

                        ImageIcon iconOfCard = new ImageIcon("rocket.png");
                        String MobileNumber = (String) JOptionPane.showInputDialog(null, "Enter your mobile number",
                                "Mobile number", JOptionPane.QUESTION_MESSAGE, iconOfCard, null, "xxx-xxxxxxxx");// as

                        // eikhane kew dui ba tar otodik bar payment korte pare..se khetre kintu total
                        // bill ekoi thakbe ebong joto bar payment korbe totobar due,and paidbill
                        // immidiate ager payment er sapekkhe change hobe..
                        // ejonno due=deu-paidamount;
                        // totalPaid=totalPaid+paidAmount

                        int totalPaid = 0;
                        int due = Integer.parseInt(foodBillShowLabel.getText());// Integer.parseInt() diye int e convert
                        // kore

                        String paid = (String) JOptionPane.showInputDialog(null,
                                "Your bill :" + due,
                                "Amount", JOptionPane.QUESTION_MESSAGE, iconOfCard, null, "" + due);

                        String pin = (String) JOptionPane.showInputDialog(null,
                                "Enter otp number", "Pin number", JOptionPane.INFORMATION_MESSAGE, iconOfCard, null,
                                "");

                        int paidAmount = Integer.parseInt(paid);
                        due = due - paidAmount;

                        totalPaid = totalPaid + paidAmount;

                        JOptionPane.showMessageDialog(null,
                                "Your payment is succesfully paid " + paidAmount + "tk" + "\nYour due payment " + due
                                        + "tk",
                                "Payment succeful", JOptionPane.QUESTION_MESSAGE, iconOfCard);

                        // paidShowLabel.setText("" + totalPaid);
                        foodBillShowLabel.setText("" + due);

                        // thinking erokom na kore direct int totalPaid=0 diye ki ki problem hoto

                    } else {
                        ImageIcon iconOfCard = new ImageIcon("nagad.png");
                        String MobileNumber = (String) JOptionPane.showInputDialog(null, "Enter your mobile number",
                                "Mobile number", JOptionPane.QUESTION_MESSAGE, iconOfCard, null, "xxx-xxxxxxxx");// as

                        // eikhane kew dui ba tar otodik bar payment korte pare..se khetre kintu total
                        // bill ekoi thakbe ebong joto bar payment korbe totobar due,and paidbill
                        // immidiate ager payment er sapekkhe change hobe..
                        // ejonno due=deu-paidamount;
                        // totalPaid=totalPaid+paidAmount

                        // thinking erokom na kore direct int totalPaid=0 diye ki ki problem hoto
                        int totalPaid = 0;
                        int due = Integer.parseInt(foodBillShowLabel.getText());// Integer.parseInt() diye int e convert
                        // kore

                        String paid = (String) JOptionPane.showInputDialog(null,
                                "Your bill :" + due,
                                "Amount", JOptionPane.QUESTION_MESSAGE, iconOfCard, null, "" + due);

                        String pin = (String) JOptionPane.showInputDialog(null,
                                "Enter otp number", "Pin number", JOptionPane.INFORMATION_MESSAGE, iconOfCard, null,
                                "");

                        int paidAmount = Integer.parseInt(paid);
                        due = due - paidAmount;

                        totalPaid = totalPaid + paidAmount;

                        JOptionPane.showMessageDialog(null,
                                "Your payment is succesfully paid " + paidAmount + "tk" + "\nYour due payment " + due
                                        + "tk",
                                "Payment succeful", JOptionPane.QUESTION_MESSAGE, iconOfCard);

                        // paidShowLabel.setText("" + totalPaid);
                        foodBillShowLabel.setText("" + due);

                    }
                }

            } else {

                System.exit(0);

            }

        }
        if (e.getSource() == backButton) {

            this.dispose();
            new CusLogin().setVisible(true);

        }

    }
    public String reader(String str) {
        String text = null;
        BufferedReader txtReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(str)));
        try {
            text = txtReader.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return text;
    }




}
