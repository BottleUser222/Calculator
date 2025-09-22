import java.util.Scanner;
public class calculator {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            while (!input.hasNextInt()){
                System.out.println("That's not a number! Input a number: ");
                input.next();
            }
            int num1 = input.nextInt();
            System.out.print("Please enter another number: ");
            while (!input.hasNextInt()){
                System.out.println("That's not a number! Input a number: ");
                input.next();
            }
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum is " + sum);
        }
    }
