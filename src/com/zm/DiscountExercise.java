package com.zm;

import java.util.Scanner;

public class DiscountExercise {
    Scanner sc = new Scanner(System.in);

    int tshirt = 50;
    int qnt = sc.nextInt();

    double choice = (qnt == 2) ? tshirt * 0.8 * qnt : tshirt * qnt;

}
