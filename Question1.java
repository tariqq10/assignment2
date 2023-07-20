import java.util.Scanner;

public class School {

static String name;
static String subject1, subject2, subject3, subject4, subject5;
static int marks1, marks2, marks3, marks4, marks5;

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a Name: ");
name = scanner.nextLine();

System.out.print("Enter the name of Subject 1: ");
subject1 = scanner.nextLine();
System.out.print("Enter marks for " + subject1 + ": ");
marks1 = scanner.nextInt();

System.out.print("Enter the name of Subject 2: ");
scanner.nextLine(); // Consume the new line character
subject2 = scanner.nextLine();
System.out.print("Enter marks for " + subject2 + ": ");
marks2 = scanner.nextInt();

System.out.print("Enter the name of Subject 3: ");
scanner.nextLine(); // Consume the new line character
subject3 = scanner.nextLine();
System.out.print("Enter marks for " + subject3 + ": ");
marks3 = scanner.nextInt();

System.out.print("Enter the name of Subject 4: ");
scanner.nextLine(); // Consume the new line character
subject4 = scanner.nextLine();
System.out.print("Enter marks for " + subject4 + ": ");
marks4 = scanner.nextInt();

System.out.print("Enter the name of Subject 5: ");
scanner.nextLine(); // Consume the new line character
subject5 = scanner.nextLine();
System.out.print("Enter marks for " + subject5 + ": ");
marks5 = scanner.nextInt();

scanner.close();

System.out.println("\nStudent Name: " + name);
System.out.println(subject1 + " Marks: " + marks1);
System.out.println(subject2 + " Marks: " + marks2);
System.out.println(subject3 + " Marks: " + marks3);
System.out.println(subject4 + " Marks: " + marks4);
System.out.println(subject5 + " Marks: " + marks5);
}
}