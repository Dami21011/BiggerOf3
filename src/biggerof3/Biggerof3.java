package biggerof3;

import java.io.PrintStream;
import java.util.Scanner;

public class Biggerof3 {

    public static void main(String[] args) {
        int big;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();

        System.out.println("Write a second number");
        int variable_2 = scanner.nextInt();

        System.out.println("Write the thrid number");
        int variable_3 = scanner.nextInt();

        if (variable_1 > variable_2 && variable_1 > variable_3) {
            big = variable_1;

            System.out.println("The biggest number is: " + big);
        }

        if (variable_2 > variable_1 && variable_2 > variable_3) {
            big = variable_2;
            if (variable_1 > variable_3) {

            }
            System.out.println("The biggest number is:" + big);

        }

        if (variable_3 > variable_2 && variable_3 > variable_1) {
            big = variable_3;
            if (variable_2 > variable_1) {

                System.out.println("The biggest number is:" + big);

            }
        }
    }

}

