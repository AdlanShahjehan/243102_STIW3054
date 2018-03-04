/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threada;

/**
 *
 * @author master lab
 */
public class MyTest {
      public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());    
        MyThreads t1 = new MyThreads();
        t1.start();
        MyThreadThread t2 = new MyThreadThread();
        t2.start();
    } 
}
