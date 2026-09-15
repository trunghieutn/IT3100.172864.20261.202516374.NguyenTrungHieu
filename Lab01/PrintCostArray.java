public class PrintCostArray {
    public static void main(String[] args) {
        double[] cost = {19.95, 24.95, 18.99, 15.50, 22.00};

        for (int i = 0; i < cost.length; i++) {
            System.out.println(cost[i]);
        }

        System.out.println("Number of items: " + cost.length);
    }
}