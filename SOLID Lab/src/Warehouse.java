import java.util.Date;

public class Warehouse {
    private String name;
    private String unit;
    private double pricePerUnit;
    private int quantity;
    private Date lastStockDate;

    public Warehouse(String name, String unit, double pricePerUnit, int quantity, Date lastStockDate) {
        this.name = name;
        this.unit = unit;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
        this.lastStockDate = lastStockDate;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getLastStockDate() {
        return lastStockDate;
    }

    public void registerIncoming(int quantity, Date date) {
        this.quantity += quantity;
        this.lastStockDate = date;
    }

    public void registerOutgoing(int quantity, Date date) {
        if (quantity > this.quantity) {
            System.out.println("Error: not enough quantity in stock.");
            return;
        }
        this.quantity -= quantity;
        this.lastStockDate = date;
    }

    public void generateInventoryReport() {
        System.out.println("Inventory Report:");
        System.out.println("Name: " + name);
        System.out.println("Unit: " + unit);
        System.out.println("Price per unit: $" + pricePerUnit);
        System.out.println("Quantity: " + quantity);
        System.out.println("Last Stock Date: " + lastStockDate);
    }
}
