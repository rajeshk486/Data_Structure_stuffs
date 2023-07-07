package com.parkinglot.design.ProblemSolving;

import io.r2dbc.spi.Parameter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int arr[] ={1,2,-9,5,2,5,4,8,6};
//        List<Integer> strm = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        System.out.println(strm.stream().sorted().skip(1).findFirst().get());
//
//        List<String> names=Arrays.asList(new String[]{"rathna","rajesh","keerthana"});
//
//        Map<Character,Integer> countMap= new HashMap<>();
//        for(String s: names)
//        {
//            s.chars().forEach(r->{
//                if(countMap.containsKey((char)r))
//                    countMap.put((char)r,countMap.get((char)r)+1);
//                else
//                    countMap.put((char)r,1);
//            //    System.out.println((char)r);
//            });
//        }
//        for (Map.Entry<Character,Integer> entry : countMap.entrySet())
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//
//        Map<String,String> mapexa= new HashMap<>();
//        names.stream().collect(Collectors.toMap(Function.identity(),Function.identity()));


        for(int i=0;i<arr.length;i++) {
            if (arr[i] < 0)
                arr[i] = 0;
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>0 && arr[i]<=arr.length)
            {
                arr[arr[i]-1]= -arr[arr[i]-1];
            }

        }
        boolean endreach=false;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] >= 0) {
                System.out.println("missing element " + (i + 1));
                endreach=true;
                break;
            }
        }
if (!endreach)
    System.out.println("missing element " + (arr.length + 1));


        for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i] + " ");
        }

    }
}
