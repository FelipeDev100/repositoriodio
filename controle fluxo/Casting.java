package com.company;

public class Casting{

    public static void main (String [] args ){

        byte b1 ;
        short s1 = 10000;
        b1 = (byte) s1;

        long l1;
        int i1 = 10;
        l1=i1;

        int i2;
        long l2 = 10000000000000000l;
        i2 = (int) l2;

        int i3;
        long l3 = 10000l;
        i3 = (int) l3;
        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float  f2;
        float  f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 100000.00000000000000000000000000000000000000000000000000000000000000d;
        f3 = (float) d3;

        int i;
        float f = 11.5697f;
        i = (int) f;


        System.out.println("b1:" + b1) ;
        System.out.println("l1:" + l1);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("d1:" + d1);
        System.out.println("f2:" + f2);
        System.out.println("f3:" + f3);
        System.out.println("i:" + i);
    }
}
