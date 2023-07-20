import java.util.Scanner;

public class InputDo {
public static void main(String[] args) {
Scanner myInput = new Scanner(System.in);
System.out.println("Please enter your value");
System.out.println("enter zero to get the sum");
int values = 1;
int total = 0;

while (values != 0) {
total += values;
values = myInput.nextInt();
}

System.out.println("The sum of all your values is " + total);
myInput.close();
}
}