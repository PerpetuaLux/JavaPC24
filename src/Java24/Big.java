package Java24;

import java.math.BigInteger;

public class Big {
    public static BigInteger ifactorial(int num) {
        BigInteger result = BigInteger.valueOf(1);
        if(num == 0) {
            return BigInteger.ONE;
        }
        else {
            for(int i = 2; i <= num; i++) {
                BigInteger current = BigInteger.valueOf(i);
                result = result.multiply(current);
            }
            return result;
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 3000; i++) {
            System.out.print(i);
            System.out.println(" -> " + ifactorial(i));
        }
        System.out.println(Integer.MAX_VALUE);
    }
}
