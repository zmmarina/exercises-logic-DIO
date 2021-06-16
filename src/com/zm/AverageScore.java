package com.zm;

import java.util.Scanner;

public class AverageScore {
    Scanner sc = new Scanner(System.in);

    int qnt = sc.nextInt();
    Double sum = 0.0;

    for( int i = 0; i < qnt; i++){
        int score = sc.nextInt();
        sum += score;
    }

    Double averageScore = sum / qnt;
}
