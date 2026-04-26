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
 * @author Naige
 */
public class payment extends JFrame implements ActionListener {
    private JLabel title,cardNumberlbl,fnamelbl,lnamelbl,expirymonthlbl,yearexpirylbl;
    private JTextField cardNumberText;
    
    
    payment(){
        setSize(1000,1000);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        title=new JLabel("Payment Method",SwingConstants.CENTER);
        title.setBounds(0,50,1000,30);
        add(title);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}
