/**
 * Created by Rajesh on 17-07-2016.
 */
public class ReverseString {
    public String reverseString(String s) {

        int len = s.length();
        String s1 = new String(s);
        int j=0;
        for (int i=0; i<len/2;++i) {
            //System.out.println(s1.charAt(i)+" "+s1.charAt(len-i-1));
       s1= swapChars(s1,i,len-i-1);
           // System.out.println(s1);
        }
        return s1;
    }
    private static String swapChars(String str, int lIdx, int rIdx) {
        StringBuilder sb = new StringBuilder(str);
        char l = sb.charAt(lIdx), r = sb.charAt(rIdx);
        sb.setCharAt(lIdx, r);
        sb.setCharAt(rIdx, l);
        return sb.toString();
    }
}
