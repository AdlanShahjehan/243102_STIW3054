
package com.mycompany.threada;

public class MyThreadThread extends Thread{
    
    public void run() {
        try {
            for (int x = 1000; x <= 1010; x++) {
                System.out.println(x);
                sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
