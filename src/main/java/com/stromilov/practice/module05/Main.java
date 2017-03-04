package com.stromilov.practice.module05;

/**
 * Created by Admin on 04.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requstRooms(200, 2,"Berlin", "Ritz");
        controller.requstRooms(100, 3,"Kiev", "Hotel2");
        controller.requstRooms(1400, 8,"Kharkov", "Hotel3");

        controller.check(new GoogleAPI(), new TripAdvisorAPI());
        controller.check(new TripAdvisorAPI(), new BookingComAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());
    }
}
