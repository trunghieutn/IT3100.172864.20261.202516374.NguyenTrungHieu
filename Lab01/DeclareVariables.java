public class DeclareVariables {
    public static void main(String[] args) {
        String title = "The Lion King";
        double cost = 19.95;
        int id = 1;
        boolean isAvailable = true;

        System.out.println(title);
        System.out.println(cost);
        System.out.println(id);
        System.out.println(isAvailable);

        // Narrowing cast: double -> int
        int roundedCost = (int) cost;
        System.out.println(roundedCost);
    }
}