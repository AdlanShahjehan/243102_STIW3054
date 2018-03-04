/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threada;

public class Threads extends Thread {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Threads());
        t1.start();
    }

    @Override
    public void run() {
        try {
            for (int x = 5; x <=100; x+=5) {
                System.out.print(x);
                sleep(500);
                
                if (x%2==0){
                System.out.print("A");
              }
                System.out.println("");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}