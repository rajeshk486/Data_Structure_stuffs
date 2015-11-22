public class BigNum {

    // F i e l d s

    private String num;  // Representation of our number

    // C o n s t r u c t o r s

    public BigNum(String num) {
        for (int i=0; i<num.length(); i++) {
            if ( ! Character.isDigit(num.charAt(i)) ) {
                throw new IllegalArgumentException();
            }
        }
        if ( num.length() == 0 ) {
            throw new IllegalArgumentException();
        }
        this.num = num;
    }

    /** Constructs a <tt>BigNum</tt> from a non-negative integer.
     *  @param num The non-negative integer to be interpreted.
     *  @throws IllegalArgumentException if num is negative
     */
    public BigNum(int num) {
        // If num<0, redirected constructor will throw exception due to "-"
        this(""+num);
        for(int i=0; i<num; i++)
        {
           if(num<0)
           {
              throw new IllegalArgumentException();
           }
        }
    }

    /** Constructs a <tt>BigNum</tt> with value zero.
     */
    public BigNum() {
        num="0";
    }

    // P u b l i c   M e t h o d s

    /** Adds two <tt>BigNum</tt> objects' values together and returns a new
      * <tt>BigNum</tt> object with the resulting value.
      *
      * @param other this and other objects get added together
      * @return a new BigNum with the resulting value
      */
    public BigNum add(BigNum other) {
        // Make shorter refer to the shorter num, longer to the longer num
        String shorter = other.num;
        String longer = this.num;
        if (this.num.length() < other.num.length()) {
            shorter = this.num;
            longer = other.num;
        }
        // Prepend zeros to make shorter as long as longer
        while (shorter.length() < longer.length()) {
            shorter = "0" + shorter;
        }
        // Add columns like we did in grade school
        int carry = 0;
        String result = "";
        for (int i=shorter.length()-1; i>=0; i--) {
            int temp = Character.getNumericValue(shorter.charAt(i)) +
                       Character.getNumericValue(longer.charAt(i)) + carry;
            result = (temp%10)+result;
            carry = temp/10;
        }
        // Handle carry-out, if there is one. Return result
        if (carry == 1) {
            result = "1"+result;
        }
        return new BigNum(result);
    }

    public BigNum mult(BigNum other)
    {
      String shorter = other.num;
      String longer = this.num;
      if(this.num.length()<other.num.length())
      {
         shorter = this.num;
         longer = other.num;
      }
      if(shorter=="0"||longer=="0")
      {
         return new BigNum(0);
      }

      int carry = 0;
      int temp =0;
      String result = "";
      for(int i=shorter.length()-1; i>=0; i--)
      {
         for(int j=longer.length()-1; j>=0; j--)
         {
                temp = Character.getNumericValue(shorter.charAt(i)) * 
                       Character.getNumericValue(longer.charAt(j));
         }
      }

      result = temp+result;
      return new BigNum(result);
    }


    /** Returns a string representation of the number. No leading zeros
      * will exist unless the overall value is zero.
      *
      * @return String representation of the BigNum
      */
    public String toString() {
        return num;
    }

    /** Used only for unit testing. When run, should output only trues. */
    public static void main(String[] args) {
        // Test constructors
        BigNum test = new BigNum("123");
        System.out.println(test.toString().equals("123"));
        test = new BigNum(123);
        test = new BigNum();
        System.out.println(test.toString().equals("0"));
        // Test addition
        BigNum a = new BigNum();
        BigNum b = new BigNum();
        BigNum c = a.add(b);
        BigNum d = new BigNum();
        BigNum e = new BigNum();
        System.out.println(c.toString().equals("0"));
        a = new BigNum("999");
        b = new BigNum("101");
        c = a.add(b);
        System.out.println(c.toString().equals("1100"));
        a = new BigNum("237468273643278");
        b = new BigNum("87326487236437826");
        c = a.add(b);
        d= new BigNum("1");
        e = a.mult(b);
        System.out.println(e);
        System.out.println(c.toString().equals("87563955510081104"));
        //String s = "1234";
        //int x =Integer.valueOf(s);
        //System.out.println(x);
    }

}