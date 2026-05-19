package hotel.reservation.system.view;
import hotel.reservation.system.model.Room;
import hotel.reservation.system.view.viewpage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class casalacao extends JFrame implements ActionListener {
    private final JLabel title, roomName, img1, img2, img3;
    private final JSeparator line; 
    private final JButton home, reservebtn;
    private final JTextArea fullDescription;
    private final JLabel bedLabel, bedDesc, sizeLabel, sizeDesc, occLabel, occDesc, viewLabel, viewDesc;
    private final JLabel lblAmenities, lblBathroom;
    private final ImageIcon sparkleIcon;

    public casalacao() {
        setSize(1000, 950);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Giovanni Madrigal Grand Hotel: A Hotel Reservation System");
        setIconImage(new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/logo.png")).getImage());

        
        ImageIcon sparkleRaw = new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/sparkle.png"));
        Image sparkleScaled = sparkleRaw.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        sparkleIcon = new ImageIcon(sparkleScaled);

        
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

        roomName = new JLabel("CASA LACAO", SwingConstants.CENTER);
        roomName.setBounds(0, 75, 1000, 45);
        roomName.setFont(new Font("Serif", Font.PLAIN, 38)); 
        add(roomName);

        line = new JSeparator();
        line.setBounds(350, 130, 300, 1); 
        line.setForeground(new Color(230, 230, 230));
        add(line);

        
        ImageIcon rawImg1 = new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/casalacao1.jpg"));
        Image scaledImg1 = rawImg1.getImage().getScaledInstance(300, 230, Image.SCALE_SMOOTH);
        img1 = new JLabel(new ImageIcon(scaledImg1));
        img1.setBounds(40, 160, 300, 230);
        add(img1);

        
        ImageIcon rawImg2 = new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/casalacao2.jpg"));
        Image scaledImg2 = rawImg2.getImage().getScaledInstance(300, 230, Image.SCALE_SMOOTH);
        img2 = new JLabel(new ImageIcon(scaledImg2));
        img2.setBounds(350, 160, 300, 230);
        add(img2);

        
        ImageIcon rawImg3 = new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/casalacao3.jpg"));
        Image scaledImg3 = rawImg3.getImage().getScaledInstance(300, 230, Image.SCALE_SMOOTH);
        img3 = new JLabel(new ImageIcon(scaledImg3));
        img3.setBounds(660, 160, 300, 230);
        add(img3);

        
        fullDescription = new JTextArea("At this level, luxury becomes expansive and deeply personal. Casa Lacao is conceived as a private residence—generous in scale,"
                + " rich in detail, and designed for shared moments without compromise. Multiple king beds, a grand living space, and an atmosphere of quiet exclusivity"
                + " define the experience, offering a seamless blend of comfort, privacy, and elevated living.");
        fullDescription.setBounds(40, 420, 920, 100);
        fullDescription.setFont(new Font("Serif", Font.ITALIC, 17));
        fullDescription.setLineWrap(true);
        fullDescription.setWrapStyleWord(true);
        fullDescription.setEditable(false);
        fullDescription.setForeground(new Color(80, 80, 80));
        fullDescription.setOpaque(false);
        add(fullDescription);


        ImageIcon bedRaw = new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/roompref.png"));
        Image bedScaled = bedRaw.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH);
        bedLabel = new JLabel("BED CONFIGURATION");
        bedLabel.setIcon(new ImageIcon(bedScaled));
        bedLabel.setIconTextGap(12);
        bedLabel.setFont(new Font("Serif", Font.BOLD, 14));
        bedLabel.setBounds(40, 540, 300, 30);
        add(bedLabel);

        bedDesc = new JLabel("3 King Beds");
        bedDesc.setIcon(sparkleIcon);
        bedDesc.setIconTextGap(10);
        bedDesc.setFont(new Font("Serif", Font.PLAIN, 14));
        bedDesc.setBounds(55, 540 + 32, 300, 20);
        add(bedDesc);

        ImageIcon sizeRaw = new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/roomsize.png"));
        Image sizeScaled = sizeRaw.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH);
        sizeLabel = new JLabel("ROOM SIZE");
        sizeLabel.setIcon(new ImageIcon(sizeScaled));
        sizeLabel.setIconTextGap(12);
        sizeLabel.setFont(new Font("Serif", Font.BOLD, 14));
        sizeLabel.setBounds(40, 540 + 70, 300, 30);
        add(sizeLabel);

        sizeDesc = new JLabel("180 sq m");
        sizeDesc.setIcon(sparkleIcon);
        sizeDesc.setIconTextGap(10);
        sizeDesc.setFont(new Font("Serif", Font.PLAIN, 14));
        sizeDesc.setBounds(55, 540 + 102, 300, 20);
        add(sizeDesc);

        ImageIcon occRaw = new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/occupancy.png"));
        Image occScaled = occRaw.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH);
        occLabel = new JLabel("OCCUPANCY");
        occLabel.setIcon(new ImageIcon(occScaled));
        occLabel.setIconTextGap(12);
        occLabel.setFont(new Font("Serif", Font.BOLD, 14));
        occLabel.setBounds(40, 540 + 140, 300, 30);
        add(occLabel);

        occDesc = new JLabel("4 – 8 Persons");
        occDesc.setIcon(sparkleIcon);
        occDesc.setIconTextGap(10);
        occDesc.setFont(new Font("Serif", Font.PLAIN, 14));
        occDesc.setBounds(55, 540 + 172, 300, 20);
        add(occDesc);

        ImageIcon viewRaw = new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/view.png"));
        Image viewScaled = viewRaw.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH);
        viewLabel = new JLabel("VIEW");
        viewLabel.setIcon(new ImageIcon(viewScaled));
        viewLabel.setIconTextGap(12);
        viewLabel.setFont(new Font("Serif", Font.BOLD, 14));
        viewLabel.setBounds(40, 540 + 210, 300, 30);
        add(viewLabel);

        viewDesc = new JLabel("Panoramic City View");
        viewDesc.setIcon(sparkleIcon);
        viewDesc.setIconTextGap(10);
        viewDesc.setFont(new Font("Serif", Font.PLAIN, 14));
        viewDesc.setBounds(55, 540 + 242, 300, 20);
        add(viewDesc);

        
        ImageIcon amenRaw = new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/amenities.png"));
        Image amenScaled = amenRaw.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH);
        lblAmenities = new JLabel("PREMIUM AMENITIES");
        lblAmenities.setIcon(new ImageIcon(amenScaled));
        lblAmenities.setIconTextGap(12);
        lblAmenities.setFont(new Font("Serif", Font.BOLD, 14));
        lblAmenities.setBounds(350, 540, 300, 30);
        add(lblAmenities);

        String[] amenitiesList = {
            "Expansive multi-room living",
            "Full residential-style layout",
            "Premium lounge and dining",
            "Bedside electronic controls",
            "Individual thermostat controls",
            "Mood lighting throughout",
            "Executive workspace areas",
            "In-room safes"
        };
        for (int i = 0; i < amenitiesList.length; i++) {
            JLabel item = new JLabel(amenitiesList[i]);
            item.setIcon(sparkleIcon);
            item.setIconTextGap(10);
            item.setFont(new Font("Serif", Font.PLAIN, 14));
            item.setBounds(365, (540 + 38) + (i * 24), 280, 20);
            add(item);
        }

        
        ImageIcon bathRaw = new ImageIcon(getClass().getResource("/hotel/reservation/system/resources/bathroom.png"));
        Image bathScaled = bathRaw.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH);
        lblBathroom = new JLabel("BATHROOM");
        lblBathroom.setIcon(new ImageIcon(bathScaled));
        lblBathroom.setIconTextGap(12);
        lblBathroom.setFont(new Font("Serif", Font.BOLD, 14));
        lblBathroom.setBounds(660, 540, 300, 30);
        add(lblBathroom);

        String[] bathList = {
            "Multiple luxury marble baths",
            "Separate shower and bathtub",
            "Spa-like ambiance lighting",
            "La Bottega bath amenities",
            "Hands-free telephones",
            "Professional hairdryers",
            "Plush bathrobes and slippers"
        };
        for (int i = 0; i < bathList.length; i++) {
            JLabel item = new JLabel(bathList[i]);
            item.setIcon(sparkleIcon);
            item.setIconTextGap(10);
            item.setFont(new Font("Serif", Font.PLAIN, 14));
            item.setBounds(675, (540 + 38) + (i * 24), 280, 20);
            add(item);
        }

        
        reservebtn = new JButton("RESERVE NOW");
        reservebtn.setBounds(375, 845, 250, 45); 
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