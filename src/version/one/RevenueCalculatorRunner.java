package version.one;

public class RevenueCalculatorRunner {
    public static void main(String[] args) {
        ClientEngagement clientEngagement =
                new ClientEngagement("PluralSight", 300, 15_000);

        // Types of Engagement:
        // Hourly
        // FixedFee
        // RoyalityPercentage

        System.out.println(clientEngagement);

        final Double hourlyPrice = RevenueCalculator.price("Hourly", clientEngagement);
        System.out.println("hourlyPrice = " + hourlyPrice);

        final Double fixedFeePrice = RevenueCalculator.price("FixedFee", clientEngagement);
        System.out.println("fixedFeePrice = " + fixedFeePrice);

        final Double royalityPercentagePrice = RevenueCalculator.price("RoyalityPercentage", clientEngagement);
        System.out.println("royalityPercentagePrice = " + royalityPercentagePrice);
    }
}
