import java.math.BigInteger;


public class bignumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new bignumbers().bignum();
		

	}
	public void bignum()
	{
	BigInteger bi1 = new BigInteger("637824629384623845238423545642384"); 
	BigInteger bi2 = new BigInteger("3039768898793547264523745379249934"); 

	BigInteger biarr[] = {new BigInteger("637824629384623845238423545642384"),new BigInteger("637824629384623845238423545642383"),new BigInteger("63782462938462384523842354564234")   };
	for(int i=0;i<biarr.length;i++)
		System.out.println("BigInt: "+biarr[i]);	
	
	BigInteger bigSum = bi1.add(bi2);

	BigInteger bigProduct = bi1.multiply(bi2);

	System.out.println("Sum : " + bigSum);
	System.out.println("Product : " + bigProduct);
	}
	 public static String factorial(int n) {
	       BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       return fact.toString();
	   }
	 
	 public BigInteger toBigInteger(String foo)
	 {
	     return new BigInteger(foo.getBytes());
	 }

	 public String fromBigInteger(BigInteger bar)
	 {
	     return new String(bar.toByteArray());
	 }
}
