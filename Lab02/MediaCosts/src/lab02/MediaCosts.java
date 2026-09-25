package lab02;

import java.util.Arrays;
import java.util.Scanner;

public class MediaCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of media: ");
        int n = scanner.nextInt();

        double[] costs = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter cost " + (i + 1) + ": ");
            costs[i] = scanner.nextDouble();
        }

        double sum = 0;

        for (double cost : costs) {
            sum += cost;
        }

        double average = sum / n;

        Arrays.sort(costs);

        System.out.println("Sorted array:");
        for (double cost : costs) {
            System.out.print(cost + " ");
        }

        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}