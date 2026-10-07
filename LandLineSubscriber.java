public class LandLineSubscriber extends Subscriber {

    private int noOfSTDCallMinutes;
    private double costPerEachSTDMinute;

    // Constructor
    public LandLineSubscriber(String subscriberName,
                              long subscriberId,
                              long subscriberPhoneNumber,
                              String subscriberPlanName,
                              int subscriberFreeCalls,
                              double subscriberPackageCost,
                              int subscriberExtraCallsInMinutes,
                              double subscriberExtraCallCostPerMinutes,
                              int noOfSTDCallMinutes,
                              double costPerEachSTDMinute) {

        super(subscriberName,
              subscriberId,
              subscriberPhoneNumber,
              subscriberPlanName,
              subscriberFreeCalls,
              subscriberPackageCost,
              subscriberExtraCallsInMinutes,
              subscriberExtraCallCostPerMinutes);

        this.noOfSTDCallMinutes = noOfSTDCallMinutes;
        this.costPerEachSTDMinute = costPerEachSTDMinute;
    }

    // Method overriding
    @Override
    public void getSubscriberDetails() {

        super.getSubscriberDetails();

        System.out.println("\n---------- LANDLINE DETAILS ----------");
        System.out.println("STD Call Minutes         : "
                + noOfSTDCallMinutes);

        System.out.printf("STD Cost/Minute          : Rs. %.2f%n",
                costPerEachSTDMinute);
    }

    // Calculate landline bill
    public double calculateBill() {

        // Cost of extra local calls
        double extraCallCost =
                subscriberExtraCallsInMinutes
                * subscriberExtraCallCostPerMinutes;

        // Cost of STD calls
        double stdCallCost =
                noOfSTDCallMinutes * costPerEachSTDMinute;

        // Total before tax
        double subtotal =
                subscriberPackageCost
                + extraCallCost
                + stdCallCost;

        // 10% tax
        double tax =
                subtotal * subscriberTaxOnBill / 100;

        // Final bill
        double totalBill = subtotal + tax;

        System.out.println("\n========================================");
        System.out.println("         LANDLINE BILL SUMMARY");
        System.out.println("========================================");

        System.out.printf("Package Cost             : Rs. %.2f%n",
                subscriberPackageCost);

        System.out.printf("Extra Call Cost          : Rs. %.2f%n",
                extraCallCost);

        System.out.printf("STD Call Cost            : Rs. %.2f%n",
                stdCallCost);

        System.out.printf("Subtotal                 : Rs. %.2f%n",
                subtotal);

        System.out.printf("Tax (10%%)                : Rs. %.2f%n",
                tax);

        System.out.println("----------------------------------------");

        System.out.printf("TOTAL BILL               : Rs. %.2f%n",
                totalBill);

        System.out.println("========================================");

        return totalBill;
    }
}