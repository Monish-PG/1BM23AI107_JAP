import java.util.Scanner;
import java.util.Vector;
class OnlineShop {
    Vector<Product> products = new Vector();
    void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product details");
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Enter the price");
        Float price = scanner.nextFloat();
        System.out.println("Enter the category");
        scanner.nextLine();
        String category = scanner.nextLine();
        Product p = new Product(name, price, category);
        products.add(p);
    }
    void displayProducts() {
        for (Product product : products) {
            System.out.println("Name: " + product.name);
            System.out.println("Price: " + product.price);
            System.out.println("Category: " + product.category);
        }
    }
    void deleteProduct(int x){
        Product p = products.remove(x);
    }
}
class Main{
    public static void main(String []args) {
        OnlineShop bmscekart = new OnlineShop();
        bmscekart.addProduct();
        bmscekart.addProduct();
        bmscekart.displayProducts();
        System.out.println("After deleteing a product");
        bmscekart.deleteProduct(0);
        bmscekart.displayProducts();
    }
}

class Product {
    String name;
    Float price;
    String category;
    Product(String name, Float price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
//Enter the product details
//Enter the name
//monish
//Enter the price
//12000
//Enter the category
//gm
//Enter the product details
//Enter the name
//nithink
//Enter the price
//2400
//Enter the category
//ahj
//Name: monish
//Price: 12000.0
//Category: gm
//Name: nithink
//Price: 2400.0
//Category: ahj
//After deleteing a product
//Name: nithink
//Price: 2400.0
//Category: ahj