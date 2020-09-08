package com.example.java.Java;

class Solution{
    public int[] twoSum(int[] nums, int target) {

        for (int i=0; i<=nums.length-1; i++){
            for (int j=i; j<=nums.length-1; j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

public class Two_Sum_LC {

    public static void main(String[] args) {

        int[] nums = {3,2,4};
        int target = 6;

        Solution s  = new Solution();
        int[] a = s.twoSum(nums,target);
        System.out.println(a[0]+","+a[1]);
//        for (int i=0; i<=nums.length-1; i++){
//            for (int j=i; j<=nums.length-1; j++){
//                if(nums[i]+nums[j]==target){
//                    System.out.println("["+i+","+j+"]");
//                }
//            }
//        }
    }
}