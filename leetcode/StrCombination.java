package com.parkinglot.design.ProblemSolving;

public class StrCombination {
    static int counter=0;
    public static void main(String[] args) {
        String str="123";
        for(int i=0;i<str.length();i++) {
            char[] arr = str.toCharArray();
            char temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            System.out.println("main: "+ new String(arr));
            perumtate(new String(arr), 1);
        }

    }
    static void perumtate(String str, int index)
    {
        if(index ==str.length())
            return ;

            char[] arr = str.toCharArray();
            char temp = arr[index];
            arr[index] = arr[0];
            arr[0] = temp;
            //System.out.println(++counter +" "+new String(arr));
            perumtate(str, ++index);
        System.out.println(new String(arr));

            return;


    }
}
