import java.util.Scanner;

public class Deposit {
    static double balance;
    static double price;
    static int yers = 0;
    static final double PRESENT_DEPOSIT = 0.125;
    static final double TAX = 19.5;


    public static void main(String[] args) {
        getDate ();
        handleProduct();
        getOutput ();


    }
    private static void getDate () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter, the deposit amount: ");
        price = scanner.nextDouble();
        System.out.print("Enter, the term of the deposit: ");
        yers = scanner.nextInt();
        scanner.close();
    }

    private static void handleProduct() {
        balance = calInterestDeposit(price);
    }
    private static double calInterestDeposit(double price) {
        for (int i = 1; i <= yers; i++) {
            balance = price + (price * PRESENT_DEPOSIT - TAX) * i;

        }
        return balance;
    }
    private static void getOutput () {
        System.out.println("Deposit balance: " + balance);
    }
}


