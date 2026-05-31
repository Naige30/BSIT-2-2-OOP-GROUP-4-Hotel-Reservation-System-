package hotel.reservation.system.view;

import hotel.reservation.system.model.Room;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class searchpage extends JFrame implements ActionListener {
    private final JTextField txtSearch;
    private final JButton btnSearch, btnShowAll, btnReserve, btnBack;
    private JTable table;
    private DefaultTableModel model;
    private final ArrayList<Room> rooms = new ArrayList<>();

    public searchpage() {
        setTitle("Giovanni Madrigal Grand Hotel: Search");
        setSize(950, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Giovanni Madrigal Grand Hotel | Search Page");
        
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(new EmptyBorder(40, 60, 40, 60));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 5, 10, 5);

        JLabel lblTitle = new JLabel("ROOM INVENTORY");
        lblTitle.setFont(new Font("Inter", Font.BOLD, 26));
        lblTitle.setForeground(new Color(30, 30, 30));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 3;
        mainPanel.add(lblTitle, gbc);

        txtSearch = new JTextField("Search room type or status...");
        txtSearch.setFont(new Font("SansSerif", Font.PLAIN, 15));
        txtSearch.setBorder(new MatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
        addPlaceholderBehavior(txtSearch, "Search room type or status...");
        
        gbc.gridy = 1; gbc.gridwidth = 1; gbc.weightx = 1.0;
        mainPanel.add(txtSearch, gbc);

        btnSearch = new JButton("FIND ROOMS");
        styleButton(btnSearch, new Color(27, 60, 83), Color.WHITE);
        btnSearch.addActionListener(this);
        gbc.gridx = 1; gbc.weightx = 0;
        mainPanel.add(btnSearch, gbc);

        btnShowAll = new JButton("SHOW ALL");
        styleButton(btnShowAll, new Color(225, 225, 225), Color.BLACK); 
        btnShowAll.addActionListener(this);
        gbc.gridx = 2;
        mainPanel.add(btnShowAll, gbc);

        setupTable();
        JScrollPane sp = new JScrollPane(table);
        sp.getViewport().setBackground(Color.WHITE);
        sp.setBorder(BorderFactory.createLineBorder(new Color(230, 230, 230)));
        
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 3;
        gbc.weighty = 1.0; gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(25, 0, 25, 0);
        mainPanel.add(sp, gbc);

        JPanel footerPanel = new JPanel(new BorderLayout(15, 0));
        footerPanel.setBackground(Color.WHITE);

        btnBack = new JButton("RETURN TO MENU");
        styleButton(btnBack, new Color(225, 225, 225), Color.DARK_GRAY); 
        btnBack.setPreferredSize(new Dimension(200, 48));
        btnBack.addActionListener(this);

        btnReserve = new JButton("PROCEED TO RESERVATION");
        styleButton(btnReserve, new Color(27, 60, 83), Color.WHITE);
        btnReserve.setPreferredSize(new Dimension(280, 48));
        btnReserve.addActionListener(this);

        footerPanel.add(btnBack, BorderLayout.WEST);
        footerPanel.add(btnReserve, BorderLayout.EAST);

        gbc.gridy = 3; gbc.weighty = 0; gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(footerPanel, gbc);

        add(mainPanel);
        loadRooms();
        showTable(rooms);
    }

    private void setupTable() {
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };
        table = new JTable(model);
        model.addColumn("ID");
        model.addColumn("ROOM TYPE");
        model.addColumn("PRICE (PHP)");
        model.addColumn("STATUS");

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(60);   
        table.getColumnModel().getColumn(1).setPreferredWidth(380);  
        table.getColumnModel().getColumn(2).setPreferredWidth(180);  
        table.getColumnModel().getColumn(3).setPreferredWidth(188);  
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        table.setRowHeight(45);
        table.setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.setSelectionBackground(new Color(235, 245, 255));
        table.setShowVerticalLines(false);
        table.setGridColor(new Color(245, 245, 245));

        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Inter", Font.BOLD, 13));
        header.setBackground(Color.WHITE);
        header.setPreferredSize(new Dimension(0, 45));
        ((DefaultTableCellRenderer)header.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }

    private void styleButton(JButton btn, Color bg, Color fg) {
        btn.setFont(new Font("Inter", Font.BOLD, 12));
        btn.setBackground(bg);
        btn.setForeground(fg);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) { btn.setBackground(bg.darker()); }
            @Override
            public void mouseExited(MouseEvent e) { btn.setBackground(bg); }
        });
    }

    private void addPlaceholderBehavior(JTextField field, String placeholder) {
        field.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (field.getText().equals(placeholder)) {
                    field.setText("");
                    field.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (field.getText().isEmpty()) {
                    field.setForeground(Color.GRAY);
                    field.setText(placeholder);
                }
            }
        });
    }

    public void loadRooms() {
        rooms.add(new Room(1, "Tuazon Deluxe", 2500, "Available"));
        rooms.add(new Room(2, "Palazzo Arzola", 1500, "Occupied"));
        rooms.add(new Room(3, "Casa Lacao", 4000, "Available"));
        rooms.add(new Room(4, "Grande Aviles", 3000, "Maintenance"));
    }

    public void showTable(ArrayList<Room> list) {
        model.setRowCount(0);
        for (Room r : list) {
            model.addRow(new Object[]{r.id, r.type, r.price, r.status});
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSearch) {
            String keyword = txtSearch.getText().toLowerCase();
            if (keyword.equals("search room type or status...")) return;
            ArrayList<Room> result = new ArrayList<>();
            for (Room r : rooms) {
                if (r.type.toLowerCase().contains(keyword) || r.status.toLowerCase().contains(keyword)) {
                    result.add(r);
                }
            }
            showTable(result);
        } else if (e.getSource() == btnShowAll) {
            showTable(rooms);
            txtSearch.setText("Search room type or status...");
            txtSearch.setForeground(Color.GRAY);
        } else if (e.getSource() == btnBack) {
            dispose();
            new hotelmenu().setVisible(true);
        } else if (e.getSource() == btnReserve) {
            if (table.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Please select a room.", "Selection Required", JOptionPane.WARNING_MESSAGE);
                return;
            }
            dispose();
            new reservepage().setVisible(true);
        }
    }
}