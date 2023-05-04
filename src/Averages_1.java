import java.util.Scanner;

public class Averages_1 {
    static double a;
    static double b;
    static double averages;

    public static void main(String[] args) {
        getDate();
        handleProduct();
        getOutput ();
    }

    private static void handleProduct() {
        averages = calculator(a,b);
    }

    private static void getDate() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter, first number: ");
        a = scanner.nextInt();
        System.out.printf("Enter, second number: ");
        b = scanner.nextInt();
    }
    private static double calculator(double a, double b) {
        return (a+b)/2;

    }
    private static void getOutput () {
        System.out.println("Averages numbers: " + averages);
    }
}

