
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private DigitalVideoDisc[] itemsOrdered =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    public Cart() {
    }
    

    
    
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	        itemsOrdered[qtyOrdered] = disc;
	        qtyOrdered++;
	        System.out.println("The disc has been added");
	    } else {
	        System.out.println("The cart is full");
	    }
	}

	
	

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	    int index = -1;
	
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i] == disc) {
	            index = i;
	            break;
	        }
	    }
	
	    if (index != -1) {
	        for (int i = index; i < qtyOrdered - 1; i++) {
	            itemsOrdered[i] = itemsOrdered[i + 1];
	        }
	
	        itemsOrdered[qtyOrdered - 1] = null;
	        qtyOrdered--;
	
	        System.out.println("The disc has been removed");
	    } else {
	        System.out.println("The disc was not found");
	    }
	}
	
	

	public float totalCost() {
	    float total = 0;
	
	    for (int i = 0; i < qtyOrdered; i++) {
	        total += itemsOrdered[i].getCost();
	    }
	
	    return total;
	}
	
	

	public void displayCart() {
	    for (int i = 0; i < qtyOrdered; i++) {
	        System.out.println(
	            (i + 1) + ". " + itemsOrdered[i].getTitle()
	            + " - " + itemsOrdered[i].getCost()
	        );
	    }
	
	    System.out.printf("Total Cost is: %.2f%n", totalCost());
	}


	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
	    for (DigitalVideoDisc disc : dvdList) {
	        addDigitalVideoDisc(disc);
	    }
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	    addDigitalVideoDisc(dvd1);
	    addDigitalVideoDisc(dvd2);
	}


}
