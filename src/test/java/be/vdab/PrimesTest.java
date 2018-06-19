package be.vdab;

import org.junit.Assert;
import org.junit.Test;
import be.vdab.math.Primes;

import static org.junit.Assert.assertTrue;

public class PrimesTest {
    @Test
    public void primeNumberReturnsTrueIfValueIsPrime() {
        int[] primes = {3, 5, 7, 97, 13};
        for (int prime : primes) {
            assertTrue(Primes.isPrime(prime));
        }
    }

    @Test
    public void primeNumberReturnsFalseIfValueIsNotPrime() {
        boolean out = Primes.isPrime(6);
        Assert.assertFalse(out);
    }

    @Test
    public void oneIsNotAPrime() {
        boolean out = Primes.isPrime(1);
        Assert.assertFalse(out);
    }

    @Test
    public void negativeNumbersAreNotPrimes() {
        Assert.assertFalse(Primes.isPrime(-97));
    }



//        if(out != false) {
//            System.out.println("FOUT");
//        } else {
//            System.out.println("OK");
//        }
//    }
}
