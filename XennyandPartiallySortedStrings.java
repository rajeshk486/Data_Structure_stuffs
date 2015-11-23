/*Xenny and Partially Sorted Strings
Max. Marks 100
Xenny had a list of N strings of equal length. He wanted to sort them by the first M characters only. That means, while sorting the list of strings, he only wanted to consider the first M characters of each string.
Help Xenny to find out the Kth string in the list after he sorts them.

Note: Xenny wanted to perform stable sorting.
Stable sorting algorithms maintain the relative order of records with equal keys (i.e. values). That is, a sorting algorithm is stable if whenever there are two records R and S with the same key and with R appearing before S in the original list, R will appear before S in the sorted list.

Input

First line contains a single integer - T, which represents the number of testcases.
T testcases follow.
Each testcase is of the following format:
First line contains 3 space-separated integers - N, K and M.
N is the total number of strings Xenny has.
K is the index of the string in the list after sorting, which Xenny has to find.
M is the number of characters based on which sorting will be done by Xenny.
Then next N lines contain N strings ( each line will contain one string ) .

Output

For each testcase, print the Kth string in the sorted list in a new line.

Constraints

1 ≤ T ≤ 50
1 ≤ N ≤ 103
1 ≤ Max Length of each String ≤ 103
1 ≤ M ≤ Max Length
M ≤ Max Length of each String ≤ 103

Sample Input(Plaintext Link)
 1
3 1 3
abcdef
abcaaa
aabaaa
Sample Output(Plaintext Link)
 aabaaa
Explanation
After performing sorting by the first 3 characters, the order is:
1. aabaaa
2. abcdef
3. abcaaa

Time Limit: 1 sec(s) for each input file.
Memory Limit: 256 MB
Source Limit: 1024 KB
Marking Scheme: Marks are awarded if any testcase passes.
Allowed languages: C, CPP, CLOJURE, JAVA, PERL, PYTHON, RUBY, SCALA
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
 int n,k,m;
        String temp;
        
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter number of names you want to enter:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
       
        while(--testcase>=0)
        {String line= br.readLine();
        n= Integer.parseInt(line.substring(0, line.indexOf(" ")));
        k= Integer.parseInt(line.substring(line.indexOf(" ")+1, line.indexOf(" ")+2));
        m= Integer.parseInt(line.substring(line.indexOf(" ")+3, line.indexOf(" ")+4));
        //System.out.println(n+" "+k+" "+m);
        String names[] = new String[n];
        String names1[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        //System.out.println("Enter all the names:");
        for(int i = 0; i < n; i++)
        {
            names[i] = br.readLine();
           // names1[i] = names[i].substring(0, m);
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].substring(0, m).compareTo(names[j].substring(0, m))>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
//                    temp = names1[i];
//                    names1[i] = names1[j];
//                    names1[j] = temp;
                }
            }
        }
//        System.out.print("Names in Sorted Order:");
//        for (int i = 0; i < n; i++) 
//        {
//            System.out.print(names[i] + ",");
//        }
        System.out.println(names[k-1]);}}
}

    
