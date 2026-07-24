public class DemoApp {
    public static void main(String[] args) {
        System.out.println("Git demo");
        System.out.println("Hello from dev");
        Product product = new Product();
        product.name = "Laptop";
        product.price = 100.50;
        product.quantity = 10;
        System.out.println(product);
    }
}
