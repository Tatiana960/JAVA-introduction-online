package miscellanneous;

import java.math.BigInteger;
class Test13{

public static void main(String[] args) {
        System.out.println (fact(200));

        }
public static BigInteger fact (int n) {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i<=n; i++) {
        result = result.multiply(BigInteger.valueOf(i*i));
        }
        return result;
        }
        }