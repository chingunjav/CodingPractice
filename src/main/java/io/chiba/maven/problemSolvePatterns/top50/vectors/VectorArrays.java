package io.chiba.maven.problemSolvePatterns.top50.vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorArrays {
    public static void main(String[] args) {
        //System.out.println(fizzbuzz(30));
        Vector2D();
        System.out.println("====Array");
        nums(new int[]{1,2});
    }


    public static Vector<String> fizzbuzz (int n){
        Vector<String> result = new Vector<>();
        for(int i=1; i<=n; i++){
            if(i%15 == 0)
                 result.add("FizzBuzz");
        }

        return result;
    }

    public static void Vector2D() {
        Vector<Vector<Integer>> vector = new Vector<>();

        Vector<Integer> v1 = new Vector<>();
        v1.add(1);
        v1.add(2);


        Vector<Integer> v2 = new Vector<>();
        v2.add(3);
        v2.add(4);
        v2.add(5);
        v2.add(6);

        vector.add(v1);
        vector.add(v2);
        System.out.println(vector);

    }

    public static  void nums(int nums[]){
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] =20;

        System.out.println(Arrays.toString(arr));

    }
}
