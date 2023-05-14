package org.fasttrackIT.recursivity;


public class SumOfNIntEvenNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfEvenNumbers(5));
    }

    public static int sumOfEvenNumbers(int n) {
            if (n == 1) {
                return 2;
            } else {
                return 2 * n + sumOfEvenNumbers(n - 1);
            }
        }
}


