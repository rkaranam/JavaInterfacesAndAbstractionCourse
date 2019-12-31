package version.one;

public class RevenueCalculator {

    private static final double HOURLY_RATE = 50;
    private static final double FIXED_FEE = 4500;
    private static final double ROYALITY_PERCENTAGE = 0.15;

    public static double price(String revenueMethod, ClientEngagement clientEngagement) {

        switch (revenueMethod) {

            case "Hourly":
                return HOURLY_RATE * clientEngagement.getHoursWorked();

            case "FixedFee":
                return FIXED_FEE;

            case "RoyalityPercentage":
                return (ROYALITY_PERCENTAGE * clientEngagement.getHoursWorked()) * 100;

            default:
                throw new IllegalArgumentException("Unknown Method");

        }

    }
}
