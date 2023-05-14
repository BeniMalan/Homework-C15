package org.fasttrackIT.recursivity;

public class palindrom {
    public static String reverseString(String str)
    {
        if(str.isEmpty())
        {
            return str;
        }
        else
        {
            return reverseString(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String[] args)
    {
        palindrom palindrom=new palindrom();
       String str= palindrom.reverseString("casa");
        System.out.println(str);

    }
}

