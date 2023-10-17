//package ru.geekbrains.lesson3;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class Task2 {
//
//    static Random random = new Random();
//    static Worker generateWorker() {
//        String[] names = new String[] {"Анна", "Глеб", "Маша", "Крис", "Лёша"};
//        String[] surnames = new String[] {"Кудрявцева", "Паштетов", "Роговская", "Мороз", "Иванова"};
//
//        double salary = random.nextInt(50000, 110000);
//        int age = random.nextInt(20, 40);
//
//        Worker worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
//        return worker;
//    }
//
//    static  Freelancer generateFreelancer() {
//        String[] names = new String[] {"Артём", "Пётр", "Борис", "Лена", "Лера"};
//        String[] surnames = new String[] {"Васильев", "Афиногенов", "Иванова", "Дятлов", "Петрова"};
//
//        double salary = random.nextInt(1000, 3000);
//        int age = random.nextInt(20, 41);
//
//        Freelancer freelancer = new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
//        return freelancer;
//    }
//
//    static Employee[] generateEmployees(int count) {
//        Employee[] employees = new Employee[count];
//
//        for (int i = 0; i < employees.length; i++) {
//            int num = random.nextInt(2);
//            if (num == 0) {
//                employees[i] = generateWorker();
//            }
//            else {
//                employees[i] = generateFreelancer();
//            }
//        }
//        return employees;
//    }
//    public static void main(String[] args) {
//
//        Employee[] employees = generateEmployees(10);
//
//        /*Arrays.sort(employees, new SalaryComparator(SortType.Ascending));
//
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }
//
//        System.out.println();
//
//        Arrays.sort(employees, new SalaryComparator(SortType.Descending));
//
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }
//        */
//        Arrays.sort(employees, new AgeComparator(SortType.Ascending));
//
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }
//
//        System.out.println();
//
//        Arrays.sort(employees, new AgeComparator(SortType.Descending));
//
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }
//    }
//}
