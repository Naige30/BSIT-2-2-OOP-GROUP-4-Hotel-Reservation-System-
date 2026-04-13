/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author User
 */
public class SummaryPage extends JFrame implements ActionListener {

    JButton back;
    
    SummaryPage(
        String fname, String lname,
        String add1, String add2,
        String city, String state, String zip,
        String phone, String email,
        String indate, String intime,
        String outdate, String outtime,
        String roomPref,
        String adults, String children,
        String notes
    ) {

        setTitle("Reservation Summary");
        setSize(500, 500);
        setLayout(null);
        setLocationRelativeTo(null);

        int y = 30;

        addLabel("Name: " + fname + " " + lname, y); y += 30;
        addLabel("Address: " + add1 + ", " + add2, y); y += 30;
        addLabel("City/State/Zip: " + city + ", " + state + ", " + zip, y); y += 30;

        addLabel("Phone: " + phone, y); y += 30;
        addLabel("Email: " + email, y); y += 30;

        addLabel("Check-in Date: " + indate, y); y += 30;
        addLabel("Check-in Time: " + intime, y); y += 30;
        addLabel("Check-out Date: " + outdate + " " + outtime, y); y += 30;
        addLabel("Check-out Time: " + intime, y); y += 30;

        addLabel("Room Type: " + roomPref, y); y += 30;

        addLabel("Adults: " + adults + " | Children: " + children, y); y += 30;

        addLabel("Special Instructions:", y); y += 30;
        addLabel(notes, y); y += 20;

        back = new JButton("Back");
        back.setBounds(190, y, 90, 30);
        add(back);

        back.addActionListener(this);

        setVisible(true);
    }

    private void addLabel(String text, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(30, y, 420, 25);
        add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == back) {
            this.dispose();
            new hotelmenu().setVisible(true);
        }
    }
}