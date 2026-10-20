
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs = 0;

    
    
    public DigitalVideoDisc(String title) {
        assignId();
        this.title = title;
    }

    
    
    public DigitalVideoDisc(String category, String title, float cost) {
        assignId();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    
    
    public DigitalVideoDisc(String director, String category,
                            String title, float cost) {
        assignId();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    
    
    public DigitalVideoDisc(String title, String category,
                            String director, int length, float cost) {
        assignId();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    
    
    private void assignId() {
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
}
