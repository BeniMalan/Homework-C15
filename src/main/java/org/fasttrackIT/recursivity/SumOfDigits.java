package org.fasttrackIT.recursivity;

public class SumOfDigits {

    public int sum(int n){
        if(n==0){return 0;}
        else return n%10+sum(n/10);
    }
    public static void main (String[] args){
        SumOfDigits sumOfDigits=new SumOfDigits();
        int rez=sumOfDigits.sum(1111111111);
        System.out.println(rez);
    }
}
