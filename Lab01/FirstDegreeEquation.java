import javax.swing.JOptionPane;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));

        if (a != 0) {
            System.out.println("x = " + (-b / a));
        } else if (b != 0) {
            System.out.println("No solution");
        } else {
            System.out.println("Infinite solutions");
        }
    }
}