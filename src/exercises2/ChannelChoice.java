package exercises2;

import java.util.Scanner;

public class ChannelChoice {
    Scanner sc = new Scanner(System.in);

    System.out.println("Choose the desired channel: 1 - FOX | 2 - HBO | 3 - Disney | 4 - GNT");

    int channel = sc.nextInt();
    String choice;

        switch(channel){
        case 1 :
            choice = "FOX";
            break;

        case 2 :
            choice = "HBO";
            break;
        case 3 :
            choice = "Disney";
            break;
        case 4 :
            choice = "GNT";
            break;
        default:
            choice = "Invalid entry.";
    }

        System.out.println("You will watch: " + choice);

        sc.close();

}
