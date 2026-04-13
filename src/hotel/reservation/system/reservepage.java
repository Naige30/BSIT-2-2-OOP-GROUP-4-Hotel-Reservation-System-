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
public class reservepage extends JFrame implements ActionListener {
    private JButton reservebtn,viewbtn,cancelbtn,searchbtn,proceed;
    JLabel fname, lname, add1, add2, city, state, zip, phone, email, intime, indate, outtime, outdate, pref, pax ;
    JTextField fld1, fld2,fld3, fld4, fld5;
    
    reservepage() {
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
         reservebtn=new JButton("Reserve");
        reservebtn.setBounds(35,50,100,30);
        add(reservebtn);
        
        viewbtn=new JButton("View");
        viewbtn.setBounds(35,100,100,30);
        add(viewbtn);
        
        cancelbtn=new JButton("Cancel");
        cancelbtn.setBounds(35,150,100,30);
        add(cancelbtn);
        
        searchbtn= new JButton("Search");
        searchbtn.setBounds(35,200,100,30);
        add(searchbtn);
        
       
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
