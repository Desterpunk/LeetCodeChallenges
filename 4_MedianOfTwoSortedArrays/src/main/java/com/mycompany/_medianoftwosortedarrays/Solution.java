/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._medianoftwosortedarrays;

import java.util.Arrays;

/**
 *
 * @author Pc-pro
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int [nums1.length + nums2.length];
        double sum=0,result;
        System.arraycopy(nums1, 0, merged, 0, nums1.length);     
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        if (merged.length % 2 != 0) {
            result = merged[merged.length/2];
            System.out.println(merged.length);
        } else {
            sum = sum + merged[merged.length/2 - 1] + merged[merged.length/2];
            result = sum/2;
        }
        return result;
    }
}
