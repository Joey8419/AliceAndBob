import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your name");
            String name = input.nextLine();

            if (name.equals("Alice") || name.equals("Bob")) {
                System.out.println("Hello " + name);
                break;
            }
            else {
                System.out.println("We only like the name Alice or Bob");
            }
        }
    }
    }
