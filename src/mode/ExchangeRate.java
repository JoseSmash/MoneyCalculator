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
public class ExchangeRate {
    private final Currency from;
    private final Currency to;
    private final double rate;

    public ExchangeRate(Currency from, Currency to, double rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }
}
