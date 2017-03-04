package com.stromilov.practice.module05;

import java.util.Date;

public class BookingComAPI implements API{

    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(1, 1000, 4, new Date(20170301), "Hotel1", "Vinnitsa");
        rooms[1] = new Room(2, 1200, 6, new Date(20170215), "Hotel2", "Kiev");
        rooms[2] = new Room(3, 1400, 8, new Date(20170310), "Hotel3", "Kharkov");
        rooms[3] = new Room(4, 1600, 6, new Date(20170320), "Hotel4", "Lvov");
        rooms[4] = new Room(5, 1800, 8, new Date(20170311), "Hotel5", "Odessa");
        rooms = new Room[] {rooms[0], rooms[1], rooms[2], rooms[3], rooms[4]};
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
