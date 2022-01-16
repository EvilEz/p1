package com.company;

import javax.naming.InsufficientResourcesException;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class Card {


    String name;
    BigDecimal balance;


    public Card(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public Card(String name) {
        this.balance = BigDecimal.ZERO;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal addBalance(BigDecimal money) {
        balance = balance.add(money);
        return balance;
    }

    public abstract BigDecimal subtractBalance(BigDecimal money) throws InsufficientResourcesException, InsufficientFundsException;


    public void convertBalance(BigDecimal converter) {
        balance = balance.multiply(converter);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(name, card.name) && Objects.equals(balance, card.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance);
    }
}
