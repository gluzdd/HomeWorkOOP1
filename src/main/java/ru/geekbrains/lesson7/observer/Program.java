package ru.geekbrains.lesson7.observer;

public class Program {


    public static void main(String[] args) {
        Vacancy senor = Vacancy.Сеньор;
        Vacancy helper = Vacancy.Помощник;
        Vacancy proffi = Vacancy.Специалист;

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 140000, senor);
        Company yandex = new Company("Yandex", jobAgency, 85000, helper);
        Company geekBrains = new Company("GeekBrains", jobAgency, 108000, proffi);

        Student student1 = new Student("Студент #1", "Помощник");
        Master master1 = new Master("Мастер #1", "Сеньор");
        Master master2 = new Master("Мастер #2", "Специалист");
        Junior junior1 = new Junior("Джуниор #1", "Помощник");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(junior1);

        for (int i = 0; i < 1; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }
}
