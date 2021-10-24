package com.company;

import java.util.Arrays;

public class Purse {

    int capacity;
    Coin[] coins;

    public Purse(int capacity) {
        this.capacity = capacity;
        this.coins = new Coin[0];


    }

    public int count() {
        System.out.println(this.coins.length + " Coin in Purse");
        return 0;
    }

    public int getBalance(String currency) {
        int i = 0;

        for (int x = 0; x < coins.length; x++) {

            if (coins[x].getCurrency().equals(currency)) {
                i += this.coins[x].getValue();

            }
        }
        System.out.println(i);
        return i;
    }

    public double Balance() {
        double returnValue = 0.0;
        for (Coin c : coins) {
            returnValue += c.getValue();
        }
        return returnValue;
    }


    @Override
    public String toString() {
        for (int x = 0; x < coins.length; x++) {
            System.out.println(this.coins[x].toString());
        }
        return null;
    }


    public int getCapacity() {
        System.out.println(capacity);
        return capacity;
    }

    public boolean isFull() {
        System.out.println(coins.length == capacity);
        return coins.length == capacity;
    }

    public boolean insert(Coin coin) {
        if (coin.getValue() > 0 && coins.length < capacity) {
            this.coins = Arrays.copyOf(coins, coins.length + 1);
            this.coins[this.coins.length - 1] = coin;
            Arrays.sort(coins);
            System.out.println("true");
            return true;
        } else if (this.coins.length == capacity || coin.getValue() <= 0) {
            System.out.println("False,  " + "Can't insert coin");
            return false;
        }
        return false;
    }

    public Coin[] withdraw(double amount, String currency) {
        Coin [] array = new Coin[ coins.length  ];
        for (int i = 0, k = 0; i < coins.length; i++) {
            if (Balance()-amount==0){

            }
            if (amount == coins[i].getValue() && currency.equals(coins[i].getCurrency())) {
                array[k++] = coins[i];
                this.coins = Arrays.copyOf(coins, coins.length - 1);
                System.out.println(coins[i]);
            }
        } return array;
    }


}

