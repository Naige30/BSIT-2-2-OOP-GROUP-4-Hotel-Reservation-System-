/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author User
 */
public class reservepage extends JFrame implements ActionListener {
    private JButton submit;
    JLabel fname, lname, add1, add2, city, state, zip, phone, email, intime, indate, outtime, outdate, pref, adult, child, x;
    JTextField fld1, fld2,fld3, fld4, fld5, fld6, fld7, fld8, fld9, fld10, fld11, fld12, fld13, fld14, fld15;
    JRadioButton standard, deluxe, suite;
    JTextArea y;
    
    reservepage() {
        setSize(600,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        fname = new JLabel("First Name");
        fname.setBounds(100, 100, 100, 20);
        add(fname);
        
        fld1 = new JTextField();
        fld1.setBounds(100, 130, 170, 20);
        add(fld1);
        
        lname = new JLabel("Last Name");
        lname.setBounds(280, 100, 100, 20);
        add(lname);
        
        fld2 = new JTextField();
        fld2.setBounds(280, 130, 170, 20);
        add(fld2);
        
        add1 = new JLabel("Address 1");
        add1.setBounds(100, 160, 100, 20);
        add(add1);
        
        fld3 = new JTextField();
        fld3.setBounds(100, 190, 170, 20);
        add(fld3);
        
        add2 = new JLabel("Address 2");
        add2.setBounds(280, 160, 100, 20);
        add(add2);
        
        fld4 = new JTextField();
        fld4.setBounds(280, 190, 170, 20);
        add(fld4);
        
        city = new JLabel("City");
        city.setBounds(100, 220, 100, 20);
        add(city);
        
        fld5 = new JTextField();
        fld5.setBounds(100, 250, 170, 20);
        add(fld5);
        
        state = new JLabel("State");
        state.setBounds(280, 220, 50, 20);
        add(state);
        
        fld6 = new JTextField();
        fld6.setBounds(280, 250, 60, 20);
        add(fld6);
        
        zip = new JLabel("Zip Code");
        zip.setBounds(350, 220, 100, 20);
        add(zip);
        
        fld7 = new JTextField();
        fld7.setBounds(350, 250, 100, 20);
        add(fld7);
        
        phone = new JLabel("Phone Number");
        phone.setBounds(100, 280, 100, 20);
        add(phone);
        
        fld8 = new JTextField();
        fld8.setBounds(100, 310, 170, 20);
        add(fld8);
        
        email = new JLabel("Email Address");
        email.setBounds(280, 280, 100, 20);
        add(email);
        
        fld9 = new JTextField();
        fld9.setBounds(280, 310, 170, 20);
        add(fld9);
        
        indate = new JLabel("Check-in Date");
        indate.setBounds(100, 340, 80, 20);
        add(indate);
        
        fld10 = new JTextField();
        fld10.setBounds(100, 370, 85, 20);
        add(fld10);
        
        intime = new JLabel("Check-in Time");
        intime.setBounds(200, 340, 100, 20);
        add(intime);
        
        fld11 = new JTextField();
        fld11.setBounds(200, 370, 85, 20);
        add(fld11);
        
        outdate = new JLabel("Check-out Date");
        outdate.setBounds(300, 340, 100, 20);
        add(outdate);
        
        fld12 = new JTextField();
        fld12.setBounds(300, 370, 85, 20);
        add(fld12);
        
        outtime = new JLabel("Check-out Time");
        outtime.setBounds(400, 340, 100, 20);
        add(outtime);
        
        fld13 = new JTextField();
        fld13.setBounds(400, 370, 85, 20);
        add(fld13);
        
        pref = new JLabel("Room Preference");
        pref.setBounds(100, 400, 100, 20);
        add(pref);
        
        standard = new JRadioButton("Standard");
        standard.setBounds(100, 430, 100, 30);
        add(standard);
        
        deluxe = new JRadioButton("Deluxe");
        deluxe.setBounds(200, 430, 100, 30);
        add(deluxe);
        
        suite = new JRadioButton("Suite");
        suite.setBounds(300, 430, 100, 30);
        add(suite);
        
        adult = new JLabel("Number of adults");
        adult.setBounds(100, 460, 150, 20);
        add(adult);
        
        fld14 = new JTextField();
        fld14.setBounds(100, 490, 80, 20);
        add(fld14);
        
        child = new JLabel("Number of children");
        child.setBounds(250, 460, 150, 20);
        add(child);
        
        fld15 = new JTextField();
        fld15.setBounds(250, 490, 80, 20);
        add(fld15);
        
        x = new JLabel("Special Instructions");
        x.setBounds(100, 520, 100, 20);
        add(x);
        
        y = new JTextArea();
        y.setBounds(100, 550, 400, 60);
        add(y);
        
        submit = new JButton("Submit");
        submit.setBounds(280, 620, 90, 30);
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
