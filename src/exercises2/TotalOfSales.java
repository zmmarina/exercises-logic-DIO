package exercises2;

import java.util.Scanner;

public class TotalOfSales {
    Scanner sc = new Scanner(System.in);
    System.out.print("Seller's name: ");
    String name = sc.nextLine();
    System.out.print("Enter the quantity of sales in January: ");
    int jan = sc.nextInt();
    System.out.print("Enter the quantity of sales in February: ");
    int feb = sc.nextInt();
    System.out.print("Enter the quantity of sales in March: ");
    int mar = sc.nextInt();
    System.out.print("Enter the quantity of sales in April: ");
    int apr = sc.nextInt();

    int average = jan + feb + mar + apr / 4;
    System.out.println("The average of sales of " + name + " is " + average);

}
