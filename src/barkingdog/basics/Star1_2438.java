package barkingdog.basics;

import java.util.Scanner;

public class Star1_2438 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i=0; i<N; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
                if (i == j) {
                    System.out.println();
                }
            }
        }
    }
}
