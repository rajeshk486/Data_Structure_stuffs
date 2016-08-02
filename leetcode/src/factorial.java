/**
 * Created by Rajesh on 28-07-2016.
 */
public class factorial {
    public int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        else {
            System.out.println(n);
            return n * fact(n - 1);
        }
    }
    static int n1=0,n2=1,n3;

    public int fibanoci(int count)
    {
    if(count>0)
    {
        n3 = n1+n2;
        n1=n2;n2=n3;
        System.out.println(n3);
       return fibanoci(count-1);
    }
else
    return n3;
    }

    public String changePi(String str) {
        if(str.length()<2)
return str;
        if(str.substring(0,2).equals("pi"))
            return "3.14"+changePi(str.substring(2));
        else return str.charAt(0)+changePi(str.substring(1));
    }

    public String noX(String str) {
if(str.length()<1)
    return str;
else
    if(str.charAt(0)== 'x')
        return noX(str.substring(1));
        else
       return str.charAt(0)+noX(str.substring(1));

    }
    public boolean array6(int[] nums, int index) {
        if (nums.length == index)
            return false;
        else if (nums[index] == 6)
            return true;
        else
            return array6(nums, index + 1);
    }

    public int array6NO(int[] nums, int index) {
        if (nums.length == index)
            return 0;
        else if (nums[index] == 6)
            return 1+array6NO(nums, index + 1);
        else
            return array6NO(nums, index + 1);
    }
    public String allStar(String str) {
        if(str.length() < 2) return str;
        else return (str.charAt(0)+"*"+allStar(str.substring(1)));}

    public String pairStar(String str) {

        if(str.length()==1) return str;
        else
            if(str.charAt(0)==str.charAt(1)) return str.charAt(0)+"*"+pairStar(str.substring(1));
        else return  str.charAt(0)+pairStar(str.substring(1));
    }
    public String endX(String str) {
        if(str.length() == 0)
            return str;
        if(str.charAt(0) == 'x')
            return endX(str.substring(1)) + 'x';
        return str.charAt(0) + endX(str.substring(1));
    }
    public String parenBit(String str) {

        if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')')
            return str.substring(0,str.length());
        if(str.charAt(0)=='(' &&  str.charAt(str.length()-1)!=')')
            return parenBit(str.substring(0,str.length()-1));
        if(str.charAt(0)!='(' &&  str.charAt(str.length()-1)==')')
            return parenBit(str.substring(1));
        else//(str.charAt(1)!='(' &&  str.charAt(str.length()-2)!=')')
            return parenBit(str.substring(1,str.length()-1));
    }
    public int strDist(String str, String sub) {
       if(str.length() < sub.length())
           return 0;
        else
       {
           if(str.substring(0,sub.length()).equals(sub))
           {
              if(str.substring(str.length()-sub.length(),str.length()).equals(sub))
                  return str.length();
               else
                  return strDist(str.substring(0,str.length()-1),sub);
           }
       }
        return strDist(str.substring(1),sub);
    }
}

/*
all rec shld have 2 condtion
1. to stop and return to main program
2. to recurse on the flow data.
*/