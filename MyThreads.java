/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threada;

import static java.lang.Thread.currentThread;

public class MyThreads extends Threads {
    
        public void run() {
            System.out.println(Thread.currentThread().getName());
        try {
            for (int x = 0; x <=10; x++) {
                System.out.println(x);
                sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
