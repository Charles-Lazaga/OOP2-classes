class Shipping {
    private String address;

    public Shipping(String address) {
        this.address = address;
    }

    public void ship() {
        System.out.println("Shipping to: " + address);
    }
}