package com.company;

public class Fibo {
    public static int fib1(int n) {
        if (n <= 1) return n;
        return fib1(n-1) + fib1(n-2);
    }

    public static int fib2(int n, int f0, int f1){
        if (n == 0) return f0;
        if (n == 1) return f1;
        for (int i = 2; i <= n; i++){
            int fi = f0 + f1;
            f0 = f1;
            f1 = fi;
        }
        return f1;
    }

    public static int fib3(int n, int f0, int f1){
        if (n <= 0) return f0;
        if (n == 1) return f1;
        return fib3(n-1,f1,f0+f1);
    }
}
