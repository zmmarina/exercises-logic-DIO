package exercises2;

import java.util.Scanner;

public class TimesTable {
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();

    for(int i = 0; i <= 10; i++){
        System.out.println(i + " x " + number + " = " + i * number);
    }

}
