package org.fasttrackIT.recursivity;

public class fibonacci {
    public  int fibo(int n){
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String args[]){
        fibonacci fib=new fibonacci();
        int rez=fib.fibo(6);
        System.out.println(rez);
    }
}
