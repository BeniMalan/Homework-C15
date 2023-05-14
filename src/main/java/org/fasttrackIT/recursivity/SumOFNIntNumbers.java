package org.fasttrackIT.recursivity;

public class SumOFNIntNumbers {
   public static void main(String[] args) {
       System.out.println(sumOfNnumbers(2));
    }

    public static int sumOfNnumbers(int n) {
      if(n==1){
    return 1;
}
        return n + sumOfNnumbers(n - 1);
    }
}
