import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Laptop("MacBook Air", 2500, "Apple"));
        products.add(new Laptop("ThinkPad X1", 1800, "Lenovo"));
        products.add(new Smartphone("iPhone 15", 1200, 171));
        products.add(new Smartphone("Galaxy S24", 1000, 167));
        products.add(new Tablet("iPad Air", 900, 11));

        System.out.println("Danh sach san pham:");

        for (Product product : products) {
            System.out.println("ID: " + product.getId());
            System.out.println("Ten: " + product.getName());
            System.out.println("Gia: " + product.getPrice());

            if (product instanceof Laptop) {
                Laptop laptop = (Laptop) product;
                System.out.println("Nhan hieu: " + laptop.getBrand());
            } else if (product instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) product;
                System.out.println("Trong luong: " + smartphone.getWeight() + " g");
            } else if (product instanceof Tablet) {
                Tablet tablet = (Tablet) product;
                System.out.println("Kich thuoc man hinh: " + tablet.getScreenSize() + " inch");
            }

            System.out.println("--------------------");
        }
    }
}
