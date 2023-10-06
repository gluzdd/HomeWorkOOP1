package ru.geekbrains.lesson4.bank;

public class Program {
    public static void main(String[] args) {

        Entity entity = new Entity("ООО Рога и копыта", "9379992");
        Person person= new Person("AAA BBB CCC", "99999999");

        DebetAccount<Entity> debetAccount1 = new DebetAccount<>(entity, 1500000000);
        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person, 3000);

        Transaction<Account> transaction1 = new Transaction<>(debetAccount1, creditAccount1, 30000);
        transaction1.execute();

        transaction1.execute();
    }
}
