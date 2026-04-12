/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Naige
 */
public class signup extends JFrame implements ActionListener {
    private JTextField userinp,emailinp,numberinp;
    private JLabel userlbl,passlbl,emaillbl,numberlbl,titlelbl,bdaylbl;
    private JButton submitbtn;    
    private JPasswordField passinp; 
    private JComboBox<String>monthBox,dayBox,yearBox;
    signup(){
        setSize(374,550);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        titlelbl = new JLabel("Sign Up",SwingConstants.CENTER);
        titlelbl.setBounds(0,20,400,50);
        add(titlelbl);
        
        userlbl=new JLabel("Username:");
        userlbl.setBounds(30,70,90,30);
        add(userlbl);
        
        userinp=new JTextField();
        userinp.setBounds(110,70,200,30);
        add(userinp);
        
        passlbl=new JLabel("Password:");
        passlbl.setBounds(30,117,90,30);
        add(passlbl);
        
        
        passinp=new JPasswordField();
        passinp.setBounds(110,120,200,30);
        add(passinp);
        
        emaillbl=new JLabel("Email:");
        emaillbl.setBounds(30,170,200,30);
        add(emaillbl);
        
        emailinp=new JTextField();
        emailinp.setBounds(110,170,200,30);
        add(emailinp);
        
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
        
      
        submitbtn=new JButton("Submit");
        submitbtn.setBounds(140,450,100,30);
        add(submitbtn);
       
                
        

       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
