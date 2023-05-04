import java.util.Scanner;

public class Averages_2 {
   static double number;
   static   double sum;
   static  double averages;
   static  int quantity;
   static  String enter = "0.0";

   public static void main(String[] args) {
       handleProduct();
       getOutput ();
   }
   private static  void handleProduct() {
       averages = cal(number,sum);
   }
   private static  double cal (double number, double sum) {
       while (enter.equals("=") != true) {
         number = Double.parseDouble(enter);
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter, a number or = to calculate the sum: ");
         enter = scanner.nextLine();
         sum = sum + number;
         quantity++;
   }
       averages = sum/--quantity;
       return averages;

     }
     private static  void getOutput () {
     System.out.println("Averages of numbers: " + averages);
   }

}


