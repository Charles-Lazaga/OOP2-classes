import java.util.ArrayList;
public class Main {
   public static void main(String[] args) {
       Customer customer = new Customer("John", "john@email.com");
       Product p1 = new Product("Laptop", 50000);
       Product p2 = new Product("Mouse", 1000);
       customer.getCart().addProduct(p1);
       customer.getCart().addProduct(p2);
       Order order = new Order();
       double total = customer.getCart().calculateTotal();
Payment payment = new GCashPayment(total);
order.setPayment(payment);
payment.processPayment();
Shipping shipping = new Shipping("Manila City");
shipping.ship();

   }
}