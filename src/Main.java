import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        VendingMachine vendingMachine=new PrintVendingMachine();
        vendingMachine.displayCategory();
        String selectedCategory=scanner.nextLine();
        System.out.println(selectedCategory+"is selected");
//        String selectedCategory=scanner.nextLine();
//        int selectedCategoryNumber=Integer.parseInt(selectedCategory);
//        vendingMachine.selectCategory(selectedCategoryNumber);

        vendingMachine.displayProduct();
        String selectedProduct=scanner.nextLine();
        int selectedProductNumber=Integer.parseInt(selectedProduct);
        vendingMachine.selectProduct(selectedProductNumber);

        vendingMachine.displayEnterCoinsMessage();

    }
}