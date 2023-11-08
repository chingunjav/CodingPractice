package io.chiba.maven.problemSolvePatterns.top50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int []  nums= {2,3,11,7,5};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

    public static int[] twoSum(int [] nums, int target){
        //print location, or if not found will print -1
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
             if(map.containsKey(target-nums[i])){
                 return new int[]{map.get(target-nums[i]),i};
             } else {
                 map.put(nums[i],i);
             }
        }

    return new int[] {-1,-1};
    }
}
