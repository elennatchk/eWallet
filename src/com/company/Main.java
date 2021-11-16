package com.company;

public class Main {

    public static void main(String[] args) {
        Coin one = new Coin(5, "USD");
        Coin two = new Coin(2, "USD");
//        System.out.println(one.compareTo(two));
//        System.out.println(one.toString());
//        one.equals(two);
        Purse purse = new Purse(3);
//        Coin[] coins = { one,two};
//        purse.getCapacity();

        purse.insert(new Coin(7, "USD"));
        purse.insert(new Coin(5, "USD"));
        purse.insert(new Coin(3, "GEL"));
       purse.insert(new Coin(8, "USD"));
       purse.getBalance("USD");
       purse.count();
       purse.isFull();
       purse.toString();
        purse.withdraw(5,"USD");
        purse.isFull();
        purse.toString();


    }
}
