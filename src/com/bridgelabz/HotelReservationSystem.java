package com.bridgelabz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
    private LocalDate fromDate;
    private LocalDate toDate;
    private long noOfDays;

    public long getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(long noOfDays) {
        this.noOfDays = noOfDays;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }


    @Override
    public String toString() {
        return "HotelReservationSystem{" +
                "fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", noOfDays=" + noOfDays +
                '}';
    }
}
