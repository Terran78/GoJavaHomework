package com.stromilov.practice.module05;

import java.util.Date;

public class TripAdvisorAPI implements API{

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(987, 50, 2, new Date(20170301), "Hotel1", "Vinnitsa");
        rooms[1] = new Room(876, 100, 3, new Date(20170215), "Hotel2", "Kiev");
        rooms[2] = new Room(765, 250, 2, new Date(20170310), "Hotel3", "Kharkov");
        rooms[3] = new Room(654, 200, 3, new Date(20170320), "Hotel4", "Lvov");
        rooms[4] = new Room(543, 350, 2, new Date(20170311), "Hotel5", "Odessa");
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
