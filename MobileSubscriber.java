public class MobileSubscriber extends Subscriber {

    private int roamingNoOfMinutes;
    private double roamingCostPerMinute;

    // Constructor
    public MobileSubscriber(String subscriberName,
                            long subscriberId,
                            long subscriberPhoneNumber,
                            String subscriberPlanName,
                            int subscriberFreeCalls,
                            double subscriberPackageCost,
                            int subscriberExtraCallsInMinutes,
                            double subscriberExtraCallCostPerMinutes,
                            int roamingNoOfMinutes,
                            double roamingCostPerMinute) {

        super(subscriberName,
              subscriberId,
              subscriberPhoneNumber,
              subscriberPlanName,
              subscriberFreeCalls,
              subscriberPackageCost,
              subscriberExtraCallsInMinutes,
              subscriberExtraCallCostPerMinutes);

        this.roamingNoOfMinutes = roamingNoOfMinutes;
        this.roamingCostPerMinute = roamingCostPerMinute;
    }

    // Method overriding
    @Override
    public void getSubscriberDetails() {

        super.getSubscriberDetails();

        System.out.println("\n---------- MOBILE DETAILS ----------");
        System.out.println("Roaming Minutes          : "
                + roamingNoOfMinutes);

        System.out.printf("Roaming Cost/Minute      : Rs. %.2f%n",
                roamingCostPerMinute);
    }

    // Calculate mobile bill
    public double calculateBill() {

        // Cost of extra calls
        double extraCallCost =
                subscriberExtraCallsInMinutes
                * subscriberExtraCallCostPerMinutes;

        // Cost of roaming calls
        double roamingCost =
                roamingNoOfMinutes * roamingCostPerMinute;

        // Total before tax
        double subtotal =
                subscriberPackageCost
                + extraCallCost
                + roamingCost;

        // 10% tax
        double tax =
                subtotal * subscriberTaxOnBill / 100;

        // Final bill
        double totalBill = subtotal + tax;

        System.out.println("\n========================================");
        System.out.println("          MOBILE BILL SUMMARY");
        System.out.println("========================================");

        System.out.printf("Package Cost             : Rs. %.2f%n",
                subscriberPackageCost);

        System.out.printf("Extra Call Cost          : Rs. %.2f%n",
                extraCallCost);

        System.out.printf("Roaming Cost             : Rs. %.2f%n",
                roamingCost);

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