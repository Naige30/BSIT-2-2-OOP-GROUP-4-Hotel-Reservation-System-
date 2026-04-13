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
    private ImageIcon originalIcon;
    signup(){
        setSize(400,550);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        
        
        titlelbl = new JLabel("Sign Up",SwingConstants.CENTER);
        titlelbl.setFont(new Font("SansSerif", Font.BOLD, 30));
        titlelbl.setBounds(30, 30, 300, 40);
        add(titlelbl);
        
        subTitle = new JLabel("Start your truly luxury experience.");
        subTitle.setFont(new Font("SansSerif", Font.PLAIN, 14));
        subTitle.setForeground(new Color(100, 100, 100));
        subTitle.setBounds(30, 70, 300, 20);
        add(subTitle);
        
        userlbl=new JLabel("Username");
        userlbl.setFont(new Font("SansSerif", Font.BOLD, 12));
        userlbl.setBounds(30, 115, 100, 20);
        add(userlbl);
        
        userinp = new JTextField();
        userinp.setFont(new Font("SansSerif", Font.PLAIN, 13));
        userinp.setBounds(30, 140, 320, 38);
        userinp.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        add(userinp);
        
        emaillbl = new JLabel("Email");
        emaillbl.setFont(new Font("SansSerif", Font.BOLD, 12));
        emaillbl.setBounds(30, 195, 100, 20);
        add(emaillbl);

        emailinp = new JTextField();
        emailinp.setFont(new Font("SansSerif", Font.PLAIN, 13));
        emailinp.setBounds(30, 220, 320, 38);
        emailinp.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        add(emailinp);

        
//        passlbl = new JLabel("Password");
//        passlbl.setFont(new Font("SansSerif", Font.BOLD, 12));
//        passlbl.setBounds(30, 275, 100, 20);
//        add(passlbl);

//        passinp = new JPasswordField();
//        passinp.setBounds(30, 300, 320, 38);
//        passinp.setBorder(new LineBorder(new Color(225, 225, 225), 1));
//        add(passinp);

        hint = new JLabel("Must be at least 8 characters.");
        hint.setFont(new Font("SansSerif", Font.PLAIN, 11));
        hint.setForeground(new Color(160, 160, 160));
        hint.setBounds(30, 340, 250, 20);
        add(hint);

        
        submitbtn = new JButton("Create account");
        submitbtn.setBackground(new Color(69,104,130));
        submitbtn.setForeground(Color.WHITE);
        submitbtn.setFocusPainted(false);
        submitbtn.setBounds(30, 360, 320, 40);
        add(submitbtn);

        
//        footer = new JLabel("Already have an account? Log in", SwingConstants.CENTER);
//        footer.setBounds(30, 430, 320, 20);
//        add(footer);
        

        
       
        
     
        
       
        
        numberlbl=new JLabel("Contact No.");
        numberlbl.setBounds(30,220,200,30);
        add(numberlbl);
        
        numberinp=new JTextField();
        numberinp.setBounds(110,220,200,30);
        add(numberinp);
        
        bdaylbl=new JLabel("Birthday:");
        bdaylbl.setBounds(30,270,90,30);
        add(bdaylbl);
        
        String[]months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        monthBox=new JComboBox<>(months);
        monthBox.setBounds(110,270,70,30);
        add(monthBox);
        
        String[]day=new String [31];
        for(int i=1;i<=31;i++){
            day[i-1]=String.valueOf(i);
        }
        dayBox=new JComboBox<>(day);
        dayBox.setBounds(185,270,60,30);
        add(dayBox);
        
        String[]years=new String[127];
        int startYear=1900;
        for(int i=0;i<years.length;i++){
            years[i]=String.valueOf(startYear+i);
        }
        yearBox=new JComboBox<>(years);
        yearBox.setBounds(250,270,70,30);
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
