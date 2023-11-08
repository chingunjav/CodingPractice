package io.chiba.maven.problemSolvePatterns.top50;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatCharacter {

    public static void main(String[] args) {
        String str = "geeksforgeeks" ; //e
        String str2 = "hello greeks"; //l

        System.out.println(firstRepeat(str2));

    }

    /**
     * O(n) = n2
     * @param str
     * @return
     */
    public static  Character firstRepeat(String str){
        Set<Character> hSet = new HashSet<>();

        for(int i=0; i<str.length(); i++){
            if(!hSet.contains(str.charAt(i)))
                hSet.add(str.charAt(i));
            else
                return str.charAt(i);

        }

        return null;
    }
}

