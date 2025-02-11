package com.prospecta;

public class FibNum {

    public static void main(String[] args) {

        FibNum fibNum = new FibNum();
        int fib = fibNum.fib(3);
        System.out.println("The output is " + fib);

    }

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
