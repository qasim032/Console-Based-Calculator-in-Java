import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----------------------------------------------------------");
            int num1, num2;
            System.out.println("Welcome to simple calculator");
            System.out.println("Choose one of the following options");
            System.out.println(" 1. Add");
            System.out.println(" 2. Subtract");
            System.out.println(" 3. Multiply ");
            System.out.println(" 4. Divide");
            System.out.println(" 5. Modulus");
            System.out.println(" 6. Power");
            System.out.println(" 7. Exit");
            System.out.print("\nNow enter your choice ");
            choice = input.nextInt();
            if(choice == 7){
                break;
            }
                System.out.print("Please enter the first number :");
                num1 = input.nextInt();
                System.out.print("Now, enter the second number :");
                num2 = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The result of the operations is : " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("The result of the operations is : " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("The result of the operations is : " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("The result of the operations is : " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("The result of the operations is : " + (num1 % num2));
                    break;
                case 6:
                    int result = 1;
                    for (int i = 1; i <= num2; i++)
                        result *= num1;
                    System.out.println("The result of the operations is : " + result);
                    break;
            }
        } while (true);


    }
}