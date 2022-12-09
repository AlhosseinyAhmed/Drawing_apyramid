import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" please enter your number");
        number=scanner.nextInt();
        for(int i = 0 ; i < number ; i++)
        {
            for (int j = 0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}