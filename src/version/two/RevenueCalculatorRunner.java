package version.two;

import version.one.ClientEngagement;

import static version.two.FixedFeeCalculator.STANDARD_FEE;
import static version.two.HourlyRateCalculator.STANDARD_HOURLY_RATE;

public class RevenueCalculatorRunner {
    public static void main(String[] args) {
        ClientEngagement clientEngagement =
                new ClientEngagement("PluralSight", 250, 15_000);

        // Types of Engagement:
        // Hourly
        // FixedFee
        // RoyalityPercentage

        System.out.println(clientEngagement);

        double hourlyRate = new HourlyRateCalculator(100).calculate(clientEngagement);
        System.out.println("hourlyRate = " + hourlyRate);

        double fixedFeeRate = new FixedFeeCalculator(STANDARD_FEE).calculate(clientEngagement);
        System.out.println("fixedFeeRate = " + fixedFeeRate);

        // Polymorphism
        // RevenueCalculator revenueCalculator = new HourlyRateCalculator(STANDARD_HOURLY_RATE);
        RevenueCalculator revenueCalculator = new FixedFeeCalculator(STANDARD_FEE);

        double finalPrice = revenueCalculator.calculate(clientEngagement);
        System.out.println("finalPrice = " + finalPrice);
    }
}
