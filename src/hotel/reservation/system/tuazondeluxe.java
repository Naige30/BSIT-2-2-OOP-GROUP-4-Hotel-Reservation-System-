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
public class tuazondeluxe extends JFrame implements ActionListener {
    private JLabel title,roomname,gallery;
    private JButton home,book;
    private JTextArea ammenities,info;
    
    tuazondeluxe(){
        setSize(1000,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        title=new JLabel("Giovanni Madrigal Grand Hotel",SwingConstants.CENTER);
        title.setBounds(0,20,1000,40);
        title.setFont(new Font("SansSerif", Font.BOLD, 26));
        add(title);
        
        home=new JButton("Home");
        home.setBounds(20,20,80,35);
        add(home);
        home.addActionListener(this);
        
        roomname=new JLabel("Tuazon Deluxe");
        roomname.setBounds(350,100,300,30);
        roomname.setFont(new Font("SansSerif",Font.ITALIC,20));
        add(roomname);
        
        info=new JTextArea("Bedroom: 1 King Bed or 2 Twin Beds\n"+"Room Size: 33 Sqm.\n"+"Capacity: 3 People\nDetails:Kupal si Jazmine");
        info.setBounds(200,150,300,100);
        info.setEditable(false);
        add(info);
        
        ammenities=new JTextArea("Air-conditioning\n" +
"Mini-bar\n" +
"Free LAN and Wi-Fi Internet access\n" +
"Satellite/cable TV\n" +
"LED television\n" +
"Private toilet and bath\n" +
"Bath tub and separate shower area\n" +
"In-room safe\n" +
"NDD/ IDD with charge");
        ammenities.setBounds(550,150,250,200);
        ammenities.setEditable(false);
        ammenities.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(ammenities);
        
        gallery=new JLabel("Gallery: ");
        gallery.setBounds(50,320,200,30);
        gallery.setFont(new Font("SansSerif",Font.ITALIC,18));
        add(gallery);
        
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==home){
            dispose();
            hotelmenu hm=new hotelmenu();
            hm.setVisible(true);
        }
        
        
    }
    
}
