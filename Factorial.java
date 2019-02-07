 


import java.math.BigInteger;

public class Factorial {

    /**
     * This method takes an Integer and returns the factorial of that Integer as a
     * BigInteger.
     */
    public BigInteger factorialOf(Integer value){
        BigInteger result = BigInteger.valueOf(1);
        for(int n = 1; n <= value; n++){
            result = result.multiply(BigInteger.valueOf(n));
        }
        return result;
    }

}
