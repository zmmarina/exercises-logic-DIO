package exercises2;

import java.util.Scanner;

public class Concat {
    Scanner sc = new Scanner(System.in);

    String lastName = sc.nextLine();
    String firstName = sc.nextLine();
    int age = sc.nextInt();

    String fullName = "Hello, " + firstName + " " + lastName;
    String yourAgeIs = "You are " + age + " years old. So young! Enjoy your life!";

}
