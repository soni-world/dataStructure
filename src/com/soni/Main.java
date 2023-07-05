package com.soni;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;

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

        getMaxOccurrenceAlphabetChar("8888888hhhhhdhjadjkuhduhjd8908");
    }
}
