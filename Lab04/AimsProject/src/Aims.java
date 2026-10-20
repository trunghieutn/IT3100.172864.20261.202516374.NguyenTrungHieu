
public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
            "The Lion King", "Animation", "Roger Allers", 87, 19.95f
        );

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
            "Star Wars", "Science Fiction", "George Lucas", 124, 24.95f
        );

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
            "Aladin", "Animation", "Ron Clements", 90, 18.99f
        );

        System.out.println("Test adding one DVD:");
        cart.addDigitalVideoDisc(dvd1);
        cart.displayCart();

        System.out.println("\nTest adding two DVDs:");
        cart.addDigitalVideoDisc(dvd2, dvd3);
        cart.displayCart();

        System.out.println("\nTest adding an array of DVDs:");
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Cinderella");
        DigitalVideoDisc[] dvdList = {dvd1, dvd4};
        cart.addDigitalVideoDisc(dvdList);
        cart.displayCart();

        System.out.println("\nTest removing Star Wars:");
        cart.removeDigitalVideoDisc(dvd2);
        cart.displayCart();
        
        System.out.println(dvd1.getId());
        System.out.println(dvd2.getId());
        System.out.println(dvd3.getId());
        
   
    }
}
