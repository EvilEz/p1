package com.company;

import java.math.BigDecimal;


public class CreditCard extends Card {

    public CreditCard(String name, BigDecimal balance) {
        super(name, balance);
    }

    public CreditCard(String name) {
        super(name);
    }

    @Override
    public BigDecimal subtractBalance(BigDecimal money)  {
        return balance.subtract(money);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

