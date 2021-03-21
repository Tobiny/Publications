package publication;

public abstract class Publication {
    private String title;
    private int numPag;
    private double price;

    //Getters
    public  String getTitle(){
        return title;
    }
    public int getNumPag() {
        return numPag;
    }
    public double getPrice() {
        return price;
    }
    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
