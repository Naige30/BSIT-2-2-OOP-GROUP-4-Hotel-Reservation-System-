/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Naige
 */
public class viewpage extends JFrame implements ActionListener {
private JLabel title,room1,room2,room3,room4,hotelName,subtitle,img,roomTitle;
private JButton view1,view2,view3,view4,but1,but2,but3,but4,home;
private JTextArea deet1,deet2,deet3,deet4;
private JPanel miniLine,miniSep;
private JTextArea details;
private JButton viewBtn,bookBtn,book1, book2, book3, book4;
    
    
    viewpage(){
    setTitle("Giovanni Madrigal Grand Hotel: A Hotel Reservation System");
    setSize(1000,880);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);
    setLocationRelativeTo(null);
    setResizable(false);
    getContentPane().setBackground(Color.WHITE);
    
    setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
    

        hotelName = new JLabel("GIOVANNI MADRIGAL GRAND HOTEL", SwingConstants.CENTER);
        hotelName.setBounds(0, 20, 1000, 30);
        hotelName.setFont(new Font("Serif", Font.PLAIN, 20));
        hotelName.setForeground(new Color(60, 60, 60));
        add(hotelName);

        subtitle = new JLabel("MANILA", SwingConstants.CENTER);
        subtitle.setBounds(0, 50, 1000, 20);
        subtitle.setFont(new Font("Serif", Font.PLAIN, 12));
        subtitle.setForeground(Color.GRAY);
        add(subtitle);

        add(goldSeparator(150, 80, 700));


        add(roomCard(
                "Tuazon Deluxe",
                "tuazon1.jpg",
                "Bed Configuration: King or Twin Beds\n"
                + "Room Size: 37 – 41 sq m / 398 – 441 sq ft\n"
                + "Occupancy: 2 Adults and 2 Children",
                50, 110
        ));

        add(roomCard(
                "Grande' Aviles",
                "grandeaviles1.jpg",
                "Bedroom: 1 King bed with living area and kitchenette\n"
                + "Room Size: 61 Sqm.\n"
                + "Capacity: 4 People",
                520, 110
        ));

        add(roomCard(
                "Casa Lacao",
                "casalacao1.jpg",
                "Bedroom: 3 King beds with a spacious living area, private dining area, full kitchen, and luxury bathroom with bathtub\n"
                + "Room Size: 180 Sqm.\n"
                + "Capacity: 4–8 Persons",
                50, 460
        ));

        add(roomCard(
                "Palazzo Arzola",
                "palazzoarzola1.jpg",
                "Bedroom: 2 King beds with elegant living area, private dining space, mini kitchen, and marble-finished\n"
                + "Room Size: 200 Sqm.\n"
                + "Capacity: 3–6 Persons",
                520, 460
        ));

        
        home = new JButton("Home");
        home.setBounds(30, 20, 80, 30);
        home.setFocusPainted(false);
        home.setBackground(new Color(200, 170, 120));
        home.setForeground(Color.WHITE);
        home.setBorder(new LineBorder(new Color(200, 170, 120)));
        add(home);
        home.addActionListener(this);
    }

    
    private JPanel goldSeparator(int x, int y, int width) {

        JPanel container = new JPanel(null);
        container.setBounds(x, y, width, 20);
        container.setBackground(Color.WHITE);

        JPanel line = new JPanel();
        line.setBounds(0, 10, width, 1);
        line.setBackground(new Color(210, 210, 210));
        container.add(line);

        return container;
    }

    
    private JLabel loadImage(String filename, int x, int y, int w, int h) {

        ImageIcon rawImage = new ImageIcon(
                getClass().getResource("/hotel/reservation/system/" + filename)
        );

        Image scaledImage = rawImage.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);

        JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
        imageLabel.setBounds(x, y, w, h);

        return imageLabel;
    }


    private JPanel roomCard(String title, String imagePath, String detailsText, int x, int y) {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(x, y, 400, 300);
        panel.setBackground(Color.WHITE);
        panel.setBorder(new LineBorder(new Color(230, 230, 230)));


        img = loadImage(imagePath, 10, 10, 180, 120);
        panel.add(img);

        
        roomTitle = new JLabel(title);
        roomTitle.setBounds(200, 10, 180, 30);
        roomTitle.setFont(new Font("Serif", Font.BOLD, 16));
        panel.add(roomTitle);

        
        miniSep = goldSeparator(200, 40, 150);
        panel.add(miniSep);


        details = new JTextArea(detailsText);
        details.setBounds(200, 65, 180, 120);
        details.setEditable(false);
        details.setLineWrap(true);
        details.setWrapStyleWord(true);
        details.setFont(new Font("SansSerif", Font.PLAIN, 12));
        details.setBackground(Color.WHITE);
        panel.add(details);


        viewBtn = new JButton("VIEW");
        viewBtn.setBounds(200, 190, 80, 30);
        styleButton(viewBtn);
        panel.add(viewBtn);

       
        bookBtn = new JButton("BOOK");
        bookBtn.setBounds(290, 190, 80, 30);
        styleGoldButton(bookBtn);
        panel.add(bookBtn);


        if (title.equals("Tuazon Deluxe")) {
            view1 = viewBtn;
            view1.addActionListener(this);
        } else if (title.equals("Grande' Aviles")) {
            view2 = viewBtn;
            view2.addActionListener(this);
        } else if (title.equals("Casa Lacao")) {
            view3 = viewBtn;
            view3.addActionListener(this);
        } else if (title.equals("Palazzo Arzola")) {
            view4 = viewBtn;
            view4.addActionListener(this);
        }
           if (title.equals("Tuazon Deluxe")) {
            book1 = bookBtn;
            book1.addActionListener(this);
        } else if (title.equals("Grande' Aviles")) {
            book2 = bookBtn;
            book2.addActionListener(this);
        } else if (title.equals("Casa Lacao")) {
            book3 = bookBtn;
            book3.addActionListener(this);
        } else if (title.equals("Palazzo Arzola")) {
            book4 = bookBtn;
            book4.addActionListener(this);
}

        return panel;
    }


    private void styleButton(JButton btn) {
        btn.setFocusPainted(false);
        btn.setBackground(Color.WHITE);
        btn.setForeground(new Color(80, 80, 80));
        btn.setBorder(new LineBorder(new Color(180, 180, 180)));
    }

    private void styleGoldButton(JButton btn) {
        btn.setFocusPainted(false);
        btn.setBackground(new Color(200, 170, 120));
        btn.setForeground(Color.WHITE);
        btn.setBorder(new LineBorder(new Color(200, 170, 120)));
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
        else if(e.getSource()==book1){
            dispose();
            reservepage rp = new reservepage();
            rp.setVisible(true);
        }
        else if(e.getSource()==book2){
            dispose();
            reservepage rp = new reservepage();
            rp.setVisible(true);
        }
        else if(e.getSource()==book3){
            dispose();
            reservepage rp = new reservepage();
            rp.setVisible(true);
        }
        else if(e.getSource()==book4){
            dispose();
            reservepage rp = new reservepage();
            rp.setVisible(true);
        }
        
        
        
        
    }
    
    
    
}
