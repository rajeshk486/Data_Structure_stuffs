import java.util.Arrays;


public class string_operations {


public void duplicateString(String str)
{
	int i = str.length();
	int j=0;
	boolean dup=false;
	int a[]= new int[27];
	System.out.println("Given String: "+str);
	while(i--!=0)
	{
		//converts all char to lowercase and checks its ascii valuebetween a-z
		if(((int)(str.toLowerCase().charAt(i))-96) <= 26 && ((int)(str.toLowerCase().charAt(i))-96) >0)
		{
			a[((int)(str.toLowerCase().charAt(i))-96)]++;
			
			if(a[((int)(str.toLowerCase().charAt(i))-96)] == 2)
			{dup= true;
			System.out.println(str.toLowerCase().charAt(i));
			a[((int)(str.toLowerCase().charAt(i))-96)]++; 
			}
		}
	}
	if(dup)
		System.out.println("Given string contains Duplicates");
	else
		System.out.println("Given string contains no Duplicates");
}


public boolean Anagram(String str,String str1)
{
	String temp=removespaces(str) ,temp1= removespaces(str1);
	
	return iAnagram(temp,temp1);
}

public String removespaces(String str)
{
	String temp="";
	for(int i=0;i<str.length();i++)
	{
	if(((int)(str.toLowerCase().charAt(i))-96) <= 26 && ((int)(str.toLowerCase().charAt(i))-96) >0)
		temp =temp+ str.charAt(i);
	}
	return temp;
}

public boolean iAnagram(String word, String anagram)
{ char[] charFromWord = word.toCharArray(); 
char[] charFromAnagram = anagram.toCharArray();
Arrays.sort(charFromWord); Arrays.sort(charFromAnagram);
return Arrays.equals(charFromWord, charFromAnagram); }


public void removeChar(String str, char c)
{
	int len=0;
	int strlen =0;
	String news="";
	while(len != str.length()-1)
	{
		if((strlen < str.length()) && str.charAt(strlen) == c)
		{
			strlen++;
		}
		else
		{
			news=news+str.charAt(strlen);
			len++;
			strlen++;
		}
	}
	System.out.println("The new string without the character: "+news);
}

public boolean ispalindrome(char[]input, int start,int end)
{
	
//	for(int start1=0;start1<input.length;start1++){
//		//System.out.print(input[start]);
//		for(int end1= start1+1;end1< input.length;end1++){
//			System.out.print(input[end1]);
//		}System.out.println();}
//			
	for(int i =start;i<=(start+end)/2;i++)
		if(input[i] == input[start+end-i])
			continue;
		else
			return false;
	return true;
}
//String reverse without additional space in recursive operation
public void string_rev(String str,int pos)
{
	if(pos<0)
		return;
	else
	{
		System.out.print(str.charAt(pos));
		string_rev(str,--pos);
		
	}
	}

//longest palindrome.
public String longestPalindrome(String s) {
	if (s.isEmpty()) {
		return null;
	}
 
	if (s.length() == 1) {
		return s;
	}
 
	String longest = s.substring(0, 1);
	for (int i = 0; i < s.length(); i++) {
		// get longest palindrome with center of i
		String tmp = helper(s, i, i);
		if (tmp.length() > longest.length()) {
			longest = tmp;
		}
 
		// get longest palindrome with center of i, i+1
		tmp = helper(s, i, i + 1);
		if (tmp.length() > longest.length()) {
			longest = tmp;
		}
	}
 
	return longest;
}
 
// Given a center, either one letter or two letter, 
// Find longest palindrome
public String helper(String s, int begin, int end) {
	while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
		begin--;
		end++;
	}
	//System.out.println(s.substring(begin + 1, end));
	return s.substring(begin + 1, end);
}
}
