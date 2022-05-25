public enum Product {
    Coke(1,2.5), Water(2, 3.2), Soda(3,5.0),
    Drinks(1),Crisps(2),Chocolate(3);

    private int drinkId;
    private int CategoryId;

    private double price;

    Product(int drinkId, double price) {
        this.drinkId = drinkId;
        this.price = price;
    }
    Product(int CategoryId){
        this.CategoryId=CategoryId;
    }

    public int getCategoryId() {
        return this.CategoryId;
    }

    public int getDrinkId() {
        return this.drinkId;
    }
    //    public int getId() {
//        return this.drinkId;
//    }

    public double getPrice() {
        return this.price;
    }
}
