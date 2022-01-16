package com.company;

import javax.naming.InsufficientResourcesException;
import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String name) {
        super(name);
    }

    @Override
    public BigDecimal subtractBalance(BigDecimal money) throws InsufficientFundsException {
        if (balance.compareTo(money)>=0) {
            return balance.subtract(money);
        }
        else {
            throw new InsufficientFundsException("На вашей карте нет стредств");
        }
    }

    public DebitCard(String name, BigDecimal balance) {
        super(name, balance);
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}


