import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reporting {
    private List<Warehouse> warehouses;

    public Reporting() {
        warehouses = new ArrayList<>();
    }

    public void registerIncoming(String name, String unit, double pricePerUnit, int quantity, Date date) {
        Warehouse warehouse = findWarehouse(name);
        if (warehouse != null) {
            warehouse.registerIncoming(quantity, date);
        } else {
            warehouses.add(new Warehouse(name, unit, pricePerUnit, quantity, date));
        }
    }

    public void registerOutgoing(String name, int quantity, Date date) {
        Warehouse warehouse = findWarehouse(name);
        if (warehouse != null) {
            warehouse.registerOutgoing(quantity, date);
        } else {
            System.out.println("Error: not found.");
        }
    }

    public void generateInventoryReport(String name) {
        Warehouse warehouse = findWarehouse(name);
        if (warehouse != null) {
            warehouse.generateInventoryReport();
        } else {
            System.out.println("Error: not found.");
        }
    }

    private Warehouse findWarehouse(String name) {
        for (Warehouse warehouse : warehouses) {
            if (warehouse.getName().equals(name)) {
                return warehouse;
            }
        }
        return null;
    }

    public void generateProfitInvoice(String name, Date date) {
        Warehouse warehouse = findWarehouse(name);
        if (warehouse != null) {
            double totalPrice = warehouse.getPricePerUnit() * warehouse.getQuantity();
            System.out.println("Profit Invoice:");
            System.out.println("Date: " + date);
            System.out.println("Product: " + name);
            System.out.println("Total Price: $" + totalPrice);
        } else {
            System.out.println("Error: not found.");
        }
    }

    public void generateExpenseInvoice(String name, Date date) {
        Warehouse warehouse = findWarehouse(name);
        if (warehouse != null) {
            double totalPrice = warehouse.getPricePerUnit() * warehouse.getQuantity();
            System.out.println("Expense Invoice:");
            System.out.println("Date: " + date);
            System.out.println("Product: " + name);
            System.out.println("Total Price: $" + totalPrice);
        } else {
            System.out.println("Error: not found.");
        }
    }

}