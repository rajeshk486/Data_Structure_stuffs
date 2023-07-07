package com.parkinglot.design.ProblemSolving;

public class MaxSumSubArray {

public static void main(String[] args) {
    int a[]=//{-2, -3, 4, -1, -2, 1, 5, -3};
            {-10,-2,1,-3,4,-1,2,1,-5,14};
    int sum = 0,subSum=0;
    for(int i:a)
    {
        subSum+=i;
        if(subSum<0)
            subSum= 0;
        if(sum<subSum)
            sum=subSum;
    }
    System.out.println(sum);
    }

}
