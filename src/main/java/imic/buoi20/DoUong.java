package imic.buoi20;

public class DoUong {
    String category;
    String name;
    protected double price;
    char size;

    public DoUong() {
        size = 'S';

    }

    public String toString() {
        return "Category: " + category + " | Name: " + name + " | Price: " + price;
    }

    public double getPrice(){
        switch (size) {
            case 'M':
                return price+5.0;
            case'L':
                return price+10.0;
            default:
                return price;
        }
    }
}
