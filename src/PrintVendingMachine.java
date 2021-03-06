public class PrintVendingMachine implements VendingMachine{
    private int selectedProduct;

    @Override
    public void displayCategory(){
        System.out.println("***************************");
        System.out.println("Welcome to vending machine");
        System.out.println("***************************");
        System.out.println("Please select the category");

        for (Product product:Product.values()){
            if (product.getCategoryId()!=0) {
                System.out.println("   " + product.getCategoryId() + "   " + product.name());
            }
        }
    }
    @Override
    public void displayProduct() {
        System.out.println("--Products available are--");

        for (Product product:Product.values()){
            if(product.getDrinkId()!=0 ) {
//                System.out.println("selected category is"+s);
//                if (selectCategory()==1) {
                    System.out.println("   " + product.getDrinkId() + "   " + product.name() + "-   Price: " + product.getPrice() + "£");
//                }
                }
        }

        System.out.println("Please select your product");
    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct=product;
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println("This machine accepts only below coins-");
        System.out.println("1p, 2p, 5p, 10p, 20p, 50p, 1£");
        System.out.println("Please type in below format ");
        System.out.println("0,0,2,0,0,0,0  to enter 2 coins of 5p");
        System.out.println("Please enter coins");
    }
}
