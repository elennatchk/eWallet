package com.company;

import java.util.Arrays;

public class Purse {

    int capacity;
    Coin[] coins;


    public Purse(int capacity) {
        this.coins = new Coin[capacity];
        this.capacity = capacity;

    }

    public int count() {
        int sum = 0;
        for (int i = 0; i < coins.length; i++) {
            System.out.println(this.coins.length - 1);
            break;
        }
        return 0;
    }

    public int getBalance(String currency) {
        int i = 0;
        for (int x = 0; x < coins.length; x++) {
            if (coins[x].getCurrency() == currency) {
                i += this.coins[x].getValue();
                return i++;

            } else {
                System.out.println("WTF");
            }
        }
        return 0;
    }

    @Override
    public String toString() {

        for (int x = 0; x < coins.length; x++) {
            System.out.println(this.coins[x].toString());
        }
        return null;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {

        if (this.coins.length==capacity){
            System.out.println("full");
        }if (this.coins.length < capacity){
            System.out.println("not full");
        }

        return false;
    }

    public boolean insert(Coin coin) {
        if (coin.getValue() > 0) {
            this.coins = Arrays.copyOf(coins, coins.length + 1);
            this.coins[this.coins.length - 1] = coin;
            System.out.println("true");
            return true;
        } else if (this.coins.length == capacity || coin.getValue() <= 0) {
            System.out.println("Can't insert coin, Value Must be more than 0.");
            System.out.println("false");
            return false;
        }
        return false;
    }


    public Coin[] withdraw(double amount, String currency) {

        return new Coin[0];
    }
}

