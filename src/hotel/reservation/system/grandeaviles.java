package hotel.reservation.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Naige
 */
public class grandeaviles extends JFrame implements ActionListener {
    private final JLabel title, roomName, imgBed;
    private final JSeparator line; 
    private final JButton home, reservebtn;
    private final JTextArea fullDescription;
    private final JLabel bedLabel, bedDesc, sizeLabel, sizeDesc, occLabel, occDesc;
    private final JLabel lblAmenities;

    public grandeaviles() {
        setSize(1000, 950);
        setTitle("Giovanni Madrigal Grand Hotel: A Hotel Reservation System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());

        
        ImageIcon sparkleRaw = new ImageIcon(getClass().getResource("sparkle.png"));
        Image sparkleScaled = sparkleRaw.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon sparkleIcon = new ImageIcon(sparkleScaled);

        
        home = new JButton("BACK");
        home.setBounds(30, 25, 85, 28); 
        home.setFocusPainted(false);
        home.setBorderPainted(false);
        home.setBackground(new Color(245, 245, 245)); 
        home.setForeground(Color.DARK_GRAY);
        home.setFont(new Font("SansSerif", Font.BOLD, 10));
        add(home);
        home.addActionListener(this);

        
        title = new JLabel("Giovanni Madrigal Grand Hotel", SwingConstants.CENTER);
        title.setBounds(0, 45, 1000, 25);
        title.setFont(new Font("SansSerif", Font.PLAIN, 14));
        title.setForeground(new Color(180, 180, 180));
        add(title);

        roomName = new JLabel("GRANDE’ AVILÉS", SwingConstants.CENTER);
        roomName.setBounds(0, 75, 1000, 45);
        roomName.setFont(new Font("Serif", Font.PLAIN, 38)); 
        add(roomName);

        line = new JSeparator();
        line.setBounds(350, 130, 300, 1); 
        line.setForeground(new Color(230, 230, 230));
        add(line);

        
        imgBed = new JLabel();
        imgBed.setBounds(60, 170, 880, 320); 
        ImageIcon rawImg1 = new ImageIcon(getClass().getResource("grandeaviles1.jpg"));
        Image scaledImg1 = rawImg1.getImage().getScaledInstance(880, 320, Image.SCALE_SMOOTH);
        imgBed.setIcon(new ImageIcon(scaledImg1));
        add(imgBed);

        
        fullDescription = new JTextArea("A graceful evolution in space and style, the Grande’ Aviles expands into a more " +
                                       "immersive living experience. Anchored by a plush king bed, the suite unfolds into " +
                                       "a refined lounge area and a discreet kitchenette, allowing for both relaxation " +
                                       "and independence. Designed for the discerning traveler, every element ensures an elevated stay.");
        fullDescription.setBounds(60, 505, 880, 80); 
        fullDescription.setFont(new Font("Serif", Font.ITALIC, 18));
        fullDescription.setLineWrap(true);
        fullDescription.setWrapStyleWord(true);
        fullDescription.setEditable(false);
        fullDescription.setForeground(new Color(80, 80, 80));
        fullDescription.setOpaque(false);
        add(fullDescription);

        
        int detailsY = 610; 

        
        ImageIcon bedRaw = new ImageIcon(getClass().getResource("roompref.png"));
        Image bedScaled = bedRaw.getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon bedIcon = new ImageIcon(bedScaled);
        bedLabel = new JLabel("BED CONFIGURATION");
        bedLabel.setIcon(bedIcon);
        bedLabel.setIconTextGap(12);
        bedLabel.setFont(new Font("Serif", Font.BOLD, 15));
        bedLabel.setBounds(100, detailsY, 350, 32);
        add(bedLabel);

        bedDesc = new JLabel("King Bed");
        bedDesc.setIcon(sparkleIcon);
        bedDesc.setIconTextGap(10);
        bedDesc.setFont(new Font("Serif", Font.PLAIN, 15));
        bedDesc.setBounds(115, detailsY + 35, 350, 20);
        add(bedDesc);

        
        ImageIcon sizeRaw = new ImageIcon(getClass().getResource("roomsize.png"));
        Image sizeScaled = sizeRaw.getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon sizeIcon = new ImageIcon(sizeScaled);
        sizeLabel = new JLabel("ROOM SIZE");
        sizeLabel.setIcon(sizeIcon);
        sizeLabel.setIconTextGap(12);
        sizeLabel.setFont(new Font("Serif", Font.BOLD, 15));
        sizeLabel.setBounds(100, detailsY + 80, 350, 32);
        add(sizeLabel);

        sizeDesc = new JLabel("61 – 65 sq m / 656 – 700 sq ft");
        sizeDesc.setIcon(sparkleIcon);
        sizeDesc.setIconTextGap(10);
        sizeDesc.setFont(new Font("Serif", Font.PLAIN, 15));
        sizeDesc.setBounds(115, detailsY + 115, 350, 20);
        add(sizeDesc);

        
        ImageIcon occRaw = new ImageIcon(getClass().getResource("occupancy.png"));
        Image occScaled = occRaw.getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon occIcon = new ImageIcon(occScaled);
        occLabel = new JLabel("OCCUPANCY");
        occLabel.setIcon(occIcon);
        occLabel.setIconTextGap(12);
        occLabel.setFont(new Font("Serif", Font.BOLD, 15));
        occLabel.setBounds(100, detailsY + 160, 350, 32);
        add(occLabel);

        occDesc = new JLabel("2 Adults and 2 Children");
        occDesc.setIcon(sparkleIcon);
        occDesc.setIconTextGap(10);
        occDesc.setFont(new Font("Serif", Font.PLAIN, 15));
        occDesc.setBounds(115, detailsY + 195, 350, 20);
        add(occDesc);

        
        ImageIcon amenRaw = new ImageIcon(getClass().getResource("amenities.png"));
        Image amenScaled = amenRaw.getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon amenIcon = new ImageIcon(amenScaled);
        lblAmenities = new JLabel("PREMIUM AMENITIES");
        lblAmenities.setIcon(amenIcon);
        lblAmenities.setIconTextGap(12);
        lblAmenities.setFont(new Font("Serif", Font.BOLD, 15));
        lblAmenities.setBounds(520, detailsY, 350, 32);
        add(lblAmenities);

        String[] amenities = {
            "Expanded lounge area & Executive desk", 
            "Private kitchenette & In-room dining", 
            "Marble bathroom with European fixtures", 
            "Malupiton Guest Visit", 
            "24-hour in-room dining"
        };
        
        for (int i = 0; i < amenities.length; i++) {
            JLabel item = new JLabel(amenities[i]);
            item.setIcon(sparkleIcon);
            item.setIconTextGap(10);
            item.setFont(new Font("Serif", Font.PLAIN, 15));
            item.setBounds(535, (detailsY + 45) + (i * 25), 420, 20);
            add(item);
        }

        
        reservebtn = new JButton("RESERVE NOW");
        reservebtn.setBounds(375, 840, 250, 45); 
        reservebtn.setBackground(new Color(69, 104, 130)); 
        reservebtn.setForeground(Color.WHITE);
        reservebtn.setFont(new Font("SansSerif", Font.BOLD, 12));
        reservebtn.setFocusPainted(false);
        reservebtn.setBorderPainted(false);
        add(reservebtn);
        reservebtn.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == home) {
            dispose();
            new viewpage().setVisible(true);
        } else if (e.getSource() == reservebtn) {
            dispose();
            new reservepage().setVisible(true);
        }
    }
}