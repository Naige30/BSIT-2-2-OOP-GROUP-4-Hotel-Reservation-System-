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
public class viewpage extends JFrame implements ActionListener {
private JLabel title,room1,room2,room3,room4;
private JButton view1,view2,view3,view4,but1,but2,but3,but4,home;
private JTextArea deet1,deet2,deet3,deet4;
    
    
    viewpage(){
    setSize(1000,1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);
    setLocationRelativeTo(null);
    
    title=new JLabel(" Experience The Full Giovanni Madrigal Grand Hotel Experience",SwingConstants.CENTER);
    title.setBounds(0,30,800,50);
    title.setFont(new Font("SansSerif", Font.BOLD, 26));
    add(title);
    
    room1=new JLabel("Tuazon Deluxe");
    room1.setFont(new Font("SansSerif", Font.BOLD, 16));
    room1.setBounds(100,120,300,50);
    add(room1);
    
    deet1=new JTextArea("Bedroom: 1 King Bed or 2 Twin Beds\n"+"Room Size: 33 Sqm.\n"+"Capacity: 3 People\nDetails:Kupal si Jazmine");
    deet1.setBounds(100,250,200,70);
    deet1.setEditable(false);
    add(deet1);
    
    view1=new JButton("VIEW MORE");
    view1.setBounds(100,320,120,35);
    add(view1);
    view1.addActionListener(this);
    
    but1=new JButton("BOOK");
    but1.setBounds(240,320,120,35);
    add(but1);
    
    room2=new JLabel("Grande' Aviles");
    room2.setBounds(600,120,300,50);
    room2.setFont(new Font("SansSerif", Font.BOLD, 16));
    add(room2);
    
    deet2=new JTextArea("Bedroom:1 King bed with living area and kitchenette\n"+"Room Size: 61 Sqm.\n"+"Capacity: 4 People\nDetails:Kupal si AJ");
    deet2.setBounds(600,250,300,70);
    deet2.setEditable(false);
    add(deet2);
    
    view2=new JButton("VIEW MORE");
    view2.setBounds(600,320,120,35);
    add(view2);
    view2.addActionListener(this);
    
    but2=new JButton("BOOK");
    but2.setBounds(740,320,120,35);
    add(but2);
    
    
    room3=new JLabel("Casa Lacao");
    room3.setFont(new Font("SansSerif", Font.BOLD, 16));
    room3.setBounds(100,500,300,50);
    add(room3);
    
    deet3=new JTextArea("Bedroom:3 King beds with a spacious living area, private dining area, full kitchen, and luxury bathroom with bathtub\n"+"Room Size: 180 Sqm.\n"+"Capacity: 4-8 Persons\nDetails:Miss ko na siya");
    deet3.setBounds(100,620,300,100);
    deet3.setEditable(false);
    add(deet3);
    
    view3=new JButton("VIEW MORE");
    view3.setBounds(100,750,120,35);
    add(view3);
    view3.addActionListener(this);
    
    but3=new JButton("BOOK");
    but3.setBounds(240,750,120,35);
    add(but3);
    
    
    room4=new JLabel("Palazzo Arzola");
    room4.setFont(new Font("SansSerif", Font.BOLD, 16));
    room4.setBounds(600,500,300,50);
    add(room4);
    
    deet4=new JTextArea("Bedroom:2 King beds with elegant living area, private dining space, mini kitchen, and marble-finished\n"+"Room Size: 120 Sqm.\n"+"Capacity: 3-6 Persons\nDetails:LUH");
    deet4.setBounds(600,620,300,100);
    deet4.setEditable(false);
    add(deet4);
    
    view4=new JButton("VIEW MORE");
    view4.setBounds(600,750,120,35);
    add(view4);
    view4.addActionListener(this);
    
    but4=new JButton("BOOK");
    but4.setBounds(740,750,120,35);
    add(but4);
    
    home=new JButton("Home");
    home.setBounds(30,30,90,70);
    add(home);
    home.addActionListener(this);
    
    
    
    
    
    
}
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view1){
            dispose();
            tuazondeluxe td=new tuazondeluxe();
            td.setVisible(true);
        }
        else if(e.getSource()==view2){
            dispose();
            grandeaviles ga=new grandeaviles();
            ga.setVisible(true);
        }
        else if(e.getSource()==view3){
            dispose();
            casalacao cl=new casalacao();
            cl.setVisible(true);
        }
        else if(e.getSource()==view4){
            dispose();
            palazzoarzola pa=new palazzoarzola();
            pa.setVisible(true);
        }
        else if(e.getSource()==home){
            dispose();
            hotelmenu hm=new hotelmenu();
            hm.setVisible(true);
        }
        
        
    }
    
}
