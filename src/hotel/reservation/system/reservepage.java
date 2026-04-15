/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.MatteBorder;


/**
 *
 * @author User
 */
public class reservepage extends JFrame implements ActionListener {
    private JButton submit;
    JLabel fname, lname, add1, add2, city, state, zip, phone, email, 
            intime, indate, outtime, outdate, pref, adult, child, x,contactPhone,contactEmail;
    JTextField fld1, fld2,fld3, fld4, fld5, fld6, fld7, fld8, fld9, fld10, fld11, fld12, fld13, fld14, fld15;
    JRadioButton standard, deluxe, suite;
    JTextArea y;
    JPanel leftLine,rightLine;
    private JLabel headline,welcometxt;
    
    reservepage() {
        setSize(1000,975);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon rawImage = new ImageIcon(getClass().getResource("reserveheadline.png"));
        Image scaledImage = rawImage.getImage().getScaledInstance(1000, 250, Image.SCALE_SMOOTH);
        headline = new JLabel(new ImageIcon(scaledImage));
        headline.setBounds(0, 0, 1000, 250);
        add(headline);
        
        welcometxt = new JLabel("Reservation Details", SwingConstants.CENTER);
        welcometxt.setFont(new Font("Serif", Font.ITALIC, 22));
        welcometxt.setBounds(350, 330, 300, 40);
        add(welcometxt);
        
        leftLine = new JPanel();
        leftLine.setBackground(new Color(230, 230, 230));
        leftLine.setBounds(100, 350, 250, 1); 
        add(leftLine);
        
        rightLine = new JPanel();
        rightLine.setBackground(new Color(230, 230, 230));
        rightLine.setBounds(650, 350, 250, 1); 
        add(rightLine);
        
        contactPhone = new JLabel("Contact Us +67676767");
        contactPhone.setFont(new Font("Serif", Font.PLAIN, 11));
        contactPhone.setForeground(Color.GRAY);
        contactPhone.setBounds(100, 250, 200, 25);
        add(contactPhone);

        contactEmail = new JLabel("Giovanni@Madrigal.com", SwingConstants.RIGHT);
        contactEmail.setFont(new Font("Serif", Font.PLAIN, 11));
        contactEmail.setForeground(Color.GRAY);
        contactEmail.setBounds(700, 250, 200, 25);
        add(contactEmail);
        
        fname = new JLabel("FIRST NAME");
        fname.setFont(new Font("SansSerif", Font.BOLD, 10));
        fname.setForeground(Color.BLACK);
        fname.setBounds(100, 380, 100, 20);
        add(fname);
        
        fld1 = new JTextField();
        fld1.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld1.setBounds(100, 405, 385, 25);
        add(fld1);
        
        lname = new JLabel("LAST NAME");
        lname.setFont(new Font("SansSerif", Font.BOLD, 10));
        lname.setForeground(Color.BLACK);
        lname.setBounds(515, 380, 100, 20);
        add(lname);
        
        fld2 = new JTextField();
        fld2.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld2.setBounds(515, 405, 385, 25);
        add(fld2);
        
        add1 = new JLabel("ADDRESS");
        add1.setFont(new Font("SansSerif", Font.BOLD, 10));
        add1.setForeground(Color.BLACK);
        add1.setBounds(100, 450, 100, 20);
        add(add1);
        
        fld3 = new JTextField();
        fld3.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld3.setBounds(100, 475, 800, 25);
        add(fld3);
        
        city = new JLabel("CITY");
        city.setFont(new Font("SansSerif", Font.BOLD, 10));
        city.setForeground(Color.BLACK);
        city.setBounds(100, 520, 100, 20);
        add(city);
        
        fld5 = new JTextField();
        fld5.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld5.setBounds(100, 545, 250, 25);
        add(fld5);
        
        state = new JLabel("STATE");
        state.setFont(new Font("SansSerif", Font.BOLD, 10));
        state.setForeground(Color.BLACK);
        state.setBounds(375, 520, 50, 20);
        add(state);
        
        fld6 = new JTextField();
        fld6.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld6.setBounds(375, 545, 250, 25);
        add(fld6);
        
        zip = new JLabel("ZIP CODE");
        zip.setFont(new Font("SansSerif", Font.BOLD, 10));
        zip.setForeground(Color.BLACK);
        zip.setBounds(650, 520, 100, 20);
        add(zip);
        
        fld7 = new JTextField();
        fld7.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld7.setBounds(650, 545, 250, 25);
        add(fld7);
        
        phone = new JLabel("Phone Number");
        phone.setFont(new Font("SansSerif", Font.BOLD, 10));
        phone.setForeground(Color.BLACK);
        phone.setBounds(100, 590, 150, 20);
        add(phone);
        
        fld8 = new JTextField();
        fld8.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld8.setBounds(100, 615, 385, 25);
        add(fld8);
        
        email = new JLabel("Email Address");
        email.setFont(new Font("SansSerif", Font.BOLD, 10));
        email.setForeground(Color.BLACK);
        email.setBounds(515, 590, 150, 20);
        add(email);
        
        fld9 = new JTextField();
        fld9.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld9.setBounds(515, 615, 385, 25);
        add(fld9);
        
        indate = new JLabel("CHECK-IN (DATE / TIME)");
        indate.setFont(new Font("SansSerif", Font.BOLD, 10));
        indate.setForeground(Color.BLACK);
        indate.setBounds(100, 660, 200, 20);
        add(indate);
        
        fld10 = new JTextField(); //eto yung date
        fld10.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld10.setBounds(100, 685, 185, 25);
        add(fld10);
       
        fld11 = new JTextField(); //eto yung time 
        fld11.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld11.setBounds(300, 685, 185, 25);
        add(fld11);
        
        outdate = new JLabel("CHECK-OUT (DATE / TIME)");
        outdate.setFont(new Font("SansSerif", Font.BOLD, 10));
        outdate.setForeground(Color.BLACK);
        outdate.setBounds(515, 660, 200, 20);
        add(outdate);
        
        fld12 = new JTextField();
        fld12.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld12.setBounds(515, 685, 185, 25);
        add(fld12);
        
        fld13 = new JTextField();
        fld13.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld13.setBounds(715, 685, 185, 25);
        add(fld13);
        
        pref = new JLabel("ROOM PREFERENCE");
        pref.setFont(new Font("SansSerif", Font.BOLD, 10));
        pref.setForeground(Color.BLACK);
        pref.setBounds(100, 730, 200, 20);
        add(pref);
        
        standard = new JRadioButton("Standard");
        standard.setBackground(Color.WHITE);
        standard.setBounds(100, 755, 90, 25);
        add(standard);
        
        deluxe = new JRadioButton("Deluxe");
        deluxe.setBackground(Color.WHITE);
        deluxe.setBounds(190, 755, 90, 25);
        add(deluxe);
        
        suite = new JRadioButton("Suite");
        suite.setBackground(Color.WHITE);
        suite.setBounds(280, 755, 90, 25);
        add(suite);
        
        ButtonGroup group = new ButtonGroup();
        group.add(standard); group.add(deluxe); group.add(suite);
        
        adult = new JLabel("NUMBER OF ADULTS");
        adult.setFont(new Font("SansSerif", Font.BOLD, 10));
        adult.setForeground(Color.BLACK);
        adult.setBounds(515, 730, 160, 20);
        add(adult);

        fld14 = new JTextField();
        fld14.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld14.setBounds(515, 755, 185, 25);
        add(fld14);

        child = new JLabel("NUMBER OF CHILDREN");
        child.setFont(new Font("SansSerif", Font.BOLD, 10));
        child.setForeground(Color.BLACK);
        child.setBounds(715, 730, 160, 20);
        add(child);

        fld15 = new JTextField();
        fld15.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        fld15.setBounds(715, 755, 185, 25);
        add(fld15);

        
        x = new JLabel("SPECIAL INSTRUCTIONS");
        x.setFont(new Font("SansSerif", Font.BOLD, 10));
        x.setForeground(Color.BLACK);
        x.setBounds(100, 800, 200, 20);
        add(x);

        y = new JTextArea();
        y.setBackground(new Color(250, 250, 250));
        y.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        y.setBounds(100, 825, 800, 50);
        y.setLineWrap(true);
        add(y);
        

        
        submit = new JButton("CONFIRM RESERVATION");
        submit.setFont(new Font("SansSerif", Font.BOLD, 12));
        submit.setBackground(new Color(27, 60, 83));
        submit.setForeground(Color.WHITE);
        submit.setFocusPainted(false);
        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        submit.setBounds(350, 885, 300, 45);
        add(submit);
        submit.addActionListener(this);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == submit) {
            
           String roomPref = "";
           
           String firstname = fld1.getText();
           String lastname = fld12.getText();
           String address1 = fld3.getText();
           String address2 = fld4.getText();
           String cityname = fld5.getText();
           String statename = fld6.getText();
           String zipval = fld7.getText();
           String phonenum = fld8.getText();
           String emailval = fld9.getText();
           String inDate = fld10.getText();
           String inTime = fld11.getText();
           String outDate = fld12.getText();
           String outTime = fld13.getText();
           String adults = fld14.getText();
           String children = fld15.getText();
           
           String notes = y.getText();
           
           if (standard.isSelected()) roomPref = "Standard";
           else if (deluxe.isSelected()) roomPref = "Deluxe";
           else if (suite.isSelected()) roomPref = "Suite";
           
           JOptionPane.showMessageDialog(this, "Reservation Added!");
           
           this.dispose();
           
           new SummaryPage(
                   firstname, lastname,
                   address1, address2,
                   cityname, statename,
                   zipval, phonenum,
                   emailval, inDate,
                   inTime, outDate,
                   outTime, roomPref, 
                   adults, children, 
                   notes
           );
           
           //new hotelmenu().setVisible(true);
        }
    }
    
} 
