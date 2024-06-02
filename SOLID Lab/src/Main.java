//У коді я реалізував такі SOLID принципи:

//принцип єдиного обов'язку (SRP) - кожен клас відповідає лише за одну область функціональності,
//принцип відкритості/закритості (OCP) - класи відкриті для розширення,
//принцп інверсії залежностей (DIP) - у класі Reporting залежності від інших класів  інвертовані через використання їх об'єктів через абстракції класів,
//принцип розділення інтерфейсів (ISP) - усі класи виконують конкретні завдання і не перевантажені методами.
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Reporting reporting = new Reporting();

        //Реєструю надходження товарів
        reporting.registerIncoming("Laptop", "pieces", 900.0, 10, new Date());
        reporting.registerIncoming("Smartphone", "pieces", 600.0, 20, new Date());
        reporting.registerIncoming("Tablet", "pieces", 400.0, 15, new Date());
        reporting.registerIncoming("Headphones", "pieces", 50.0, 50, new Date());
        reporting.registerIncoming("Keyboard", "pieces", 30.0, 30, new Date());

        //Реєструю відвантаження
        reporting.registerOutgoing("Laptop", 5, new Date());
        reporting.registerOutgoing("Smartphone", 10, new Date());

        //Звіт по інвентаризації
        reporting.generateInventoryReport("Laptop");
        reporting.generateInventoryReport("Smartphone");
        reporting.generateInventoryReport("Tablet");
        reporting.generateInventoryReport("Headphones");
        reporting.generateInventoryReport("Keyboard");

        //Скільки прибуло та убуло
        reporting.generateProfitInvoice("Laptop", new Date());
        reporting.generateExpenseInvoice("Smartphone", new Date());
    }
}

