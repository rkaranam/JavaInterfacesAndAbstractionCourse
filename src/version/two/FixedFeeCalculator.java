package version.two;

import version.one.ClientEngagement;

public class FixedFeeCalculator extends RevenueCalculator {

    public static final double STANDARD_FEE = 1000;

    private static double customisedFee;

    public FixedFeeCalculator(double fee) {
        this.customisedFee = fee;
    }

    @Override
    public double calculate(ClientEngagement clientEngagement) {
        return customisedFee;
    }
}
