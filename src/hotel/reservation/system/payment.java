/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Naige
 */
public class payment extends JFrame implements ActionListener {
   private JLabel title;
    private JLabel cardNumberlbl, fnamelbl, lnamelbl, expirymonthlbl, yearexpirylbl, cvclbl;
    private JLabel addresslbl, citylbl, postalLbl, countryLbl;

    private JTextField cardNumberText, fnameText, lnameText, cvcText;
    private JTextField addressText, cityText, postalText;

    private JComboBox<String> monthBox, yearBox, countryBox;

    private JButton payButton,backButton;

    
    
    payment(){
        setSize(1000, 1000);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        
        getContentPane().setBackground(new Color(201, 162, 39));

        
        title = new JLabel("Payment Method");
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setBounds(0, 20, 1000, 40);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        add(title);

        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setBounds(300, 80, 400, 800);
        formPanel.setBackground(Color.WHITE);
        add(formPanel);

  
        cardNumberlbl = new JLabel("Credit/Debit Card Number");
        cardNumberlbl.setBounds(50, 30, 250, 20);
        formPanel.add(cardNumberlbl);

        cardNumberText = new JTextField();
        cardNumberText.setBounds(50, 55, 300, 30);
        formPanel.add(cardNumberText);

      
        fnamelbl = new JLabel("First Name");
        fnamelbl.setBounds(50, 100, 100, 20);
        formPanel.add(fnamelbl);

        fnameText = new JTextField();
        fnameText.setBounds(50, 125, 140, 30);
        formPanel.add(fnameText);

       
        lnamelbl = new JLabel("Last Name");
        lnamelbl.setBounds(210, 100, 100, 20);
        formPanel.add(lnamelbl);

        lnameText = new JTextField();
        lnameText.setBounds(210, 125, 140, 30);
        formPanel.add(lnameText);

        
        expirymonthlbl = new JLabel("Expiry Month");
        expirymonthlbl.setBounds(50, 170, 120, 20);
        formPanel.add(expirymonthlbl);

        String[] months = {
            "01","02","03","04","05","06",
            "07","08","09","10","11","12"
        };
        monthBox = new JComboBox<>(months);
        monthBox.setBounds(50, 195, 140, 30);
        formPanel.add(monthBox);

        
        yearexpirylbl = new JLabel("Expiry Year");
        yearexpirylbl.setBounds(210, 170, 120, 20);
        formPanel.add(yearexpirylbl);

        String[] years = {"2024","2025","2026","2027","2028","2029"};
        yearBox = new JComboBox<>(years);
        yearBox.setBounds(210, 195, 140, 30);
        formPanel.add(yearBox);

       
        cvclbl = new JLabel("CVC / CVV");
        cvclbl.setBounds(50, 240, 100, 20);
        formPanel.add(cvclbl);

        cvcText = new JTextField();
        cvcText.setBounds(50, 265, 140, 30);
        formPanel.add(cvcText);

        
        JLabel billingTitle = new JLabel("Billing Information");
        billingTitle.setFont(new Font("Arial", Font.BOLD, 16));
        billingTitle.setBounds(50, 310, 200, 20);
        formPanel.add(billingTitle);

      
        addresslbl = new JLabel("Address");
        addresslbl.setBounds(50, 340, 100, 20);
        formPanel.add(addresslbl);

        addressText = new JTextField();
        addressText.setBounds(50, 365, 300, 30);
        formPanel.add(addressText);


        citylbl = new JLabel("City");
        citylbl.setBounds(50, 410, 100, 20);
        formPanel.add(citylbl);

        cityText = new JTextField();
        cityText.setBounds(50, 435, 300, 30);
        formPanel.add(cityText);

      
        postalLbl = new JLabel("Postal Code");
        postalLbl.setBounds(50, 480, 100, 20);
        formPanel.add(postalLbl);

        postalText = new JTextField();
        postalText.setBounds(50, 505, 300, 30);
        formPanel.add(postalText);

       
        countryLbl = new JLabel("Country");
        countryLbl.setBounds(50, 550, 100, 20);
        formPanel.add(countryLbl);

        String[] countries = {"Philippines", "USA", "Japan", "UK"};
        countryBox = new JComboBox<>(countries);
        countryBox.setBounds(50, 575, 300, 30);
        formPanel.add(countryBox);

        
        payButton = new JButton("Pay Now");
        payButton.setBounds(50, 650, 300, 40);
        payButton.addActionListener(this);
        formPanel.add(payButton);
        
        backButton=new JButton("Back");
        backButton.setBounds(50,720,300,40);
        backButton.addActionListener(this);
        formPanel.add(backButton);

        setVisible(true);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == payButton) {
            dispose();
            hotelmenu hm=new hotelmenu();
            JOptionPane.showMessageDialog(this, "Payment Submitted!");
            hm.setVisible(true);
        }
        else if(e.getSource()==backButton){
            dispose();
            JOptionPane.showMessageDialog(this, "Payment Cancelled!");
            reservepage rp= new reservepage();
            rp.setVisible(true);
        }
        
    }
    
}
