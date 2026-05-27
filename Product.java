// Product.java

public class Product {

    int id;
    String name;
    int price;

    Product(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println(id + " " + name + " " + price);
    }

    public static void main(String[] args) {

        Product p1 = new Product(1,"Smart Watch",1999);

        p1.display();
    }
}