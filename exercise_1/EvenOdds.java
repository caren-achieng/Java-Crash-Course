import java.util.Scanner;

/**
 * A printer program that: reads a number N from System.in, if it is even prints N characters ‘-’
 * to the standard output stream, if it is odd - prints N characters ‘=’ to the standard error
 * stream.
 */
public class EvenOdds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int myInt = scanner.nextInt();

        if (myInt % 2 == 0) {
            for (int i = 0; i < myInt; i++) {
                System.out.print('-');
            }
        } else {
            for (int j = 0; j < myInt; j++) {
                System.err.print('=');
            }
        }
        System.out.println();
    }

}
