package Dynamic;

import java.util.HashSet;
import java.util.Set;

public class anagram {
	//static Set<String> combination  = new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		palindrome("12345",0,0);
		// System.out.println(combination);
		for(String s: combination)
		System.out.println(s);
		System.out.println(combination.size());

	}
	static Set<String> combination = new HashSet<String>();
	public static void palindrome(String str,int i,int j)
	{
		
		String temp1="";
		if(i==str.length())
			return;
		if(j<str.length())
		{temp1=swap(str,i,j);
			//System.out.println(temp1);
			combination.add(temp1);
		palindrome(temp1,i,++j);}
		
		palindrome(str,++i,0);
			 
	}

	private static String swap(String str, int i, int j) {
		if(i==j || j>str.length())
			return str;
		 if (j == str.length() - 1) 
	            return str.substring(0, i) + str.charAt(j) 
	                + str.substring(i + 1, j) + str.charAt(i); 
	  if(j>i)
	        return str.substring(0, i) + str.charAt(j) 
	            + str.substring(i + 1, j) + str.charAt(i) 
	            + str.substring(j + 1, str.length());
	  else
		  return str.substring(0, j) + str.charAt(i) 
          + str.substring(j + 1, i) + str.charAt(j) 
          + str.substring(i + 1, str.length());
		  
		//String s=
		
	}

}
