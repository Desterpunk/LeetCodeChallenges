/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._medianoftwosortedarrays;

/**
 *
 * @author Pc-pro
 */
public class Main {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] num1 = {0,0};
        int[] num2 = {0,0};
        double mediam = s1.findMedianSortedArrays(num1, num2);
        System.out.println(mediam);
                
    }
}
