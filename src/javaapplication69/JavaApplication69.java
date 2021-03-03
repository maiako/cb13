/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Μάρω
 */
public class JavaApplication69 {

    static ArrayList<Integer> randomList() {
        ArrayList<Integer> randomNumbers = new ArrayList();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            randomNumbers.add(rand.nextInt(101));
        }
        return randomNumbers;
    }

    static ArrayList<Integer> xList(int length, int limit) {
        ArrayList<Integer> randomNumbers = new ArrayList();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            randomNumbers.add(rand.nextInt(limit + 1));
        }
        return randomNumbers;
    }

    static void countOddsEvens(ArrayList<Integer> list) {
        int odd = 0, even = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("odd: " + odd + " even: "
                + even);
    }



/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(randomList());
        System.out.println(xList(5, 45));
        ArrayList<Integer> list = (xList(100, 100));
        countOddsEvens(list);


    }
}
