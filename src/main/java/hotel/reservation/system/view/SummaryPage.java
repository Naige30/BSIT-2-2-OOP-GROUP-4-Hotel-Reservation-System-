package hotel.reservation.system.view;
import hotel.reservation.system.model.Room;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class SummaryPage extends JFrame implements ActionListener {
    
    JLabel welcome, titlelbl, reqLbl;
    JButton done, cancel;
    JSeparator separator;
    JTextArea notesArea;
    JScrollPane scroll;
    
    private String roomTypeField;
    private String roomNumberField; 

    public SummaryPage(
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
        
        this.roomTypeField = roomPref;
        this.roomNumberField = add2; 
        
        setTitle("Reservation Summary");
        setSize(750, 650);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());

        int y = 110;
        
        titlelbl = new JLabel("Summary", SwingConstants.CENTER);
        titlelbl.setFont(new Font("Segoe UI", Font.BOLD, 30)); 
        titlelbl.setBounds(0, 20, 750, 40);
        add(titlelbl);
        
        welcome = new JLabel("We welcome you to an unforgettable stay!", SwingConstants.CENTER);
        welcome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        welcome.setForeground(new Color(140, 140, 140));
        welcome.setBounds(0, 60, 750, 20);
        add(welcome);
        
        separator = new JSeparator();
        separator.setBounds(75, 90, 600, 1);
        separator.setForeground(new Color(230, 230, 230));
        add(separator);

  
        String fullAddress = add1 + (city.isEmpty() ? "" : ", " + city) + 
                             (state.isEmpty() ? "" : ", " + state) + 
                             (zip.isEmpty() ? "" : " " + zip);

        addRow("Guest Identity:", fname + " " + lname, y); y += 40;
        addRow("Residence:", fullAddress, y); y += 40;
        addRow("Contact:", email + " | " + phone, y); y += 40;
        
        y += 10; 

        addRow("Check-in:", indate + " at " + intime, y); y += 40;
        addRow("Check-out:", outdate + " at " + outtime, y); y += 40;
        
        
        String roomDisplay = (roomNumberField != null && !roomNumberField.isEmpty())
                ? roomPref + " [Room " + roomNumberField + "]"
                : roomPref;

        addRow("Accommodation:", roomDisplay + " (" + adults + " Adults, " + children + " Children)", y); y += 45;

        reqLbl = new JLabel("Special Requests:");
        reqLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
        reqLbl.setBounds(75, y, 600, 20);
        add(reqLbl);
        y += 25;
        
        notesArea = new JTextArea(notes.isEmpty() ? "None" : notes);
        notesArea.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        notesArea.setForeground(new Color(90, 90, 90));
        notesArea.setLineWrap(true);
        notesArea.setWrapStyleWord(true);
        notesArea.setEditable(false);
        notesArea.setMargin(new Insets(8, 8, 8, 8));
        notesArea.setBackground(new Color(250, 250, 250));
        notesArea.setFocusable(false);
        
        scroll = new JScrollPane(notesArea);
        scroll.setBorder(new LineBorder(new Color(230, 230, 230)));
        scroll.setBounds(75, y, 600, 75); 
        add(scroll);
        y += 100;

        cancel = new JButton("Cancel Reservation");
        cancel.setBackground(new Color(245, 245, 245)); 
        cancel.setForeground(Color.DARK_GRAY);
        cancel.setFont(new Font("Segoe UI", Font.BOLD, 12));
        cancel.setBorder(new LineBorder(new Color(220, 220, 220), 1));
        cancel.setFocusPainted(false);
        cancel.setBounds(175, y, 170, 42);
        add(cancel);
        
        done = new JButton("Proceed to Payment");
        done.setFont(new Font("Segoe UI", Font.BOLD, 12));
        done.setBounds(360, y, 210, 42);
        done.setBackground(new Color(69, 104, 130)); 
        done.setForeground(Color.WHITE);
        done.setFocusPainted(false);
        done.setBorder(null);
        add(done);

        done.addActionListener(this);
        cancel.addActionListener(this);

        setVisible(true);
    }

    private void addRow(String header, String data, int y) {
        JLabel headerLbl = new JLabel(header);
        headerLbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
        headerLbl.setForeground(new Color(50, 50, 50));
        headerLbl.setBounds(75, y, 140, 25);
        add(headerLbl);

        JLabel dataLbl = new JLabel(data);
        dataLbl.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        dataLbl.setForeground(new Color(80, 80, 80));
        dataLbl.setBounds(215, y, 460, 25);
        add(dataLbl);
        
        JSeparator line = new JSeparator();
        line.setBounds(75, y + 30, 600, 1);
        line.setForeground(new Color(245, 245, 245));
        add(line);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource() == done) {
    this.dispose();
    new payment(roomTypeField, roomNumberField).setVisible(true);

        } else if (e.getSource() == cancel) {
            int response = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to cancel your reservation?", 
                "Confirm Cancellation", 
                JOptionPane.YES_NO_OPTION);
            
            if (response == JOptionPane.YES_OPTION) {
                this.dispose();
                new hotelmenu().setVisible(true);
            }
        }
    }
}