import java.util.UUID;

public class Product {
    private String name;
    private double price;
    private final String id;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
