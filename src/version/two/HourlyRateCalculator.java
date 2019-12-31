package version.two;

import version.one.ClientEngagement;

public class HourlyRateCalculator extends RevenueCalculator {

    public static final double STANDARD_HOURLY_RATE = 50;

    private static double hourlyRate;

    public HourlyRateCalculator(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculate(ClientEngagement clientEngagement) {
        return hourlyRate * clientEngagement.getHoursWorked();
    }
}
