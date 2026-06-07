package hotel.reservation.system.view;

import hotel.reservation.system.model.Room;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class signup extends JFrame implements ActionListener {
   
    private JButton submitbtn, cancelbtn;    
    private JPasswordField passinp; 
    private JComboBox<String> monthBox, dayBox, yearBox;
    private JTextField userinp, emailinp, numberinp;
    private JLabel userlbl, passlbl, emaillbl, numberlbl, titlelbl, subTitle, hint, bdaylbl;
    private JSeparator separator;

    public signup() {
        setSize(400, 650);
        setTitle("Giovanni Madrigal Grand Hotel: Create an Account");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        
        titlelbl = new JLabel("Sign Up", SwingConstants.CENTER);
        titlelbl.setFont(new Font("Serif", Font.BOLD, 36));
        titlelbl.setBounds(0, 20, 400, 45);
        add(titlelbl);
        
        separator = new JSeparator();
        separator.setBounds(40, 95, 320, 1);
        separator.setForeground(new Color(200, 200, 200));
        add(separator);
        
        subTitle = new JLabel("Start your truly luxury experience.", SwingConstants.CENTER);
        subTitle.setFont(new Font("Serif", Font.ITALIC, 16));
        subTitle.setForeground(new Color(120, 120, 120));
        subTitle.setBounds(0, 65, 400, 20);
        add(subTitle);
        
        userlbl = new JLabel("Username");
        userlbl.setFont(new Font("SansSerif", Font.BOLD, 12));
        userlbl.setBounds(40, 110, 100, 20);
        add(userlbl);
        
        userinp = new JTextField();
        userinp.setFont(new Font("SansSerif", Font.PLAIN, 13));
        userinp.setBounds(40, 135, 320, 35);
        userinp.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        add(userinp);
        
        emaillbl = new JLabel("Email");
        emaillbl.setFont(new Font("SansSerif", Font.BOLD, 12));
        emaillbl.setBounds(40, 180, 100, 20);
        add(emaillbl);

        emailinp = new JTextField();
        emailinp.setFont(new Font("SansSerif", Font.PLAIN, 13));
        emailinp.setBounds(40, 205, 320, 35);
        emailinp.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        add(emailinp);

        passlbl = new JLabel("Password");
        passlbl.setFont(new Font("SansSerif", Font.BOLD, 12));
        passlbl.setBounds(40, 250, 100, 20);
        add(passlbl);

        passinp = new JPasswordField();
        passinp.setBounds(40, 275, 320, 35);
        passinp.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        add(passinp);

        hint = new JLabel("Must be at least 8 characters.");
        hint.setFont(new Font("SansSerif", Font.PLAIN, 11));
        hint.setForeground(new Color(160, 160, 160));
        hint.setBounds(40, 310, 250, 20);
        add(hint);

        numberlbl = new JLabel("Contact No.");
        numberlbl.setFont(new Font("SansSerif", Font.BOLD, 12));
        numberlbl.setBounds(40, 340, 100, 20);
        add(numberlbl);
        
        numberinp = new JTextField();
        numberinp.setFont(new Font("SansSerif", Font.PLAIN, 13));
        numberinp.setBounds(40, 365, 320, 35);
        numberinp.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        add(numberinp);
        
        bdaylbl = new JLabel("Birthdate");
        bdaylbl.setFont(new Font("SansSerif", Font.BOLD, 12));
        bdaylbl.setBounds(40, 415, 90, 30);
        add(bdaylbl);
        
        Color fieldColor = new Color(245, 245, 245);
        LineBorder roundedBorder = new LineBorder(new Color(210, 210, 210), 1, true);
        
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthBox = new JComboBox<>(months);
        monthBox.setSelectedItem("Apr");
        monthBox.setBounds(110, 415, 70, 30);
        monthBox.setBackground(fieldColor);
        monthBox.setBorder(roundedBorder);
        monthBox.setFocusable(false); 
        add(monthBox);
        
        String[] day = new String[31];
        for (int i = 1; i <= 31; i++) {
            day[i - 1] = String.valueOf(i);
        }
        dayBox = new JComboBox<>(day);
        dayBox.setSelectedItem("18");
        dayBox.setBounds(185, 415, 60, 30);
        dayBox.setBackground(fieldColor);
        dayBox.setBorder(roundedBorder);
        dayBox.setFocusable(false);
        add(dayBox);
        
        String[] years = new String[127];
        int startYear = 1900;
        for (int i = 0; i < years.length; i++) {
            years[i] = String.valueOf(startYear + i);
        }
        yearBox = new JComboBox<>(years);
        yearBox.setSelectedItem("2006"); 
        yearBox.setBounds(250, 415, 80, 30);
        yearBox.setBackground(fieldColor);
        yearBox.setBorder(roundedBorder);
        yearBox.setFocusable(false);
        add(yearBox);

        submitbtn = new JButton("Create account");
        submitbtn.setFont(new Font("SansSerif", Font.BOLD, 14));
        submitbtn.setBackground(new Color(69, 104, 130));
        submitbtn.setForeground(Color.WHITE);
        submitbtn.setFocusPainted(false);
        submitbtn.setBounds(40, 480, 320, 45);
        submitbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(submitbtn);
        submitbtn.addActionListener(this);
        
        cancelbtn = new JButton("Back");
        cancelbtn.setFont(new Font("SansSerif", Font.BOLD, 14));
        cancelbtn.setBackground(new Color(69, 104, 130));
        cancelbtn.setForeground(Color.WHITE);
        cancelbtn.setFocusPainted(false);
        cancelbtn.setBounds(40, 535, 320, 45);
        cancelbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(cancelbtn);
        cancelbtn.addActionListener(this);
    }

    private String getMonthNumber(String monthName) {
        switch (monthName) {
            case "Jan": return "01"; case "Feb": return "02"; case "Mar": return "03";
            case "Apr": return "04"; case "May": return "05"; case "Jun": return "06";
            case "Jul": return "07"; case "Aug": return "08"; case "Sep": return "09";
            case "Oct": return "10"; case "Nov": return "11"; case "Dec": return "12";
            default: return "01";
        }
    }

    private boolean saveUserToDatabase(String username, String email, String password, String contact, String bday) {
        String dbUrl = "jdbc:mysql://localhost:3306/hotel_db";
        String dbUser = "root";
        String dbPass = "";
        String query = "INSERT INTO users (username, email, password, contact_number, birthdate) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, username);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.setString(4, contact);
            stmt.setString(5, bday);
            
            return stmt.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitbtn) {
            String username = userinp.getText().trim();
            String email = emailinp.getText().trim();
            String password = new String(passinp.getPassword()).trim();
            String contact = numberinp.getText().trim();
            
            String selYear = (String) yearBox.getSelectedItem();
            String selMonth = getMonthNumber((String) monthBox.getSelectedItem());
            String selDay = (String) dayBox.getSelectedItem();
            if (selDay.length() == 1) selDay = "0" + selDay; 
            String birthdate = selYear + "-" + selMonth + "-" + selDay;

            if (username.isEmpty() || email.isEmpty() || password.isEmpty() || contact.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all details.", "Validation Alert", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (password.length() < 8) {
                JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long.", "Validation Alert", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (saveUserToDatabase(username, email, password, contact, birthdate)) {
                JOptionPane.showMessageDialog(this, "Account Created Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                loginpage lp = new loginpage();
                lp.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Error: Username may be taken or connection failed.", "Signup Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==cancelbtn){
            dispose();
            loginpage lp=new loginpage();
            lp.setVisible(true);
        }
    }
}