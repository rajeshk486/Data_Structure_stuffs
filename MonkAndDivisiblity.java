/*Monk and Divisibility
Max. Marks 100
Today Monk is faced with an interesting task. He has an array of N numbers. For each number in the array, it is called special if it is divisible by at least one other number in the array. Please, find the number of special numbers in this array for monk.

Input:

First number in the input is N - the number of integers in the array. Next N numbers denote the elements of the array.

Output:

Output one integer - the number of special numbers.

Constraints:

1<=N<=10^5

Each array element will be between 1 and 10^6

Sample Input(Plaintext Link)
 3
1 2 3
Sample Output(Plaintext Link)
 2
Explanation
Both 2 and 3 are special - because they are divisible by 1. However, 1 has no other array element that divides it.

Time Limit: 1 sec(s) for each input file.
Memory Limit: 256 MB
Source Limit: 1024 KB
Marking Scheme: Marks are awarded if any testcase passes.
Allowed languages: C, CPP, CLOJURE, JAVA, PERL, PYTHON, RUBY, SCALA
SUBMISSIONS
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
boolean flag = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		String integers = br.readLine();//"54 65 74 45 46 34 2 3 34 2 2345 34 ";
		List<Integer> list = new ArrayList<Integer>();
		for (String s : integers.split("\\s"))  
		{  
		   list.add(Integer.parseInt(s));  
		}
		list.toArray();
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			for(int j=0; j<list.size();j++)
			{
				if(j!=i && !flag)
				{
					if(list.get(i)%list.get(j)== 0)
					{count++; flag = true;}
				}
			}
			flag = false;
		}
		System.out.println(count);
		}
}
