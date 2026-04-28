/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

//store data. Model class tawag dito
public class Room {
    int id;
    String type;
    double price;
    String status;

    public Room(int id, String type, double price, String status) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.status = status;
    }
}
