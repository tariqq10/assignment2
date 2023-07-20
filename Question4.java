import java.util.Scanner;

public class FindMaxNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the first number: ");
int number1 = scanner.nextInt();

System.out.print("Enter the second number: ");
int number2 = scanner.nextInt();

int maxNumber;

switch (number1 > number2 ? 1 : number1 < number2 ? -1 : 0) {
case 1:
    maxNumber = number1;
    break;
case -1:
    maxNumber = number2;
    break;
default:
    System.out.println("Both numbers are equal.");
    scanner.close();
    return;
    }

    System.out.println("The maximum number is: " + maxNumber);
    scanner.close();
    }
    }