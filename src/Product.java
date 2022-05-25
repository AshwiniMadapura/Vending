public enum Product {
    Coke(1,2.5), Water(2, 3.2), Chocolate(3,5.0);

    private int id;
    private double price;

    Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }
}
