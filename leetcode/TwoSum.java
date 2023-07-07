package com.parkinglot.design.ProblemSolving;

public class TwoSum {
    public static void main(String[] args) {
        int a[]={1,3,4,5,7,10,11};
        int target = 8;
        for(int i=0,j=a.length-1;i!=j;)
        {
            if(a[i]+a[j]==target)
                System.out.println("Match found: "+i+" "+j);
            if(a[i]+a[j]>target)
                j--;
            else
                i++;

        }

    }
}
