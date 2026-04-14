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
public class hotelmenu extends JFrame implements ActionListener {
    private JButton reservebtn,viewbtn,cancelbtn,searchbtn,logoutbtn;
    private JLabel welcometxt,singleHeadline;
    private JTextArea hotels;

    
    
    
    hotelmenu(){
        setSize(1000,880);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        
    ImageIcon rawImage = new ImageIcon(getClass().getResource("headline.png"));
    Image scaledImage = rawImage.getImage().getScaledInstance(1000, 500, Image.SCALE_SMOOTH);
    singleHeadline = new JLabel(new ImageIcon(scaledImage));
    singleHeadline.setBounds(0, 0, 1000, 500);
    add(singleHeadline);
        
        
    welcometxt = new JLabel("Where Filipino heritage meets refined indulgence.", SwingConstants.CENTER);
    welcometxt.setFont(new Font("Serif", Font.ITALIC, 20));
    welcometxt.setForeground(new Color(44, 62, 80));
    welcometxt.setBounds(0, 520, 1000, 40);
    add(welcometxt);
        
    styleMenuButton(reservebtn = new JButton("RESERVE A SUITE"), 580);
    reservebtn.addActionListener(this);
    
    styleMenuButton(viewbtn = new JButton("VIEW ACCOMMODATIONS"), 630);
    viewbtn.addActionListener(this);
    
    styleMenuButton(cancelbtn = new JButton("CANCEL BOOKING"), 680);
    cancelbtn.addActionListener(this);
    
    styleMenuButton(searchbtn = new JButton("SEARCH"), 730);
    searchbtn.addActionListener(this);
    
    styleMenuButton(logoutbtn = new JButton("LOG OUT"), 780);
    logoutbtn.addActionListener(this);

    hotels = new JTextArea("Located along San Pedro Road in Biñan, Manila, Giovanni Madrigal Grand Hotel introduces a new expression of luxury in the South. It is a refined sanctuary "
            + "where the romance of Italian culture is seamlessly woven with the warmth and grace of Filipino heritage. Designed as both a destination and an experience, "
            + "the hotel offers an atmosphere of quiet sophistication just moments away from the energy of the city.\n"
            + "\n"
            + "Inspired by the grandeur of classic Italian residences and the enduring charm of Filipino hospitality, every space is thoughtfully curated with intention. From its stately "
            + "interiors to its attentive and personalized service, each detail reflects a commitment to timeless elegance, comfort, and cultural harmony.\n"
            + "\n"
            + "A distinguished address in Manila, the hotel is poised to become a landmark of elevated living, welcoming discerning guests, families, and travelers seeking more than just a "
            + "place to stay. Whether enjoying its luxurious accommodations, indulging in its culinary offerings, or simply embracing its serene ambiance, every moment is designed to leave a lasting impression.\n"
            + "\n"
            + "In the years to come, Giovanni Madrigal Grand Hotel aspires to stand among the region’s most celebrated destinations, defined not only by its refined setting but by its ability "
            + "to bring together two rich cultures into one unforgettable experience.");
    hotels.setFont(new Font("Segoe UI", Font.PLAIN, 14)); 
    hotels.setLineWrap(true);       
    hotels.setWrapStyleWord(true);  
    hotels.setEditable(false);
    hotels.setBackground(new Color(250, 250, 250)); 
    hotels.setForeground(new Color(70, 70, 70));    
    hotels.setMargin(new Insets(15, 15, 15, 15));
    
    JScrollPane scrollPane = new JScrollPane(hotels);
    scrollPane.setBounds(450, 580, 500, 240); 
    scrollPane.setBorder(BorderFactory.createLineBorder(new Color(235, 235, 235))); 
    scrollPane.getVerticalScrollBar().setUnitIncrement(16); 
    add(scrollPane);

}

    private void styleMenuButton(JButton btn, int yPos) {
        btn.setBounds(50, yPos, 350, 40);
        btn.setFont(new Font("Inter", Font.BOLD, 12));
        btn.setBackground(Color.WHITE);
        btn.setForeground(new Color(40, 40, 40));
        btn.setFocusPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setHorizontalAlignment(SwingConstants.LEFT);
        btn.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY), 
        BorderFactory.createEmptyBorder(0, 10, 0, 0)
                
    ));
        
       btn.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
        btn.setBackground(new Color(240, 240, 240)); 
        btn.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(20, 20, 20)), 
        BorderFactory.createEmptyBorder(0, 10, 0, 0)
    ));
        }

        @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        btn.setBackground(Color.WHITE);
        btn.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY), 
        BorderFactory.createEmptyBorder(0, 10, 0, 0)
            ));
        }
    });
    
    add(btn);
}

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==logoutbtn){
           dispose();
           loginpage lp=new loginpage();
           lp.setVisible(true);
       } else if(e.getSource() == reservebtn) {
           dispose();
           reservepage rp = new reservepage();
           rp.setVisible(true);
       }
       else if(e.getSource()==viewbtn){
           dispose();
           viewpage vp=new viewpage();
           vp.setVisible(true);
       }
    }
    
    
    
    
}
