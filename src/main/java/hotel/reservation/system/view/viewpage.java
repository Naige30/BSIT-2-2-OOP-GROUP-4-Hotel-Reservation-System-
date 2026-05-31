package hotel.reservation.system.view;
import hotel.reservation.system.model.Room;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class viewpage extends JFrame implements ActionListener {

    private final JLabel hotelName, subtitle;
    private final JButton view1, view2, view3, view4, home;
    private final JButton book1, book2, book3, book4;

    public viewpage() {
        setTitle("Giovanni Madrigal Grand Hotel: A Hotel Reservation System");
        setSize(1150, 950); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());

        hotelName = new JLabel("GIOVANNI MADRIGAL GRAND HOTEL", SwingConstants.CENTER);
        hotelName.setBounds(0, 25, 1150, 30);
        hotelName.setFont(new Font("Serif", Font.PLAIN, 24)); 
        hotelName.setForeground(new Color(50, 50, 50));
        add(hotelName);

        subtitle = new JLabel("MANILA", SwingConstants.CENTER);
        subtitle.setBounds(0, 55, 1150, 20);
        subtitle.setFont(new Font("SansSerif", Font.BOLD, 11));
        subtitle.setForeground(new Color(160, 160, 160));
        add(subtitle);

        JPanel mainLine = new JPanel();
        mainLine.setBounds(225, 85, 700, 1);
        mainLine.setBackground(new Color(230, 230, 230));
        add(mainLine);

        home = new JButton("HOME");
        home.setBounds(30, 25, 85, 28);
        home.setFocusPainted(false);
        home.setBorderPainted(false);
        home.setBackground(new Color(245, 245, 245));
        home.setForeground(Color.DARK_GRAY);
        home.setFont(new Font("SansSerif", Font.BOLD, 10));
        home.addActionListener(this);
        add(home);

        
        JPanel p1 = createPanel(40, 120);
        add(p1);
        p1.add(createImg("/tuazon1.jpg", 15, 15));
        p1.add(createTitle("TUAZON DELUXE", 285, 15));
        p1.add(createSep(285 + 65, 45));
        p1.add(createDetail("Bed Configuration", "King or Twin Beds", "/roompref.png", 285, 70));
        p1.add(createDetail("Room Size", "37 – 41 sq m", "/roomsize.png", 285, 125));
        p1.add(createDetail("Occupancy", "2 Adults and 2 Children", "/occupancy.png", 285, 180));
        view1 = createViewBtn(285 + 35, 245);
        view1.addActionListener(this);
        p1.add(view1);
        book1 = createBookBtn(285 + 35, 290);
        book1.addActionListener(this);
        p1.add(book1);

        
        JPanel p2 = createPanel(585, 120);
        add(p2);
        p2.add(createImg("/grandeaviles1.jpg", 15, 15));
        p2.add(createTitle("GRANDE' AVILES", 285, 15));
        p2.add(createSep(285 + 65, 45));
        p2.add(createDetail("Bed Configuration", "1 King Bed", "/roompref.png", 285, 70));
        p2.add(createDetail("Room Size", "61 sq m", "/roomsize.png", 285, 125));
        p2.add(createDetail("Occupancy", "4 People", "/occupancy.png", 285, 180));
        view2 = createViewBtn(285 + 35, 245);
        view2.addActionListener(this);
        p2.add(view2);
        book2 = createBookBtn(285 + 35, 290);
        book2.addActionListener(this);
        p2.add(book2);

        
        JPanel p3 = createPanel(40, 520);
        add(p3);
        p3.add(createImg("/casalacao1.jpg", 15, 15));
        p3.add(createTitle("CASA LACAO", 285, 15));
        p3.add(createSep(285 + 65, 45));
        p3.add(createDetail("Bed Configuration", "3 King Beds", "/roompref.png", 285, 70));
        p3.add(createDetail("Room Size", "180 sq m", "/roomsize.png", 285, 125));
        p3.add(createDetail("Occupancy", "4–8 Persons", "/occupancy.png", 285, 180));
        view3 = createViewBtn(285 + 35, 245);
        view3.addActionListener(this);
        p3.add(view3);
        book3 = createBookBtn(285 + 35, 290);
        book3.addActionListener(this);
        p3.add(book3);

        
        JPanel p4 = createPanel(585, 520);
        add(p4);
        p4.add(createImg("/palazzoarzola1.jpg", 15, 15));
        p4.add(createTitle("PALAZZO ARZOLA", 285, 15));
        p4.add(createSep(285 + 65, 45));
        p4.add(createDetail("Bed Configuration", "2 King Beds", "/roompref.png", 285, 70));
        p4.add(createDetail("Room Size", "200 sq m", "/roomsize.png", 285, 125));
        p4.add(createDetail("Occupancy", "3–6 Persons", "/occupancy.png", 285, 180));
        view4 = createViewBtn(285 + 35, 245);
        view4.addActionListener(this);
        p4.add(view4);
        book4 = createBookBtn(285 + 35, 290);
        book4.addActionListener(this);
        p4.add(book4);

        setVisible(true);
    }

    private JPanel createPanel(int x, int y) {
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(x, y, 540, 360); 
        p.setBackground(Color.WHITE);
        p.setBorder(new LineBorder(new Color(245, 245, 245), 1));
        return p;
    }

    private JLabel createImg(String path, int x, int y) {
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        Image img = icon.getImage().getScaledInstance(260, 220, Image.SCALE_SMOOTH);
        JLabel lbl = new JLabel(new ImageIcon(img));
        lbl.setBounds(x, y, 260, 220);
        return lbl;
    }

    private JLabel createTitle(String text, int x, int y) {
        JLabel lbl = new JLabel(text, SwingConstants.CENTER);
        lbl.setBounds(x, y, 210, 25);
        lbl.setFont(new Font("Serif", Font.BOLD, 18));
        return lbl;
    }

    private JPanel createSep(int x, int y) {
        JPanel sep = new JPanel();
        sep.setBounds(x, y, 80, 1);
        sep.setBackground(Color.BLACK);
        return sep;
    }

    private JPanel createDetail(String boldHeader, String plainInfo, String iconPath, int x, int y) {
        JPanel detailContainer = new JPanel(null);
        detailContainer.setBackground(Color.WHITE);
        detailContainer.setBounds(x, y, 320, 60);

        ImageIcon icon = new ImageIcon(getClass().getResource(iconPath));
        Image scaled = icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        JLabel iconLbl = new JLabel(new ImageIcon(scaled));
        iconLbl.setBounds(0, 5, 24, 24);
        detailContainer.add(iconLbl);

        JLabel headerLbl = new JLabel(boldHeader);
        headerLbl.setFont(new Font("SansSerif", Font.BOLD, 11));
        headerLbl.setForeground(new Color(60, 60, 60));
        headerLbl.setBounds(35, 2, 200, 20);
        detailContainer.add(headerLbl);

        JLabel infoLbl = new JLabel(plainInfo);
        infoLbl.setFont(new Font("SansSerif", Font.PLAIN, 11));
        infoLbl.setForeground(new Color(100, 100, 100));
        infoLbl.setBounds(35, 22, 250, 20); 
        detailContainer.add(infoLbl);

        return detailContainer;
    }

    private JButton createViewBtn(int x, int y) {
        JButton btn = new JButton("VIEW DETAILS");
        btn.setBounds(x, y, 140, 35);
        btn.setFocusPainted(false);
        btn.setBackground(Color.WHITE);
        btn.setForeground(new Color(80, 80, 80));
        btn.setFont(new Font("SansSerif", Font.BOLD, 10));
        btn.setBorder(new LineBorder(new Color(220, 220, 220)));
        return btn;
    }

    private JButton createBookBtn(int x, int y) {
        JButton btn = new JButton("BOOK NOW");
        btn.setBounds(x, y, 140, 35);
        btn.setFocusPainted(false);
        btn.setBackground(new Color(69, 104, 130)); 
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("SansSerif", Font.BOLD, 10));
        btn.setBorderPainted(false);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == home) {
            dispose();
            new hotelmenu().setVisible(true);
        } else if (e.getSource() == view1) {
            dispose();
            new tuazondeluxe().setVisible(true);
        } else if (e.getSource() == view2) {
            dispose();
            new grandeaviles().setVisible(true);
        } else if (e.getSource() == view3) {
            dispose();
            new casalacao().setVisible(true);
        } else if (e.getSource() == view4) {
            dispose();
            new palazzoarzola().setVisible(true);
        } else if (e.getSource() == book1 || e.getSource() == book2 ||
                   e.getSource() == book3 || e.getSource() == book4) {
            dispose();
            new reservepage().setVisible(true);
        }
    }
}