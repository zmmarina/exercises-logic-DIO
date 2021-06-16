package com.zm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tshirt = 50;

        System.out.println("how many t-shirts do you want?");
        int qnt = sc.nextInt();

        double choice = (qnt == 2) ? tshirt * 0.8 * qnt : tshirt * qnt;
        System.out.println(choice);

    }
}
