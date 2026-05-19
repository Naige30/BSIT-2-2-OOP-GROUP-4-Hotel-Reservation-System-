package hotel.reservation.system.view;
import hotel.reservation.system.model.Room;
import hotel.reservation.system.view.reservepage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class payment extends JFrame implements ActionListener {

    private final JTextField nameField, cardField, cvcField, emailField;
    private final JComboBox<String> monthBox, yearBox;
    private final JButton continueButton, cancelButton;
    private final Font TITLE_FONT = new Font("Segoe UI", Font.BOLD, 20);
    private final Font LABEL_FONT = new Font("Segoe UI", Font.PLAIN, 13);
    private final Font INPUT_FONT = new Font("Segoe UI", Font.PLAIN, 14);
    private final Font BUTTON_FONT = new Font("Segoe UI", Font.BOLD, 14);

    public payment() {

        setTitle("Payment");
        setSize(400, 680);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/logo.png")).getImage());

        getContentPane().setBackground(new Color(245, 245, 245));


        JLabel title = new JLabel("Secure Payment");
        title.setFont(TITLE_FONT);
        title.setBounds(0, 20, 400, 30);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        add(title);


        JPanel panel = new JPanel(null);
        panel.setBounds(20, 60, 350, 570);
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        add(panel);


        JPanel paymentBox = new JPanel(null);
        paymentBox.setBounds(15, 15, 320, 60);
        paymentBox.setBorder(BorderFactory.createDashedBorder(new Color(180, 180, 180)));
        paymentBox.setBackground(Color.WHITE);
        panel.add(paymentBox);

        JLabel pmLabel = new JLabel("Payment Method");
        pmLabel.setFont(LABEL_FONT);
        pmLabel.setBounds(10, 10, 150, 40);
        paymentBox.add(pmLabel);

        paymentBox.add(createIcon("/hotel/reservation/system/resources/mastercard.png", 140));
        paymentBox.add(createIcon("/hotel/reservation/system/resources/visa.png", 180));
        paymentBox.add(createIcon("/hotel/reservation/system/resources/americanexpress.png", 220));
        paymentBox.add(createIcon("/hotel/reservation/system/resources/applepay.png", 260));


        panel.add(createLabel("Account Holder Name", 15, 95));
        nameField = createField("Name", 15, 120);
        panel.add(nameField);


        panel.add(createLabel("Card Number", 15, 170));
        cardField = createField("0000 0000 0000 0000", 15, 195);
        panel.add(cardField);


        panel.add(createLabel("Expiry Date", 15, 245));

        String[] months = {
                "Month","01","02","03","04","05","06",
                "07","08","09","10","11","12"
        };

        monthBox = new JComboBox<>(months);
        monthBox.setFont(INPUT_FONT);
        monthBox.setBounds(15, 270, 150, 35);
        monthBox.setBackground(Color.WHITE);
        panel.add(monthBox);

        String[] years = {
                "Year","2026","2027","2028","2029","2030","2031","2032","2033","2034","2035"
        };

        yearBox = new JComboBox<>(years);
        yearBox.setFont(INPUT_FONT);
        yearBox.setBounds(185, 270, 150, 35);
        yearBox.setBackground(Color.WHITE);
        panel.add(yearBox);


        panel.add(createLabel("Card Security Code", 15, 320));
        cvcField = createField("CVV", 15, 345);
        panel.add(cvcField);


        panel.add(createLabel("Email (for receipt)", 15, 395));
        emailField = createField("example@email.com", 15, 420);
        panel.add(emailField);


        continueButton = new JButton("Continue");
        continueButton.setBounds(15, 475, 320, 42);
        continueButton.setBackground(new Color(69, 104, 130));
        continueButton.setForeground(Color.WHITE);
        continueButton.setFont(BUTTON_FONT);
        continueButton.setFocusPainted(false);
        continueButton.addActionListener(this);
        panel.add(continueButton);


        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(15, 525, 320, 35);
        cancelButton.setBackground(new Color(235, 235, 235));
        cancelButton.setForeground(new Color(80, 80, 80));
        cancelButton.setFont(BUTTON_FONT);
        cancelButton.setFocusPainted(false);
        cancelButton.addActionListener(this);
        panel.add(cancelButton);

        setVisible(true);
    }


    private JLabel createLabel(String text, int x, int y) {
        JLabel lbl = new JLabel(text);
        lbl.setFont(LABEL_FONT);
        lbl.setBounds(x, y, 250, 20);
        return lbl;
    }


    private JTextField createField(String placeholder, int x, int y) {
        JTextField field = new JTextField(placeholder);
        field.setBounds(x, y, 320, 35);
        field.setFont(INPUT_FONT);
        field.setForeground(Color.GRAY);
        field.setBorder(BorderFactory.createLineBorder(new Color(210, 210, 210)));

        field.addFocusListener(new FocusAdapter() {
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
                    field.setText(placeholder);
                    field.setForeground(Color.GRAY);
                }
            }
        });

        return field;
    }


    private JLabel createIcon(String img, int x) {
        ImageIcon icon = new ImageIcon(
                new ImageIcon(getClass().getResource(img))
                        .getImage().getScaledInstance(35, 20, Image.SCALE_SMOOTH)
        );

        JLabel lbl = new JLabel(icon);
        lbl.setBounds(x, 18, 40, 25);
        return lbl;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == continueButton) {
            
            if (nameField.getText().equals("Name") || cardField.getText().equals("0000 0000 0000 0000")) {
                JOptionPane.showMessageDialog(this, "Please fill in all payment details.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            
            JOptionPane.showMessageDialog(this, 
                "Payment Successful!\nReceipt sent to: " + emailField.getText(), 
                "Success", 
                JOptionPane.INFORMATION_MESSAGE);
            
            
            this.dispose();
            
            
            new hotelmenu().setVisible(true); 
        } 
        
        else if (e.getSource() == cancelButton) {
            int confirm = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to cancel the payment?", 
                "Cancel Payment", 
                JOptionPane.YES_NO_OPTION);
                
            if (confirm == JOptionPane.YES_OPTION) {
                this.dispose();
                new reservepage().setVisible(true);
            }
        }
    }
}