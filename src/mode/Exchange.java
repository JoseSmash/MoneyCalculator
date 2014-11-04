/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mode;

/**
 *
 * @author usuario
 */
public class Exchange {
    private final double money;
    private final Currency currency;

    public int getMoney() {
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
