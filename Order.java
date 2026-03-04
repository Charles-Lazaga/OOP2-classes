class Order {
  private OrderItem[] items;
  private int count;
  private Payment payment;
  public Order() {
      items = new OrderItem[10];
      count = 0;
  }
  public void addItem(OrderItem item) {
      if (count < items.length) {
          items[count] = item;
          count++;
      } else {
          System.out.println("Order is full.");
      }
  }
  public double calculateTotal() {
      double total = 0;
      for (int i = 0; i < count; i++) {
          total += items[i].getSubtotal();
      }
      return total;
  }
  public void setPayment(Payment payment) {
      this.payment = payment;
  }
  public void checkout() {
      if (payment != null) {
          payment.processPayment();
      } else {
          System.out.println("No payment method selected.");
      }
  }
}