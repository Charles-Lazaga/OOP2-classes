import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}