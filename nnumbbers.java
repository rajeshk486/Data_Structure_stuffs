
public class nnumbbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one="999999999999999556546669";
		String two="999999999999999";
		String result="";
		int carry=0;
		int adder=0;
		int value =0;
		int length1 = (one.length()>two.length())?one.length():two.length();
		int length2 = (one.length()>two.length())?two.length():one.length();
		while(--length1 >= 0)
		{
			--length2;
			//System.out.println(one.charAt(length1)+" "+two.charAt(length2)+"");
			if(length2>=0)
			value = add(one.charAt(length1)+"",two.charAt(length2)+"");
			else
				value= Integer.parseInt(one.charAt(length1)+"");
			
			//System.out.println(value);
			if(carry>0)
			{
				value =value+carry;
				//System.out.print(" "+carry);
				carry= 0;
			} 
			if(value > 9)
				{carry = Integer.parseInt(String.valueOf(value).charAt(0)+"");
				adder = Integer.parseInt(String.valueOf(value).charAt(1)+"");}
			else
				adder = Integer.parseInt(String.valueOf(value).charAt(0)+"");
			result=String.valueOf(adder)+result;
			
		}
		if(carry>0)
			result= String.valueOf(carry)+result;
		System.out.print(one+"\n+\n"+two+"\n=\n"+result);

	}
	
	public static int add(String i, String j)
	{
		int i_i= Integer.parseInt(i);
		int j_j= Integer.parseInt(j);
		return(i_i+j_j);
	}

}
