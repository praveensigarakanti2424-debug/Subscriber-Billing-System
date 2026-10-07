import java.util.Scanner;

public class BillingApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("       SUBSCRIBER BILLING SYSTEM");
        System.out.println("==============================================");

        boolean running = true;

        while (running) {

            System.out.println("\n--------------- MAIN MENU ----------------");
            System.out.println("1. Generate Mobile Subscriber Bill");
            System.out.println("2. Generate Landline Subscriber Bill");
            System.out.println("3. Exit");
            System.out.println("-------------------------------------------");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    generateMobileBill();
                    break;

                case 2:
                    generateLandlineBill();
                    break;

                case 3:
                    running = false;
                    System.out.println("\nThank you for using Subscriber Billing System!");
                    break;

                default:
                    System.out.println(
                            "Invalid choice! Please select 1, 2 or 3.");
            }
        }

        scanner.close();
    }

    // Mobile subscriber
    public static void generateMobileBill() {

        scanner.nextLine();

        System.out.println("\n==============================================");
        System.out.println("       MOBILE SUBSCRIBER REGISTRATION");
        System.out.println("==============================================");

        System.out.print("Enter Subscriber Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Subscriber ID: ");
        long id = scanner.nextLong();

        System.out.print("Enter Phone Number: ");
        long phone = scanner.nextLong();

        scanner.nextLine();

        System.out.print("Enter Plan Name: ");
        String plan = scanner.nextLine();

        System.out.print("Enter Free Calls/Minutes: ");
        int freeCalls = scanner.nextInt();

        System.out.print("Enter Package Cost: ");
        double packageCost = scanner.nextDouble();

        System.out.print("Enter Extra Call Minutes: ");
        int extraMinutes = scanner.nextInt();

        System.out.print("Enter Extra Call Cost/Minute: ");
        double extraCost = scanner.nextDouble();

        System.out.print("Enter Roaming Minutes: ");
        int roamingMinutes = scanner.nextInt();

        System.out.print("Enter Roaming Cost/Minute: ");
        double roamingCost = scanner.nextDouble();

        // Create MobileSubscriber object
        MobileSubscriber mobileSubscriber =
                new MobileSubscriber(
                        name,
                        id,
                        phone,
                        plan,
                        freeCalls,
                        packageCost,
                        extraMinutes,
                        extraCost,
                        roamingMinutes,
                        roamingCost
                );

        // Display details
        mobileSubscriber.getSubscriberDetails();

        // Calculate bill
        mobileSubscriber.calculateBill();
    }

    // Landline subscriber
    public static void generateLandlineBill() {

        scanner.nextLine();

        System.out.println("\n==============================================");
        System.out.println("      LANDLINE SUBSCRIBER REGISTRATION");
        System.out.println("==============================================");

        System.out.print("Enter Subscriber Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Subscriber ID: ");
        long id = scanner.nextLong();

        System.out.print("Enter Phone Number: ");
        long phone = scanner.nextLong();

        scanner.nextLine();

        System.out.print("Enter Plan Name: ");
        String plan = scanner.nextLine();

        System.out.print("Enter Free Calls/Minutes: ");
        int freeCalls = scanner.nextInt();

        System.out.print("Enter Package Cost: ");
        double packageCost = scanner.nextDouble();

        System.out.print("Enter Extra Call Minutes: ");
        int extraMinutes = scanner.nextInt();

        System.out.print("Enter Extra Call Cost/Minute: ");
        double extraCost = scanner.nextDouble();

        System.out.print("Enter STD Call Minutes: ");
        int stdMinutes = scanner.nextInt();

        System.out.print("Enter STD Cost/Minute: ");
        double stdCost = scanner.nextDouble();

        // Create LandLineSubscriber object
        LandLineSubscriber landlineSubscriber =
                new LandLineSubscriber(
                        name,
                        id,
                        phone,
                        plan,
                        freeCalls,
                        packageCost,
                        extraMinutes,
                        extraCost,
                        stdMinutes,
                        stdCost
                );

        // Display details
        landlineSubscriber.getSubscriberDetails();

        // Calculate bill
        landlineSubscriber.calculateBill();
    }
}