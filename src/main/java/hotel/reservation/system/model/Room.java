package hotel.reservation.system.model;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

public class Room {
    public int id;
    public String roomNumber;
    public String type;
    public double price;
    public String status;

    public Room(int id, String roomNumber, String type, double price, String status) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public static ArrayList<Room> getAllRooms() {
        ArrayList<Room> list = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/hotel_db";
        String user = "root";
        String pass = "";
        String query = "SELECT * FROM rooms";

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try (Connection conn = DriverManager.getConnection(url, user, pass);
                 PreparedStatement stmt = conn.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    list.add(new Room(
                        rs.getInt("id"),
                        rs.getString("room_number"),
                        rs.getString("room_type"),
                        rs.getDouble("price"),
                        rs.getString("status")
                    ));
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, 
                "Driver Error: MySQL Connector JAR is missing from your IDE project libraries!\n" + e.getMessage(), 
                "Database Link Failure", 
                JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, 
                "SQL Connection Error: Check if XAMPP MySQL is active and database is named 'hotel_db'.\nDetails: " + e.getMessage(), 
                "Database Link Failure", 
                JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
}