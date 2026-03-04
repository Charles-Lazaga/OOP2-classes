class GCashPayment extends Payment {

    public GCashPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Paid ₱" + amount + " using GCash.");
    }
}
 