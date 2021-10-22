package com.company;

public class Main {

    public static void main(String[] args) {

//        Coin one = new Coin(6, "USD");
//        Coin two = new Coin(1, "USD");
        Purse purse = new Purse(3);
//      System.out.println(purse.getCapacity());//done
         Coin[] coins = { };
//       System.out.println(purse.isFull(coins));
//       purse.getBalance("USD");
//        purse.getCapacity(); //done
//          Arrays.sort(coins);
//          System.out.println(Arrays.toString(coins));
          purse.insert(new Coin(5, "USD")); //done
          purse.insert(new Coin(7, "USD"));
          purse.insert(new Coin(3, "USD"));
          purse.insert(new Coin(8, "USD"));
          purse.count();
          purse.isFull();
//          System.out.println( purse.getBalance("USD"));
//          coins.toString();
//        two = new Coin(7,"del");
//        System.out.println(one.toString());
//        two.equals(one); //done

    }
}
