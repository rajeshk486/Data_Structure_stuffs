package com.parkinglot.design.ProblemSolving;

public class longestPalindrome {
    static int length=0;
    static int start=0;
    public static void main(String[] args) {
        String input = "123456722222277";
        int len = 1;
        String longPalindromString = "";
        int r = 0,l=0;
        for(int i=1;i<=input.length()-1 ;i++)
        {
            expandRange(input,i,i);
            expandRange(input,i,i+1);
        }
        System.out.println("Longest palindrome value: "+length);
        System.out.println(input.substring(start,start+length));
    }
    private static void expandRange(String str, int begin, int end) {
        int templen=0;
        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
            templen++;
        }
        if (length < end - begin - 1) {
start= begin+1;
            length = end - begin - 1;
        }
    }




}
