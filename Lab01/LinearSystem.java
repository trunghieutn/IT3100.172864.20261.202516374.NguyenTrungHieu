import javax.swing.JOptionPane;

public class LinearSystem {
    public static void main(String[] args) {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));

        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            System.out.println("x1 = " + D1 / D);
            System.out.println("x2 = " + D2 / D);
        } else if (D1 == 0 && D2 == 0) {
            System.out.println("Infinite solutions");
        } else {
            System.out.println("No solution");
        }
    }
}