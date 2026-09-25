package lab02;

import java.util.Scanner;

public class MediaCostAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of media: ");
        int n = scanner.nextInt();

        double[] costs = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter cost " + (i + 1) + ": ");
            costs[i] = scanner.nextDouble();
        }

        double minCost = costs[0];
        double maxCost = costs[0];
        double totalCost = 0;

        for (double cost : costs) {
            if (cost < minCost) {
                minCost = cost;
            }

            if (cost > maxCost) {
                maxCost = cost;
            }

            if (cost > 20) {
                totalCost += cost * 0.9;
            } else {
                totalCost += cost;
            }
        }

        System.out.println("Minimum cost = $" + minCost);
        System.out.println("Maximum cost = $" + maxCost);
        System.out.println("Total cost after discount = $" + totalCost);
    }
}