import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        VendingMachine vendingMachine=new PrintVendingMachine();
        vendingMachine.displayProduct();
        String selectedProduct=scanner.nextLine();
        int selectedProductNumber=Integer.parseInt(selectedProduct);

        vendingMachine.selectProduct(selectedProductNumber);
        vendingMachine.displayEnterCoinsMessage();

    }
}