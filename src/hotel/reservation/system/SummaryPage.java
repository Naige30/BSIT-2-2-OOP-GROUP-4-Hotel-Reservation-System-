package hotel.reservation.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author User
 */
public class SummaryPage extends JFrame implements ActionListener {
    
    JLabel welcome,titlelbl;
    JButton back, cancel;
    JSeparator separator;

    
    
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
        setSize(520, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());

        int y = 100;
        
        titlelbl = new JLabel("Summary", SwingConstants.CENTER);
        titlelbl.setFont(new Font("Serif", Font.BOLD, 32)); 
        titlelbl.setBounds(0, 15, 520, 40);
        add(titlelbl);
        
        welcome = new JLabel("We welcome you to an unforgettable stay!", SwingConstants.CENTER);
        welcome.setFont(new Font("Serif", Font.ITALIC, 15));
        welcome.setForeground(new Color(120, 120, 120));
        welcome.setBounds(0, 55, 520, 20);
        add(welcome);
        
        separator = new JSeparator();
        separator.setBounds(40, 85, 440, 1);
        separator.setForeground(new Color(225, 225, 225));
        add(separator);

        addLabel("Guest Identity: " + fname + " " + lname, y); y += 35;
        addLabel("Residence: " + add1 + ", " + add2 + ", " + city + ", " + state + " " + zip, y); y += 35;
        addLabel("Contact: " + email + " | " + phone, y); y += 35;

        addLabel("Check-in: " + indate + " at " + intime, y); y += 35;
        addLabel("Check-out: " + outdate + " at " + outtime, y); y += 35;

        addLabel("Room Type: " + roomPref, y); y += 30;

        addLabel("Accommodation: " + roomPref + " (" + adults + " Adults, " + children + " Children)", y); y += 35;

        addLabel("Special Requests: " + (notes.isEmpty() ? "None" : notes), y); y += 65;

        back = new JButton("Back");
        back.setBackground(new Color(245, 245, 245));
        back.setForeground(Color.DARK_GRAY);
        back.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        back.setFocusPainted(false);
        back.setBounds(80, y, 160, 40);
        add(back);

        cancel = new JButton("Cancel Reservation");
        cancel.setBounds(260, y, 180, 40);
        cancel.setBackground(new Color(69, 104, 130));
        cancel.setForeground(Color.WHITE);
        cancel.setFocusPainted(false);
        cancel.setBorder(null);
        add(cancel);
        

        back.addActionListener(this);
        cancel.addActionListener(this);
        

        setVisible(true);
    }

    private void addLabel(String text, int y) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("SansSerif", Font.PLAIN, 13));
        label.setForeground(new Color(80, 80, 80));
        label.setBounds(50, y, 420, 25);
        label.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(248, 248, 248)));
        add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

     if (e.getSource() == back) {
            this.dispose();
            new hotelmenu().setVisible(true);
        }
        else if (e.getSource() == cancel) {
            int response = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to cancel your reservation?", 
                "Confirm Cancellation", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
            
            if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Reservation Cancelled!");
            this.dispose();
            new hotelmenu().setVisible(true);
        }
    }
  }
}