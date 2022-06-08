package test3;

import java.math.BigInteger;

public class Test3 {
    public static void main(String[] args) {

        System.out.printf("Sum of numbers %d! = %d\n", 100, sumFactorial(100));

    }

    public static BigInteger sumFactorial(int max) {
        //I used BigInteger because its max value limited only of size of RAM
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger result = BigInteger.valueOf(1);
        BigInteger currentNum = BigInteger.valueOf(0);
        //calculating factorial
        for (long i = 1; i <= max; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        //calculating sum of numbers
        while (!result.equals(BigInteger.valueOf(0))) {
            //add the remainder after dividing the factorial by 10 to the sum
            sum = sum.add(result.mod(BigInteger.valueOf(10)));
            //we divide the factorial by 10
            result = result.divide(BigInteger.valueOf(10));
        }
        return sum;
    }
}
