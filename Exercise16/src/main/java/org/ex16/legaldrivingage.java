package org.ex16;

import java.util.Scanner;

public class legaldrivingage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = scanner.nextInt();

        String Message = (age < 16)? "You are not old enough to legally drive":
                                     "You are old enough to legally drive";

        System.out.println(Message);

    }
}
