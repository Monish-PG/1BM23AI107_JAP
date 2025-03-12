import java.util.Scanner;
public class gym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Gym");
        System.out.println("Enter number of members:");
        int num = input.nextInt();


        input.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("Enter your name");
            String name = input.nextLine();

            System.out.println("Enter your age:");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("Enter your membership Status:");
            boolean status = input.nextBoolean();
            System.out.println("Enter your membership duration:");
            int months = input.nextInt();
            input.nextLine();
            float price = months * 1000.00f;
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Status: " + status);
            System.out.println("Gym fee is " + price + " for " + months + " months");
        }

    }
}
