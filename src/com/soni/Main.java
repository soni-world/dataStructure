package com.soni;

import com.soni.designPattern.chainOfResponsibility.ATMDispenseChain;
import com.soni.designPattern.chainOfResponsibility.Currency;
import com.soni.lambda.Calculator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;

import static com.soni.dsQuestions.CoinExchange.getExchange;
import static com.soni.dsQuestions.FactorialRecursion.recursiveFact;
import static com.soni.dsQuestions.MaximumAlphabetsCount.getMaxOccurrenceAlphabetChar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //define queue not thread safe
        Queue<String> q = new PriorityQueue();
        Queue<String> lq = new LinkedList();
        lq.add("test");
        lq.poll();
        // thread safe queue only way to define: also: java.util.concurrent.ConcurrentLinkedQueue
        Queue<String> tsq = new PriorityBlockingQueue();

        // creating empty stack
        Stack<String> stack = new Stack<String>();
        stack.push("Name");
        stack.pop();

        //getMaxOccurrenceAlphabetChar("8888888hhhhhdhjadjkuhduhjd8908");
//        System.out.println(recursiveFact(new BigInteger(String.valueOf(38))));
//        getExchange(new BigDecimal("4.4"));
//        ATMDispenseChain chain = new ATMDispenseChain();
//        chain.c1.dispense(new Currency(70));

//         test functional interface:
        Calculator c = (i1, i2) -> (i1 > i2) ? i1-i2 : i2-i1;
        System.out.println(c.subtract(3,7));
    }
}
