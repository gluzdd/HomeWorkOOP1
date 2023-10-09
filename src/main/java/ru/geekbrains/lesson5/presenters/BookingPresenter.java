package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson2.sample1.Cat;
import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.models.TableModel;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;

    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setObserver(this);
    }

    private Collection<Table> loadTables() {
        return model.loadTables();
    }

    public void updateUIShowTables() {
        view.showTables(loadTables());
    }

    private void updateUIShowReservationTableResult(int reservationNo) {
        view.ShowReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIShowReservationTableResult(reservationNo);
        }
        catch (RuntimeException e){
            updateUIShowReservationTableResult(-1);
        }
    }

    @Override
    public void onСhangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name) {
        int reservationNo = model.changeReservationTable(oldReservation, orderDate, tableNo, name);
        printChangeReservationTableResult(reservationNo);
    }

    @Override
    public void printChangeReservationTableResult(int reservationNo) {
        System.out.printf("Бронь столика успешно изменена. Номер вашей брони: #%d\n", reservationNo);
    }
}
