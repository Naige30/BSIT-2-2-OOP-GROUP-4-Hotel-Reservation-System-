/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class searchpage extends JFrame implements ActionListener {

    JTextField txtSearch;
    JButton btnSearch, btnShowAll, btnReserve;
    JTable table;
    DefaultTableModel model;

    ArrayList<Room> rooms = new ArrayList<>();

    public searchpage() {

        setTitle("Search Room");
        setSize(500, 420);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);

        txtSearch = new JTextField();
        txtSearch.setBounds(30, 30, 200, 30);
        add(txtSearch);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(240, 30, 90, 30);
        btnSearch.addActionListener(this);
        add(btnSearch);

        btnShowAll = new JButton("Show All");
        btnShowAll.setBounds(340, 30, 100, 30);
        btnShowAll.addActionListener(this);
        add(btnShowAll);

        model = new DefaultTableModel();
        table = new JTable(model);

        model.addColumn("ID");
        model.addColumn("Room Type");
        model.addColumn("Price");
        model.addColumn("Status");

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(30, 80, 430, 220);
        add(sp);

        btnReserve = new JButton("Reserve");
        btnReserve.setBounds(180, 320, 120, 30);
        btnReserve.addActionListener(this);
        add(btnReserve);

        loadRooms();
        showTable(rooms);
    }

    //SAMPLE DATA ONLY DI KO KNOWS IF NEED NG SQL EH
    public void loadRooms() {
        rooms.add(new Room(1, "Deluxe", 2500, "Available"));
        rooms.add(new Room(2, "Standard", 1500, "Occupied"));
        rooms.add(new Room(3, "Suite", 4000, "Available"));
        rooms.add(new Room(4, "Family", 3000, "Maintenance"));
    }

    public void showTable(ArrayList<Room> list) {
        model.setRowCount(0);

        for (Room r : list) {
            model.addRow(new Object[]{
                r.id,
                r.type,
                r.price,
                r.status
            });
        }
    }

    //ETO UNG SEARCH FUNCTION
    public void searchRoom() {
        String keyword = txtSearch.getText().toLowerCase();

        ArrayList<Room> result = new ArrayList<>();

        for (Room r : rooms) {
            if (r.type.toLowerCase().contains(keyword) ||
                r.status.toLowerCase().contains(keyword)) {

                result.add(r);
            }
        }

        showTable(result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnSearch) {
            searchRoom();
        }

        if (e.getSource() == btnShowAll) {
            showTable(rooms);
        }

        if (e.getSource() == btnReserve) {

            int row = table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Please select a room first!");
                return;
            }

            reservepage rp = new reservepage();
            rp.setVisible(true);

            this.dispose();
        }
    }
}
