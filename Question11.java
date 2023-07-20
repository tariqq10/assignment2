public class Prime {

public static void main(String[] args) {
int i = 2, j, isPrime, n = 100;
System.out.println("All Prime Numbers Between 1 to 100");

while (i <= n) {
isPrime = 0;
j = 2;

while (j <= i / 2) {
if (i % j == 0) {
isPrime = 1;
break;
}
j++;
}

if (isPrime == 0)
System.out.print(i + " ");

i++;
}
}
}