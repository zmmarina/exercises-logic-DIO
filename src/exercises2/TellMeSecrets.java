package exercises2;

import java.util.Scanner;

public class TellMeSecrets {
    Scanner sc = new Scanner(System.in);
    char ans;

        do{
        System.out.print("Tell me a secret: " + "\n");
        String secret = sc.nextLine();

        System.out.print("Do you want to tell me a secret? (if not, press n): ");
        ans = sc.next().charAt(0);
        sc.nextLine();
    }while (ans != 'n' && ans != 'N');

    sc.close();
}
