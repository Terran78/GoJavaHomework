package com.stromilov.practice.module05;

import java.util.Arrays;

public class Controller {

    private API apis[] = new API[3];
    Room[] rooms = new Room[1];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] request1 = apis[0].findRooms(price, persons, city, hotel);
        Room[] request2 = apis[1].findRooms(price, persons, city, hotel);
        Room[] request3 = apis[2].findRooms(price, persons, city, hotel);
        Room[] request = new Room[request1.length + request2.length + request3.length];

        int count = 0;
        for (int i = 0; i < request1.length; i++) {
            request[count] = request1[i];
            count++;
        }

        for (int i = 0; i < request2.length; i++) {
            request[count] = request2[i];
            count++;
        }

        for (int i = 0; i < request3.length; i++) {
            request[count] = request3[i];
            count++;
        }

        return request;
    }

    public Room[] check(API api1, API api2){
        Room[] roomsFromAPI1 = api1.getAll();
        Room[] roomsFromAPI2 = api2.getAll();

        int countRooms = 0;

        for (int i = 0; i < roomsFromAPI1.length; i++) {
            for (int j = 0; j < roomsFromAPI2.length; j++) {
                if (roomsFromAPI1.equals(roomsFromAPI2)){
                    if (rooms.length > 1) SetRoomArray(rooms);
                    rooms[countRooms] = roomsFromAPI2[j];
                    countRooms++;
                }

            }
        }

        return rooms;
    }

    public static Room[] SetRoomArray(Room[] rooms) {
        Room[] newRooms = Arrays.copyOf(rooms, rooms.length + 1);
        return newRooms;
    }

}