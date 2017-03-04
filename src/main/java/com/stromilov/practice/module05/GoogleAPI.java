package com.stromilov.practice.module05;

import java.util.Date;

public class GoogleAPI implements API{
    private Room[] rooms = new Room[5];

    public GoogleAPI(){
        rooms[0] = new Room(123, 100, 1, new Date(20170127), "Hilton", "Kiev");
        rooms[1] = new Room(234, 200, 2, new Date(20170128), "Ritz", "Berlin");
        rooms[2] = new Room(345, 300, 3, new Date(20170201), "Madison", "New York");
        rooms[3] = new Room(456, 400, 2, new Date(20170202), "Quins", "London");
        rooms[4] = new Room(567, 500, 1, new Date(20170203), "Dnipro", "Kharkov");
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
