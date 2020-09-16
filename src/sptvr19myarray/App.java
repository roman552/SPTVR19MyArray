/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myarray;

import java.util.Random;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("---MyArray---");
        Random random = new Random();
        int rnum = 0;
        //Создаем массив целых четных чисел
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                rnum = random.nextInt(99-0+1)+0;
                if (rnum%2==0) {
                    numbers[i] = rnum;
                    break;
                }
            }
            System.out.printf("%4d",numbers[i]);
        }
        System.out.println();
    }
}
