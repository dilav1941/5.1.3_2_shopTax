package com.company;

public class Main {

    public static void main ( String[] args ) throws InterruptedException {

        Shop shop = new Shop ();

        Thread tax1 = new Thread (null, shop::taxGenerator, "№_1 ");
        Thread tax2 = new Thread (null, shop::taxGenerator, "№_2 ");
        Thread tax3 = new Thread (null, shop::taxGenerator, "№_3 ");

        tax1.start ();
        tax2.start ();
        tax3.start ();

        tax1.join ();
        tax2.join ();
        tax3.join ();

        System.out.println ("\nСумма = " + shop.sum);
    }
}
