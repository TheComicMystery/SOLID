public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void decreasePrice(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        price -= amount;
    }

    public void increasePrice(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        price += amount;
    }

    public double getPrice() {
        return price;
    }
}