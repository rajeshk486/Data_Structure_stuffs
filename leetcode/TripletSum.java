package com.parkinglot.design.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public static void main(String[] args) {
        int a[]=//{-2, -3, 4, -1, -2, 1, 5, -3};
                {-3,3,4,-3,1,2};
        int target = 0;
        Arrays.sort(a);
        List<Integer> values = new ArrayList<>();
        for(int i=0;i<a.length-1;i++)
        {
            int tempTarget= -a[i]+target;
            for(int j=0,k=a.length-1;k!=j;)
            {
                if(a[j]+a[k]==tempTarget)
                {
                    if(!values.contains(a[i]))
                        values.add(a[i]);
                    if(!values.contains(a[j]))
                        values.add(a[j]);
                    if(!values.contains(a[k]))
                        values.add(a[k]);
                    System.out.println(a[i]+" : "+a[j]+" : "+a[k]); break;}
               else if(a[j]+a[k]>tempTarget)
                    k--;
                else
                    j++;
            }
        }
        System.out.println(values);
    }

}

