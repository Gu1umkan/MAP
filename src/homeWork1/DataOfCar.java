package homeWork1;

public class DataOfCar {
    private int yearOfMade;
    private String model;
    private double price;
    private String color;

    public DataOfCar() {
    }

    public DataOfCar(int yearOfMade, String model, double price, String color) {
        this.yearOfMade = yearOfMade;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(int yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "yearOfMade: " + yearOfMade +
                "   model: " + model +
                "   price: " + price +
                "   color: " + color + ','
             ;
    }
}
