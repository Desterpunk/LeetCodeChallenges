/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._linkedlist;

/**
 *
 * @author Pc-pro
 */
public class Main {
   public static void main(String args[]){
       int a1[] = { 9,9,9,9,9,9,9};
       int a2[] = { 9,9,9,9};
       
       LinkedList l1 = new LinkedList();
       LinkedList l2 = new LinkedList();
       LinkedList results = new LinkedList();
       for (int i = 0; i < a1.length; i++) {
           l1.append(a1[i]);
       }
       for (int i = 0; i < a2.length; i++) {
           l2.append(a2[i]);
       }
       
       results = addTwoNumbers(l1, l2);
       results.display();
   } 

    private static LinkedList addTwoNumbersLargeMetod(LinkedList l1, LinkedList l2) {
        int num = 0;
        int sum = 0;
        int decimals = 1;
        LinkedList result = new LinkedList();
        
        Node current1 = l1.head;
        while(current1 != null) {
            num += current1.data*decimals;
            decimals *= 10;
            current1 = current1.next;
        }
        sum += num;
        num = 0;
        decimals = 1;

        Node current2 = l2.head;
        while(current2 != null) {
            num += current2.data*decimals;
            decimals *= 10;
            current2 = current2.next;
        }
        sum += num;
        
        String temp = Integer.toString(sum);
        for (int i = temp.length()-1; i >= 0; i--)
        {
            result.append(temp.charAt(i) - '0');
        }
        return result;
    }

    private static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        Node current1 = l1.head;
        Node current2 = l2.head;
        LinkedList result = new LinkedList();
        int x, y, carry=0;
        
        while(current1 != null || current2 != null) {
            
            if (current1 != null) {
                x = current1.data;
                current1 = current1.next;
            } else {
                x = 0;
            }
            
            if (current2 != null) {
                y = current2.data;
                current2 = current2.next;
            } else {
                y = 0;
            }
            
            int sum = x + y + carry;
            
            if (sum>9) {
               carry = 1;
            } else {
                carry = 0;
            }
            result.append(sum % 10); 
            
        }
        if (carry > 0) {
            result.append(carry);
        }
        
        return result;
    }
}
