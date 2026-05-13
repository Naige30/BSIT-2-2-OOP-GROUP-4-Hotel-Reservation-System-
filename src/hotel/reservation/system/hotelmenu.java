package hotel.reservation.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class hotelmenu extends JFrame implements ActionListener {
    private final JButton reservebtn, viewbtn, cancelbtn, searchbtn, logoutbtn;
    private final JLabel welcometxt, singleHeadline;

    public hotelmenu() {
        setSize(1000, 900);
        setTitle("Giovanni Madrigal Grand Hotel: A Hotel Reservation System");
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

        
        JPanel card1 = new JPanel(null);
        card1.setBackground(Color.WHITE);
        card1.setBorder(new LineBorder(new Color(235, 235, 235), 1));
        card1.setBounds(450, 580, 500, 80);
        
        ImageIcon heritageRaw = new ImageIcon(getClass().getResource("heritage.png"));
        Image heritageScaled = heritageRaw.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon heritageIcon = new ImageIcon(heritageScaled);

        JLabel title1 = new JLabel("Heritage Perspective", heritageIcon, SwingConstants.LEFT);
        title1.setFont(new Font("SansSerif", Font.BOLD, 15));
        title1.setIconTextGap(10);
        title1.setBounds(20, 10, 300, 25);
        card1.add(title1);

        JTextArea desc1 = new JTextArea("A refined sanctuary where the romance of Italian architectural precision is woven with the warmth and grace of Filipino heritage.");
        desc1.setFont(new Font("SansSerif", Font.PLAIN, 12));
        desc1.setForeground(Color.GRAY);
        desc1.setLineWrap(true);
        desc1.setWrapStyleWord(true);
        desc1.setEditable(false);
        desc1.setOpaque(false);
        desc1.setBounds(20, 35, 460, 40);
        card1.add(desc1);
        add(card1);

        
        JPanel card2 = new JPanel(null);
        card2.setBackground(Color.WHITE);
        card2.setBorder(new LineBorder(new Color(235, 235, 235), 1));
        card2.setBounds(450, 670, 500, 80);

        ImageIcon comfortRaw = new ImageIcon(getClass().getResource("comfort.png"));
        Image comfortScaled = comfortRaw.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon comfortIcon = new ImageIcon(comfortScaled);

        JLabel title2 = new JLabel("Customized Comfort", comfortIcon, SwingConstants.LEFT);
        title2.setFont(new Font("SansSerif", Font.BOLD, 15));
        title2.setIconTextGap(10);
        title2.setBounds(20, 10, 300, 25);
        card2.add(title2);

        JTextArea desc2 = new JTextArea("Experience a world where every detail is an intention, from stately interiors to deeply personalized concierge service.");
        desc2.setFont(new Font("SansSerif", Font.PLAIN, 12));
        desc2.setForeground(Color.GRAY);
        desc2.setLineWrap(true);
        desc2.setWrapStyleWord(true);
        desc2.setEditable(false);
        desc2.setOpaque(false);
        desc2.setBounds(20, 35, 460, 40);
        card2.add(desc2);
        add(card2);

        
        JPanel card3 = new JPanel(null);
        card3.setBackground(Color.WHITE);
        card3.setBorder(new LineBorder(new Color(235, 235, 235), 1));
        card3.setBounds(450, 760, 500, 80);

        ImageIcon luxuryRaw = new ImageIcon(getClass().getResource("luxury.png"));
        Image luxuryScaled = luxuryRaw.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon luxuryIcon = new ImageIcon(luxuryScaled);

        JLabel title3 = new JLabel("Sustainable Luxury", luxuryIcon, SwingConstants.LEFT);
        title3.setFont(new Font("SansSerif", Font.BOLD, 15));
        title3.setIconTextGap(10);
        title3.setBounds(20, 10, 300, 25);
        card3.add(title3);

        JTextArea desc3 = new JTextArea("A distinguished address in the heart of the South, our hotel is a landmark of elevated living designed to leave a lasting impression.");
        desc3.setFont(new Font("SansSerif", Font.PLAIN, 12));
        desc3.setForeground(Color.GRAY);
        desc3.setLineWrap(true);
        desc3.setWrapStyleWord(true);
        desc3.setEditable(false);
        desc3.setOpaque(false);
        desc3.setBounds(20, 35, 460, 40);
        card3.add(desc3);
        add(card3);
        
        setVisible(true);
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
        if (e.getSource() == logoutbtn) {
            int choice = JOptionPane.showConfirmDialog(
                this, 
                "Are you sure you want to log out?", 
                "Log Out Confirmation", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );
            
            if (choice == JOptionPane.YES_OPTION) {
                dispose();
                new loginpage().setVisible(true);
            }
        } else if (e.getSource() == reservebtn) {
            dispose();
            new reservepage().setVisible(true);
        } else if (e.getSource() == viewbtn) {
            dispose();
            new viewpage().setVisible(true);
        } else if (e.getSource() == searchbtn) {
            dispose();
            new searchpage().setVisible(true);
        }
        else if(e.getSource()==cancelbtn){
            dispose();
            new cancelpage().setVisible(true);
        }
    }
}