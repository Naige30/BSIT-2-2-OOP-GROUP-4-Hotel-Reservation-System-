/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.*;

/**
 *
 * @author Naige
 */
public class loginpage extends JFrame implements ActionListener {
    private JTextField user;
    private JButton Login,signup;
    private JLabel header,header2,subheader,username,password,sideImage,option1,address;
    private JPasswordField pass;
    private JSeparator line;
    private ImageIcon originalIcon;

    
    
    loginpage(){
        
       
        setSize(820,600);
        setTitle("Giovanni Madrigal Grand Hotel: A Hotel Reservation System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        
        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        originalIcon = new ImageIcon(getClass().getResource("hotel.jpg"));
        Image img = originalIcon.getImage();
        

        header = new JLabel("Welcome to ",SwingConstants.CENTER);
        header.setFont(new Font("Serif", Font.BOLD, 28));
        header.setBounds(410, 40, 350, 40);
        header.setForeground(Color.BLACK);
        add(header);
        
        header2 = new JLabel("Giovanni Madrigal Grand Hotel", SwingConstants.LEFT);
        header2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 28));
        header2.setBounds(400, 75, 400, 40);
        header2.setForeground(Color.BLACK);
        add(header2);
        
        
        Image scaledImg = img.getScaledInstance(350, 540, Image.SCALE_SMOOTH);
        ImageIcon finalIcon = new ImageIcon(scaledImg);
        
        sideImage = new JLabel(finalIcon);
        sideImage.setBounds(20, 10, 350, 540); 
        add(sideImage);
        

        subheader = new JLabel("Let us begin your journey into timeless luxury.");
        subheader.setFont(new Font("Serif", Font.ITALIC, 16));
        subheader.setBounds(430, 125, 350, 25);
        subheader.setForeground(new Color(100, 100, 100));
        add(subheader);
        
        line = new JSeparator();
        line.setBounds(430, 160, 300, 1);
        line.setForeground(new Color(230, 230, 230));
        add(line);
        
        username=new JLabel("Username");
        username.setFont(new Font("SansSerif", Font.BOLD, 11));
        
        username.setBounds(430, 180, 200, 20);
        add(username);
        
        user=new JTextField();
        user.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        user.setBounds(430, 205, 300, 40);
        add(user);
        
        pass=new JPasswordField();
        pass.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        pass.setBounds(430, 285, 300, 40);
        add(pass);
        
        password=new JLabel("Password");
        password.setFont(new Font("SansSerif", Font.BOLD, 11));
        
        password.setBounds(430, 265, 200, 20);
        add(password);
        
        Login=new JButton("Login");
        Login.setFont(new Font("SansSerif", Font.BOLD, 14));
        Login.setBounds(430, 360, 300, 45);
        Login.setBackground(new Color(200, 170, 120));
        Login.setForeground(Color.WHITE);
        Login.setFocusPainted(false);
        add(Login);
        Login.addActionListener(this);
        
        option1 = new JLabel("No account? Sign up to save your orders and check out faster.");
        option1.setFont(new Font("SansSerif", Font.PLAIN, 10));
        option1.setForeground(new Color(120, 120, 120));
        option1.setHorizontalAlignment(SwingConstants.CENTER); 
        option1.setBounds(430, 410, 300, 20); 
        add(option1);
        
        signup=new JButton("Sign Up");
        signup.setFont(new Font("SansSerif", Font.BOLD, 14));
        signup.setBounds(430, 440, 300, 45);
        signup.setBackground(new Color(69,104,130));
        signup.setForeground(Color.white);
        signup.setFocusPainted(false);
        add(signup);
        signup.addActionListener(this);
        
        ImageIcon pinIconRaw = new ImageIcon(getClass().getResource("pin.png"));
        Image pinScaled = pinIconRaw.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon pinIcon = new ImageIcon(pinScaled);
        
        address = new JLabel("SAN PEDRO ROAD, BIÑAN, MANILA, PHILIPPINES");
        address.setIcon(pinIcon);
        address.setIconTextGap(5);
        address.setFont(new Font("SansSerif", Font.PLAIN, 10)); 
        address.setForeground(new Color(150, 150, 150)); 
        address.setHorizontalAlignment(SwingConstants.CENTER);
        address.setBounds(430, 500, 300, 20);
        add(address);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Login){
            if(user.getText().equals("")&&pass.getText().equals("")){;
            dispose();
            JOptionPane.showMessageDialog(this, "Log in Successful!");
            hotelmenu hm=new hotelmenu();
            hm.setVisible(true);
           
        }
            else{
                JOptionPane.showMessageDialog(this,"Incorrect Password or Username");
            }
        
        }
        else if(e.getSource()==signup){
            dispose();
            signup su=new signup();
            su.setVisible(true);
        }
    }
    
}
