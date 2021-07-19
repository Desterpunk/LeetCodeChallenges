/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._two_sum;

import java.util.HashMap;

/**
 *
 * @author Pc-pro
 */
public class Solution {
        public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> mapNumbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (mapNumbers.containsKey(target-nums[i])) {
                answer[0] = mapNumbers.get(target-nums[i]);
                answer[1] = i;
            }
            mapNumbers.put(nums[i],i);
        }
        return answer; 
    }
}
