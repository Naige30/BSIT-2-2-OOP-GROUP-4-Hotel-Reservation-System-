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
public class loginpage extends JFrame implements ActionListener {
    private JTextField user;
    private JButton Login,signup;
    private JLabel header,header2,subheader,username,password,sideImage,option1;
    private JPasswordField pass;
    private JSeparator line;
    private ImageIcon originalIcon;
    
    
    loginpage(){
        
       
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        
        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        originalIcon = new ImageIcon(getClass().getResource("hotel.jpg"));
        Image img = originalIcon.getImage();
        

        header = new JLabel("Welcome to Giovanni",SwingConstants.LEFT);
        header.setFont(new Font("SansSerif",Font.BOLD, 28));
        header.setBounds(430, 40, 350, 40);
        header.setForeground(new Color(28, 28, 28));
        add(header);
        
        header2 = new JLabel("Madrigal Grand Hotel", SwingConstants.LEFT);
        header2.setFont(new Font("SansSerif", Font.BOLD, 28));
        header2.setBounds(430, 75, 350, 40);
        header2.setForeground(new Color(28, 28, 28));
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
        
        username=new JLabel("USERNAME:");
        username.setFont(new Font("SansSerif", Font.BOLD, 11));
        username.setForeground(new Color(150, 150, 150));
        username.setBounds(430, 180, 200, 20);
        add(username);
        
        user=new JTextField();
        user.setBounds(430, 205, 300, 40);
        add(user);
        
        pass=new JPasswordField();
        pass.setBounds(430, 285, 300, 40);
        add(pass);
        
        password=new JLabel("PASSWORD:");
        password.setFont(new Font("SansSerif", Font.BOLD, 11));
        password.setForeground(new Color(150, 150, 150));
        password.setBounds(430, 265, 200, 20);
        add(password);
        
        Login=new JButton("Login");
        Login.setFont(new Font("SansSerif", Font.BOLD, 14));
        Login.setBounds(430, 360, 300, 45);
        Login.setBackground(new Color(27,60,83));
        Login.setForeground(Color.white);
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
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Login){
            dispose();
            hotelmenu hm=new hotelmenu();
            hm.setVisible(true);
        }
        else if(e.getSource()==signup){
            dispose();
            signup su=new signup();
            su.setVisible(true);
        }
    }
    
}
