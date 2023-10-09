package ru.geekbrains.lesson5.views;

import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.presenters.View;
import ru.geekbrains.lesson5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables) {
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    @Override
    public void ShowReservationTableResult(int reservationNo) {
        if  (reservationNo > 0) {
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
        }
        else {
            System.out.println("Не удалось забронировать столик, повторите попытку позже.");
        }
    }

    public void reservationTable(Date orderDate, int tableNo, String name) {
        if (observer != null) {
            observer.onReservationTable(orderDate, tableNo, name);
        }

    }
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        if (observer != null)
            observer.onСhangeReservationTable(oldReservation, reservationDate, tableNo, name);

    }

    @Override
    public void printChangeReservationTableResult(int reservationNo) {
        System.out.printf("Бронь столика успешно изменена. Номер вашей брони: #%d\n", reservationNo);

    }

}
