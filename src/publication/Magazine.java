package publication;

public class Magazine extends Publication implements Periodicity{
    private String ISSN;
    private  int number;
    private int year;

    //Getters
    public String getISSN() {
        return ISSN;
    }
    public int getNumber() {
        return number;
    }
    public int getYear() {
        return year;
    }

    //Setters
    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getPeriodicity(){//Método necesario implementado de la interface
        return periodicity;
    }
}
