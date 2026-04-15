/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
/**
 *
 * @author Naige
 */
public class signup extends JFrame implements ActionListener {
   
   
    private JButton submitbtn;    
    private JPasswordField passinp; 
    private JComboBox<String>monthBox,dayBox,yearBox;
    private JTextField userinp,emailinp,numberinp,ageinp;
    private JLabel userlbl,passlbl,emaillbl,numberlbl,agelbl,titlelbl,subTitle,hint,footer, bdaylbl;

    private JSeparator separator;
    signup(){
        setSize(400,650);
        setTitle("Giovanni Madrigal Grand Hotel: Create an Account");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        
        titlelbl = new JLabel("Sign Up",SwingConstants.CENTER);
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
        
        userlbl=new JLabel("Username");
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

        
        submitbtn = new JButton("Create account");
        submitbtn.setBackground(new Color(69,104,130));
        submitbtn.setForeground(Color.WHITE);
        submitbtn.setFocusPainted(false);
        submitbtn.setBounds(40, 480, 320, 45);
        add(submitbtn);
        submitbtn.addActionListener(this);

        
//        footer = new JLabel("Already have an account? Log in", SwingConstants.CENTER);
//        footer.setBounds(0, 540, 400, 20);
//        add(footer);

        numberlbl=new JLabel("Contact No.");
        numberlbl.setBounds(40, 340, 100, 20);
        add(numberlbl);
        
        numberinp=new JTextField();
        numberinp.setBounds(40, 365, 320, 35);
        numberinp.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        add(numberinp);
        
        bdaylbl=new JLabel("Birthdate");
        bdaylbl.setBounds(40, 415, 90, 30);
        add(bdaylbl);
        
        Color fieldColor = new Color(245, 245, 245);
        LineBorder roundedBorder = new LineBorder(new Color(210, 210, 210), 1, true);
        
        String[]months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        monthBox=new JComboBox<>(months);
        monthBox.setSelectedItem("Apr");
        monthBox.setBounds(110, 415, 70, 30);
        
        monthBox.setBackground(fieldColor);
        monthBox.setBorder(roundedBorder);
        monthBox.setFocusable(false); 
        
        add(monthBox);
        
        String[]day=new String [31];
        for(int i=1;i<=31;i++){
            day[i-1]=String.valueOf(i);
        }
        dayBox=new JComboBox<>(day);
        dayBox.setSelectedItem("18");
        dayBox.setBounds(185, 415, 60, 30);
        dayBox.setBackground(fieldColor);
        dayBox.setBorder(roundedBorder);
        dayBox.setFocusable(false);
        add(dayBox);
        
        String[]years=new String[127];
        int startYear=1900;
        for(int i=0;i<years.length;i++){
            years[i]=String.valueOf(startYear+i);
        }
        yearBox=new JComboBox<>(years);
        yearBox.setSelectedItem("2026");
        yearBox.setBounds(250, 415, 80, 30);
        yearBox.setBackground(fieldColor);
        yearBox.setBorder(roundedBorder);
        yearBox.setFocusable(false);
        add(yearBox);
        
      
       
                
        

       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submitbtn){
            dispose();
            loginpage lp=new loginpage();
            lp.setVisible(true);
        }
    }
    
}
