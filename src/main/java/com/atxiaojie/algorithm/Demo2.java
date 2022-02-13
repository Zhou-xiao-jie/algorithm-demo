package com.atxiaojie.algorithm;

/**
 * @ClassName: Demo2
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2022/1/24 11:06
 * @Version: V1.0.0
 */
public class Demo2 {
    public static int removeDuplicates(int[] nums) {
        // int j = 0;
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(!map.containsKey(nums[i])){
        //         nums[j] = nums[i];
        //         map.put(nums[i],nums[i]);
        //         j++;
        //     }
        // }
        // return map.size();
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {
        int[] nums =new int[]{0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        for (int j = 0; j < i; j++) {
            System.out.print(nums[j]);
        }
    }
}
