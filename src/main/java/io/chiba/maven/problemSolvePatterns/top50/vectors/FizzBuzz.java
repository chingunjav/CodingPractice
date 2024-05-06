package io.chiba.maven.problemSolvePatterns.top50.vectors;

import java.util.Vector;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println(fizzbuzz(15));
    }


    public static Vector<String> fizzbuzz(int n ){

        Vector<String> rv = new Vector<>();

        for(int i=1; i<=n; i++){
            if(i%15 == 0)
                rv.add("FizzBuzz");
            else if(i%5 == 0)
                rv.add("Buzz");
            else if(i%3 == 0)
                rv.add("Fizz");
            else
                rv.add(i+"");
        }
        return rv;



    }
}
