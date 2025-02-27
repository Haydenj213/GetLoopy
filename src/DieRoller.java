import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Random randomDice = new Random();
        Scanner in = new Scanner(System.in);

        int randomDice1;
        int randomDice2;
        int randomDice3;
        int sum;
        int amountRolled = 0;
        String playChoice;

        System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Roll Number", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------------------------------");

    do {
        randomDice1 = randomDice.nextInt(6) + 1;
        randomDice2 = randomDice.nextInt(6) + 1;
        randomDice3 = randomDice.nextInt(6) + 1;
        sum = randomDice1 + randomDice2 + randomDice3;
        amountRolled++;

        System.out.printf("%-10d%-10d%-10d%-10d%-10d%n", amountRolled, randomDice1, randomDice2, randomDice3, sum);

        System.out.println("Would you like to attempt and roll the dice again?");
        playChoice = in.nextLine();

    } while (!playChoice.equalsIgnoreCase("no") && (randomDice1 != randomDice2 || randomDice2 != randomDice3));
        System.out.println("Thank for rolling the dice!");
    }
}
