import javax.swing.JOptionPane;

public class MediaDiscount {
    public static void main(String[] args) {
        String strCost = JOptionPane.showInputDialog("Enter the cost of the media:");
        double cost = Double.parseDouble(strCost);

        if (cost > 20) {
            System.out.println("Discounted");
        } else {
            System.out.println("Full price");
        }
    }
}