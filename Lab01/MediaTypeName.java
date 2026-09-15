import javax.swing.JOptionPane;

public class MediaTypeName {
    public static void main(String[] args) {
        String strOption = JOptionPane.showInputDialog(
                "Choose a media type (1: DVD, 2: CD, 3: Book):");
        int option = Integer.parseInt(strOption);
        String mediaType;

        switch (option) {
            case 1:
                mediaType = "DVD";
                break;
            case 2:
                mediaType = "CD";
                break;
            case 3:
                mediaType = "Book";
                break;
            default:
                mediaType = "Unknown";
        }

        System.out.println("You selected: " + mediaType);
    }
}