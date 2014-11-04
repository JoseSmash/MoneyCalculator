package mode;
public class Exchange {
    private final double money;
    private final Currency currency;

    public double getMoney() {
        return money;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Exchange(double money, Currency currency) {
        this.money = money;
        this.currency = currency;
    }
}
