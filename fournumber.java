/*A positive integer may be expressed as a sum of different numbers, in one way or another. Consider N=a+b+c+d where a,b,c,d are positive integers greater than 0 and a<=b<=c<=d.

You have to count the number of ways to express N as sum of 4 such numbers.

INPUT FORMAT:
The first line will contain t - number of test cases
Each of the next t lines contain a single integer, N.

OUTPUT FORMAT:
For each test case, print the number of possible combinations of a, b, c and d such that a+b+c+d=N, a<=b<=c<=d and a,b,c,d>0.

Constraints:
1 <= t <= 10
1 <= N <= 5000

Sample Input(Plaintext Link)
 2
5
6
Sample Output(Plaintext Link)
 1
2
Explanation
For N = 5, there is only 1 way: 1+1+1+2

For N = 6, there are 2 ways: 1+1+1+3 1+1+2+2

2000000000
109699999
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class fournumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int testcases = 0;
int input=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String line = br.readLine();
testcases = Integer.parseInt(line);
input = Integer.parseInt(line);

List<String>combo =new ArrayList<String>();
Set<Integer>combo1 =new HashSet<Integer>();
while(testcases!=0)
{
for(int i=1;i<= input;i++)
	for(int j=1; (j<= input) ;j++)
		for(int k=1; k<= input ;k++)
			for(int l=1; l<= input ;l++)
				if((i+j+k+l)==input)
				{
					String temp=i+""+j+""+k+""+l;
					combo.add(temp);
					//System.out.println(i+""+j+""+k+""+l);
				}
int count=1;
boolean flag= false;

for(int i=0; i<combo.size();i++){
	for(int j=0;j<combo.size()&& (i!=j);j++)	{
		System.out.println(combo.get(j));	
		if((iAnagram(combo.get(i),combo.get(j))))
			combo1.add(i);
		}
	
}
System.out.print(combo1.size()-combo.size());
testcases--;
}
}
	
	public static boolean iAnagram(String word, String anagram)
	{ char[] charFromWord = word.toCharArray(); 
	char[] charFromAnagram = anagram.toCharArray();
	Arrays.sort(charFromWord); Arrays.sort(charFromAnagram);
	return Arrays.equals(charFromWord, charFromAnagram); }

}

