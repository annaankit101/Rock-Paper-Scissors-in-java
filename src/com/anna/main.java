package com.anna;

import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        // 1 = Rock, 2 = Paper, 3 = Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1 for ROCK, 2 for PAPER, 3 for SCISSOR");
        int userInput = sc.nextInt();

        Random rd = new Random();
        int computerInput = rd.nextInt(3);

        if (userInput==computerInput){
            System.out.println("Draw");
        } else if (userInput == 1 && computerInput == 2 || userInput == 2 && computerInput == 3 || userInput == 3 && computerInput == 1) {
            System.out.println("Computer Win");
        }
        else {
            System.out.println("User Win");
        }
        if (computerInput==1){
            System.out.println("Computer choice: ROCK");
        }
        else if (computerInput==2) {
            System.out.println("Computer choice: PAPER");
        }
        else if (computerInput==3) {
            System.out.println("Computer choice: SCISSOR");
        }


    }
}
