package com.parkinglot.design.ProblemSolving;
import java.util.*;
public class minimumWindowSubString {
    public static void main(String[] args) {
        minimumSubString("ADOBECODEBANC","ABC");
    }
    static String minimumSubString(String s,String t) {
        Map<Character, Integer> map = new HashMap<>();
        int counter = 0;
        int right = 0, left = 0;
        //initialise the helpers
        for (char c : t.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, ++count);
            counter++;
        }
        System.out.println(map);
        right = s.length();
        int rIndex = 0, lIndex = 0;
        while(rIndex<=s.length()) {
            if (counter > 0) {
                if (rIndex == s.length())
                    break;
                if (map.containsKey(s.charAt(rIndex))) {
                    --counter;
                    int val=s.charAt(rIndex);
                    if(val==1)
                        map.put(s.charAt(rIndex),map.get(--val));
                }
                rIndex++;
            }
            else {
                int currWindow= rIndex-lIndex;
                System.out.println(s.substring(rIndex, s.length()));
            }
        }
        return  "";
    }
}
