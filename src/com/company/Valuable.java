package com.company;

public interface Valuable extends Comparable<Valuable> {


    public String getCurrency() ;


    public double getValue() ;
}
//if (amount > Balance()) {
//        System.out.println("null");
//        return null;
//        }
//        if (amount <= 0) {
//        System.out.println("null");
//        return null;
//        }
//        Coin[] newarr= new Coin[]{};
//        if (Balance() >= amount){
//        for (int i=coins.length -1 ; i>=0;i--){
//        if (amount - coins[i].getValue()>=0){
//        amount-=coins[i].getValue();
//        coins = Arrays.copyOf(coins, coins.length - 1);
////                    System.out.println("what");
//        System.out.println(coins.length);
//
//
//
//        }
//        }
//        }for (int i=0, j=0; i < newarr.length; i++){
//        newarr[j++]=coins[i];
//        System.out.println("is");
////            System.out.println(coins.length);
//
//
//        }
//        Coin[] coin= new Coin[newarr.length];
//
//        return coin;