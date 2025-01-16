package Practice.DesignPatterns.Durgesh.Prototype;

public class Juice implements Cloneable
{
    private String name;
    private double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Juice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Juice() {
    }

    @Override
    public String toString() {
        return "Juice{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
