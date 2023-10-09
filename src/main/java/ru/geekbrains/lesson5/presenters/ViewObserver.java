package ru.geekbrains.lesson5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);

    void onСhangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

    void printChangeReservationTableResult(int reservationNo);

}
