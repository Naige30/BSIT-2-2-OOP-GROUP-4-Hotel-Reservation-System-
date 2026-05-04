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
    private final JLabel title, roomName, img1, img2;
    private final JSeparator line; 
    private final JButton home, reservebtn;
    private final JTextArea fullDescription;
    private final JLabel bedLabel, bedDesc, sizeLabel, sizeDesc, occLabel, occDesc;
    private final JLabel lblAmenities;

    public tuazondeluxe() {
        setSize(1000, 950);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Giovanni Madrigal Grand Hotel: A Hotel Reservation System");
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

        roomName = new JLabel("TUAZON DELUXE", SwingConstants.CENTER);
        roomName.setBounds(0, 75, 1000, 45);
        roomName.setFont(new Font("Serif", Font.PLAIN, 38)); 
        add(roomName);

        line = new JSeparator();
        line.setBounds(350, 130, 300, 1); 
        line.setForeground(new Color(230, 230, 230));
        add(line);

        
        ImageIcon rawImg1 = new ImageIcon(getClass().getResource("tuazon1.jpg"));
        Image scaledImg1 = rawImg1.getImage().getScaledInstance(430, 280, Image.SCALE_SMOOTH);
        img1 = new JLabel(new ImageIcon(scaledImg1));
        img1.setBounds(60, 170, 430, 280); 
        add(img1);

        ImageIcon rawImg2 = new ImageIcon(getClass().getResource("tuazon2.jpg"));
        Image scaledImg2 = rawImg2.getImage().getScaledInstance(430, 280, Image.SCALE_SMOOTH);
        img2 = new JLabel(new ImageIcon(scaledImg2));
        img2.setBounds(510, 170, 430, 280);
        add(img2);

        
        fullDescription = new JTextArea("An elegant introduction to your stay, the Tuazon Deluxe is a study in quiet refinement. " +
                                       "Softly lit and thoughtfully composed, the room features a choice of king or twin beds, " +
                                       "complemented by warm textures and contemporary Filipino accents. Designed for comfort " +
                                       "and ease, it offers a serene haven—where simplicity is elevated into sophistication.");
        fullDescription.setBounds(60, 465, 880, 100);
        fullDescription.setFont(new Font("Serif", Font.ITALIC, 18));
        fullDescription.setLineWrap(true);
        fullDescription.setWrapStyleWord(true);
        fullDescription.setEditable(false);
        fullDescription.setForeground(new Color(80, 80, 80));
        fullDescription.setOpaque(false);
        add(fullDescription);

        
        ImageIcon bedRaw = new ImageIcon(getClass().getResource("roompref.png"));
        Image bedScaled = bedRaw.getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon bedIcon = new ImageIcon(bedScaled);
        bedLabel = new JLabel("BED CONFIGURATION");
        bedLabel.setIcon(bedIcon);
        bedLabel.setIconTextGap(12);
        bedLabel.setFont(new Font("Serif", Font.BOLD, 15));
        bedLabel.setBounds(100, 590, 350, 32);
        add(bedLabel);

        bedDesc = new JLabel("King or Twin Beds");
        bedDesc.setIcon(sparkleIcon);
        bedDesc.setIconTextGap(10);
        bedDesc.setFont(new Font("Serif", Font.PLAIN, 15));
        bedDesc.setBounds(115, 590 + 35, 350, 20);
        add(bedDesc);

        
        ImageIcon sizeRaw = new ImageIcon(getClass().getResource("roomsize.png"));
        Image sizeScaled = sizeRaw.getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon sizeIcon = new ImageIcon(sizeScaled);
        sizeLabel = new JLabel("ROOM SIZE");
        sizeLabel.setIcon(sizeIcon);
        sizeLabel.setIconTextGap(12);
        sizeLabel.setFont(new Font("Serif", Font.BOLD, 15));
        sizeLabel.setBounds(100, 590 + 80, 350, 32);
        add(sizeLabel);

        sizeDesc = new JLabel("37 – 41 sq m / 398 – 441 sq ft");
        sizeDesc.setIcon(sparkleIcon);
        sizeDesc.setIconTextGap(10);
        sizeDesc.setFont(new Font("Serif", Font.PLAIN, 15));
        sizeDesc.setBounds(115, 590 + 115, 350, 20);
        add(sizeDesc);

        
        ImageIcon occRaw = new ImageIcon(getClass().getResource("occupancy.png"));
        Image occScaled = occRaw.getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon occIcon = new ImageIcon(occScaled);
        occLabel = new JLabel("OCCUPANCY");
        occLabel.setIcon(occIcon);
        occLabel.setIconTextGap(12);
        occLabel.setFont(new Font("Serif", Font.BOLD, 15));
        occLabel.setBounds(100, 590 + 160, 350, 32);
        add(occLabel);

        occDesc = new JLabel("2 Adults and 2 Children");
        occDesc.setIcon(sparkleIcon);
        occDesc.setIconTextGap(10);
        occDesc.setFont(new Font("Serif", Font.PLAIN, 15));
        occDesc.setBounds(115, 590 + 195, 350, 20);
        add(occDesc);

        
        ImageIcon amenRaw = new ImageIcon(getClass().getResource("amenities.png"));
        Image amenScaled = amenRaw.getImage().getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon amenIcon = new ImageIcon(amenScaled);
        lblAmenities = new JLabel("PREMIUM AMENITIES");
        lblAmenities.setIcon(amenIcon);
        lblAmenities.setIconTextGap(12);
        lblAmenities.setFont(new Font("Serif", Font.BOLD, 15));
        lblAmenities.setBounds(520, 590, 350, 32);
        add(lblAmenities);

        String[] amenities = {"Luxurious Marble Bathroom",
            "Roderick as your Butler",
            "High-Speed Wireless Internet",
            "24-hour in-room dining"};
        
        for (int i = 0; i < amenities.length; i++) {
            JLabel item = new JLabel(amenities[i]);
            item.setIcon(sparkleIcon);
            item.setIconTextGap(10);
            item.setFont(new Font("Serif", Font.PLAIN, 15));
            item.setBounds(535, (590 + 45) + (i * 25), 350, 20);
            add(item);
        }

        
        reservebtn = new JButton("RESERVE NOW");
        reservebtn.setBounds(375, 830, 250, 45); 
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