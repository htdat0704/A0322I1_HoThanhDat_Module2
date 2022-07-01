package ss11_java_collection_framework.bai_tap.useArrayList_QLSP.linkedList;

public class Product {
    private int ID;
    private double price;
    private String name;
    public static int idIncrease = 0;

    public Product(double price, String name) {
        this.ID = this.idIncrease;
        this.price = price;
        this.name = name;
        increaseID();
    }

    public Product(){}

    public static void increaseID(){
        idIncrease++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }


}
