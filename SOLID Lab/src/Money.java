public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public void display() {
        System.out.println("Total amount: $" + dollars + "." + cents);
    }

    public void add(Money money) {
        this.dollars += money.dollars;
        this.cents += money.cents;
        if (this.cents >= 100) {
            this.dollars += this.cents / 100;
            this.cents %= 100;
        }
    }
}