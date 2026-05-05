package hotel.reservation.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class reservepage extends JFrame implements ActionListener {
    private JButton submit, cancel;
    JLabel fname, lname, add1, city, state, zip, phone, email, 
            indate, outdate, pref, adult, child, x, contactPhone, contactEmail;
    JTextField fld1, fld2, fld3, fld5, fld6, fld7, fld8, fld9, fld10, fld11, fld12, fld13, fld14, fld15;
    JRadioButton standard, deluxe, suite, luh;
    JTextArea y;
    JPanel leftLine, rightLine;
    private JLabel headline, welcometxt;

    public reservepage() {
        
        setSize(1000, 975);
        setTitle("Giovanni Madrigal Grand Hotel: A Hotel Reservation System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());

        ImageIcon rawImage = new ImageIcon(getClass().getResource("reserveheadline.png"));
        Image scaledImage = rawImage.getImage().getScaledInstance(1000, 250, Image.SCALE_SMOOTH);
        headline = new JLabel(new ImageIcon(scaledImage));
        headline.setBounds(0, 0, 1000, 250);
        add(headline);

        welcometxt = new JLabel("Reservation Details", SwingConstants.CENTER);
        welcometxt.setFont(new Font("Serif", Font.ITALIC, 22));
        welcometxt.setBounds(350, 280, 300, 40);
        add(welcometxt);

        leftLine = new JPanel();
        leftLine.setBackground(new Color(230, 230, 230));
        leftLine.setBounds(100, 300, 250, 1);
        add(leftLine);

        rightLine = new JPanel();
        rightLine.setBackground(new Color(230, 230, 230));
        rightLine.setBounds(650, 300, 250, 1);
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

        
        ImageIcon userIconRaw = new ImageIcon(getClass().getResource("user.png"));
        Image userScaled = userIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        fname = new JLabel("FIRST NAME", new ImageIcon(userScaled), SwingConstants.LEFT);
        fname.setIconTextGap(8);
        fname.setFont(new Font("SansSerif", Font.BOLD, 10));
        fname.setBounds(100, 340, 150, 20); 
        add(fname);

        fld1 = new JTextField();
        fld1.setBounds(100, 365, 385, 25);
        add(fld1);

        
        ImageIcon userIconRaw2 = new ImageIcon(getClass().getResource("user2.png"));
        Image userScaled2 = userIconRaw2.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        lname = new JLabel("LAST NAME", new ImageIcon(userScaled2), SwingConstants.LEFT);
        lname.setIconTextGap(5);
        lname.setFont(new Font("SansSerif", Font.BOLD, 10));
        lname.setBounds(515, 340, 150, 20);
        add(lname);

        fld2 = new JTextField();
        fld2.setBounds(515, 365, 385, 25);
        add(fld2);

        
        ImageIcon addressIconRaw = new ImageIcon(getClass().getResource("address.png"));
        Image addressScaled = addressIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        add1 = new JLabel("ADDRESS", new ImageIcon(addressScaled), SwingConstants.LEFT);
        add1.setIconTextGap(5);
        add1.setFont(new Font("SansSerif", Font.BOLD, 10));
        add1.setBounds(100, 405, 150, 20); 
        add(add1);

        fld3 = new JTextField();
        fld3.setBounds(100, 430, 800, 25);
        add(fld3);

        
        ImageIcon cityIconRaw = new ImageIcon(getClass().getResource("address2.png"));
        Image cityScaled = cityIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        city = new JLabel("CITY", new ImageIcon(cityScaled), SwingConstants.LEFT);
        city.setIconTextGap(5);
        city.setFont(new Font("SansSerif", Font.BOLD, 10));
        city.setBounds(100, 475, 100, 20); 
        add(city);

        fld5 = new JTextField();
        fld5.setBounds(100, 500, 250, 25);
        add(fld5);

        
        ImageIcon stateIconRaw = new ImageIcon(getClass().getResource("address3.png"));
        Image stateScaled = stateIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        state = new JLabel("STATE", new ImageIcon(stateScaled), SwingConstants.LEFT);
        state.setIconTextGap(5);
        state.setFont(new Font("SansSerif", Font.BOLD, 10));
        state.setBounds(375, 475, 100, 20);
        add(state);

        fld6 = new JTextField();
        fld6.setBounds(375, 500, 250, 25);
        add(fld6);

        
        ImageIcon zipIconRaw = new ImageIcon(getClass().getResource("address4.png"));
        Image zipScaled = zipIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        zip = new JLabel("ZIP CODE", new ImageIcon(zipScaled), SwingConstants.LEFT);
        zip.setIconTextGap(5);
        zip.setFont(new Font("SansSerif", Font.BOLD, 10));
        zip.setBounds(650, 475, 100, 20);
        add(zip);

        fld7 = new JTextField();
        fld7.setBounds(650, 500, 250, 25);
        add(fld7);

        
        ImageIcon phoneIconRaw = new ImageIcon(getClass().getResource("phone.png"));
        Image phoneScaled = phoneIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        phone = new JLabel("PHONE NUMBER", new ImageIcon(phoneScaled), SwingConstants.LEFT);
        phone.setIconTextGap(5);
        phone.setFont(new Font("SansSerif", Font.BOLD, 10));
        phone.setBounds(100, 545, 150, 20);
        add(phone);

        fld8 = new JTextField();
        fld8.setBounds(100, 570, 385, 25);
        add(fld8);

        
        ImageIcon emailIconRaw = new ImageIcon(getClass().getResource("email.png"));
        Image emailScaled = emailIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        email = new JLabel("E-MAIL ADDRESS", new ImageIcon(emailScaled), SwingConstants.LEFT);
        email.setIconTextGap(5);
        email.setFont(new Font("SansSerif", Font.BOLD, 10));
        email.setBounds(515, 545, 150, 20);
        add(email);

        fld9 = new JTextField();
        fld9.setBounds(515, 570, 385, 25);
        add(fld9);

        
        ImageIcon checkInIconRaw = new ImageIcon(getClass().getResource("date.png"));
        Image checkInScaled = checkInIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        indate = new JLabel("CHECK-IN (DATE / TIME)", new ImageIcon(checkInScaled), SwingConstants.LEFT);
        indate.setIconTextGap(5);
        indate.setFont(new Font("SansSerif", Font.BOLD, 10));
        indate.setBounds(100, 615, 200, 20);
        add(indate);

        fld10 = new JTextField("MM/DD/YYYY");
        fld10.setForeground(Color.GRAY);
        fld10.setBounds(100, 640, 185, 25);
        addPlaceholderBehavior(fld10, "MM/DD/YYYY");
        add(fld10);

        fld11 = new JTextField("HH:MM AM/PM");
        fld11.setForeground(Color.GRAY);
        fld11.setBounds(300, 640, 185, 25);
        addPlaceholderBehavior(fld11, "HH:MM AM/PM");
        add(fld11);

        
        ImageIcon checkOutIconRaw = new ImageIcon(getClass().getResource("date2.png"));
        Image checkOutScaled = checkOutIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        outdate = new JLabel("CHECK-OUT (DATE / TIME)", new ImageIcon(checkOutScaled), SwingConstants.LEFT);
        outdate.setIconTextGap(5);
        outdate.setFont(new Font("SansSerif", Font.BOLD, 10));
        outdate.setBounds(515, 615, 200, 20);
        add(outdate);

        fld12 = new JTextField("MM/DD/YYYY");
        fld12.setForeground(Color.GRAY);
        fld12.setBounds(515, 640, 185, 25);
        addPlaceholderBehavior(fld12, "MM/DD/YYYY");
        add(fld12);

        fld13 = new JTextField("HH:MM AM/PM");
        fld13.setForeground(Color.GRAY);
        fld13.setBounds(715, 640, 185, 25);
        addPlaceholderBehavior(fld13, "HH:MM AM/PM");
        add(fld13);

        pref = new JLabel("ROOM PREFERENCE");
        pref.setFont(new Font("SansSerif", Font.BOLD, 10));
        pref.setBounds(100, 685, 200, 20);
        add(pref);

        standard = new JRadioButton("Tuazon Deluxe");
        standard.setBackground(Color.WHITE);
        standard.setBounds(100, 710, 180, 25);
        add(standard);

        deluxe = new JRadioButton("Grande Aviles");
        deluxe.setBackground(Color.WHITE);
        deluxe.setBounds(100, 730, 180, 25);
        add(deluxe);

        suite = new JRadioButton("Casa Lacao");
        suite.setBackground(Color.WHITE);
        suite.setBounds(300, 710, 180, 25);
        add(suite);

        luh = new JRadioButton("Palazzo Arzola");
        luh.setBackground(Color.WHITE);
        luh.setBounds(300, 730, 180, 25);
        add(luh);

        ButtonGroup group = new ButtonGroup();
        group.add(standard); group.add(deluxe); group.add(suite); group.add(luh);

        
        ImageIcon adultIconRaw = new ImageIcon(getClass().getResource("adults.png"));
        Image adultScaled = adultIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        adult = new JLabel("NUMBER OF ADULTS", new ImageIcon(adultScaled), SwingConstants.LEFT);
        adult.setIconTextGap(5);
        adult.setFont(new Font("SansSerif", Font.BOLD, 10));
        adult.setBounds(515, 685, 160, 20);
        add(adult);

        fld14 = new JTextField();
        fld14.setBounds(515, 710, 185, 25);
        add(fld14);

        
        ImageIcon childIconRaw = new ImageIcon(getClass().getResource("childrens.png"));
        Image childScaled = childIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        child = new JLabel("NUMBER OF CHILDREN", new ImageIcon(childScaled), SwingConstants.LEFT);
        child.setIconTextGap(5);
        child.setFont(new Font("SansSerif", Font.BOLD, 10));
        child.setBounds(715, 685, 160, 20);
        add(child);

        fld15 = new JTextField();
        fld15.setBounds(715, 710, 185, 25);
        add(fld15);

        
        ImageIcon specialIconRaw = new ImageIcon(getClass().getResource("instructions.png")); 
        Image specialScaled = specialIconRaw.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        x = new JLabel("SPECIAL INSTRUCTIONS", new ImageIcon(specialScaled), SwingConstants.LEFT);
        x.setIconTextGap(5);
        x.setFont(new Font("SansSerif", Font.BOLD, 10));
        x.setBounds(100, 770, 200, 20); 
        add(x);

        y = new JTextArea();
        y.setBackground(new Color(250, 250, 250));
        y.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        y.setBounds(100, 795, 800, 80); 
        y.setLineWrap(true);
        add(y);

        submit = new JButton("Confirm Reservation");
        submit.setFont(new Font("SansSerif", Font.BOLD, 12));
        submit.setBackground(new Color(27, 60, 83));
        submit.setForeground(Color.WHITE);
        submit.setBounds(510, 885, 250, 45);
        add(submit);

        cancel = new JButton("Cancel Reservation");
        cancel.setBackground(new Color(245, 245, 245));
        cancel.setBounds(240, 885, 250, 45);
        add(cancel);

        submit.addActionListener(this);
        cancel.addActionListener(this);
        
        setVisible(true);
    }

    private void addPlaceholderBehavior(JTextField field, String placeholder) {
        field.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (field.getText().equals(placeholder)) {
                    field.setText("");
                    field.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (field.getText().isEmpty()) {
                    field.setForeground(Color.GRAY);
                    field.setText(placeholder);
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancel) {
            this.dispose();
            new hotelmenu().setVisible(true);
            return;
        }

        if (e.getSource() == submit) {
            if (fld1.getText().isEmpty() || 
                fld2.getText().isEmpty() || 
                fld3.getText().isEmpty() || 
                fld10.getText().equals("MM/DD/YYYY") || 
                fld12.getText().equals("MM/DD/YYYY")) {
                
                JOptionPane.showMessageDialog(this, "Please complete required fields.");
                return;
            }

            String roomPref = "";
            if (standard.isSelected()) roomPref = "Tuazon Deluxe";
            else if (deluxe.isSelected()) roomPref = "Grande Aviles";
            else if (suite.isSelected()) roomPref = "Casa Lacao";
            else if (luh.isSelected()) roomPref = "Palazzo Arzola";

            JOptionPane.showMessageDialog(this, "Reservation Added!");
            this.dispose();
            
            new SummaryPage(
                fld1.getText(), fld2.getText(), fld3.getText(), "",
                fld5.getText(), fld6.getText(), fld7.getText(), fld8.getText(),
                fld9.getText(), fld10.getText(), fld11.getText(), fld12.getText(),
                fld13.getText(), roomPref, fld14.getText(), fld15.getText(), y.getText()
            ).setVisible(true);
        }
    }
}