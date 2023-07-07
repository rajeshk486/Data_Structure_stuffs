package com.parkinglot.design.ProblemSolving;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class WordSearch {
    private static int size= 26;
    static class node{
        node[] children = new node[size];
        boolean is_end;
        node(){
            is_end = false;
            for (int i = 0; i < size; i++)
                children[i] = null;
        }
    };

    static node root =new node();
    static void insert1(String key)
    {
        int level;
        int length = key.length();
        int index;

        node pCrawl = root;

        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new node();

            pCrawl = pCrawl.children[index];
        }

        // mark last node as leaf
        pCrawl.is_end = true;
    }
    static void insert(String key)
    {
        int index; node crawl= root;
        for(int i=0;i<key.length();i++) {
            index = key.charAt(i) - 'a';
            if (Optional.ofNullable(crawl.children[index]).isEmpty()) ;
                crawl.children[index] = new node();
            crawl = crawl.children[index];
        }
        crawl.is_end=true;
    }

    public static void main(String[] args) {
        //maxSeries(Arrays.asList(new Integer[] {1,2,4,3,5,6,8,9,12,2,4,10,11}));
        insert1("rajesh");
//        insert("rathna");
//        insert("bubble");

        System.out.println( search("rajesh"));
    }

    private static Boolean search(String input) {
        node crawl= root;
        boolean wordFound=false;
        for(int i=0;i<input.length();i++)
        {
            System.out.println(input.charAt(i)-'a');
            if(crawl.children[input.charAt(i)-'a'] == null)
            {
                System.out.println(crawl.children[input.charAt(i)-'a']);
                return false;
            }
            crawl= crawl.children[input.charAt(i)-'a'];
        }
        return crawl.is_end;
    }
}
