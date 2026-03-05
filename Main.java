public class  Main {
    public static void main(String[] args) {

        Customer customer = new Customer("John", "john@email.com");

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 1000);

        customer.getCart().addProduct(p1);
        customer.getCart().addProduct(p2);

        Order order = new Order();

    
        for (Product p : customer.getCart().getProducts()) {
            order.addItem(new OrderItem(p.getName(), p.getPrice(), 1));
        }

        double total = order.calculateTotal();

        Payment payment = new GCashPayment(total);
        order.setPayment(payment);

        order.checkout();

        Shipping shipping = new Shipping("Manila City");
        shipping.ship();
    }
}