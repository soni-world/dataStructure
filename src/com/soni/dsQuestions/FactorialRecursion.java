package com.soni.dsQuestions;

import java.math.BigInteger;

public class FactorialRecursion {

    public static BigInteger recursiveFact(BigInteger num){
        if(num == BigInteger.ZERO){
            return BigInteger.ONE;
        }
        return num.multiply(recursiveFact(num.subtract(BigInteger.ONE)));
    }
}
