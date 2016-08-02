/**
 * Created by Rajesh on 17-07-2016.
 */
public class main {

public static void main(String args[])
{
    //System.out.print("Rockfort");
    String s1="a Rockfort";
    ReverseString r = new ReverseString();
    System.out.print("original String:"+ s1+"\nreversed String: "+r.reverseString(s1));
    System.out.println(new factorial().fact(5));
    new factorial().fibanoci(8);
    System.out.println(new factorial().changePi("xpix"));
    System.out.println(new factorial().noX("xavbx"));
    int arr[]={1,6, 4,6};
    System.out.println(new factorial().array6(arr, 0));
    System.out.println(new factorial().array6NO(arr, 0));
    System.out.println(new factorial().allStar("abc"));
    System.out.println(new factorial().pairStar("aaasssddff"));
    System.out.println(new factorial().noX("xxre"));
    System.out.println(new factorial().parenBit("(hello)hh"));
    System.out.println(new factorial().strDist("catcow", "cat"));
}
}
