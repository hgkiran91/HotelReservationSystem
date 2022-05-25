package com.bridgelabz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HotelReservation {

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");

        Hotel hotel1 = new Hotel("LakeWood", 200, 100, 120, 90);
        Hotel hotel2 = new Hotel("RiverWood", 120, 90, 100, 90);
        Hotel hotel3 = new Hotel("BridgeWood", 150, 120, 100, 90);
    }
}