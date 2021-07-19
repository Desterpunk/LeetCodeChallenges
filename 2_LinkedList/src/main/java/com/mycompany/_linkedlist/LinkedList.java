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
   
   public class LinkedList {
       Node head;
       
       public void append(int data) {
           if (head == null) {
               head = new Node(data);
               return;
           }
           Node current = head;
           while (current.next != null) {
               current = current.next;
           }
           current.next = new Node(data);
       }
       
       public void prepend(int data){
           Node newHead = new Node(data);
           newHead.next = head;
           head = newHead;
       }
       
       public void deleteWithValue(int data) {
           if (head == null) return;
           
           Node current = head;
           while(current.next != null) {
               if (head.data == data) {
                   head = head.next;
                   return;
               }
               
               if (current.next.data == data) {
                   current.next = current.next.next;
                   return;
               }
               current = current.next;
           }
       }
       
       public void display(){
           Node current = head;
    
           while(current != null){
               System.out.println(current.data + " ");
               current = current.next;
           }
           
       }
   }
   
   
