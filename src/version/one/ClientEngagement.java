package version.one;

public class ClientEngagement {

    private String client;
    private int hoursWorked;
    private double anticipatedRevenue;

    public ClientEngagement(String client, int hoursWorked, double anticipatedRevenue) {
        this.client = client;
        this.hoursWorked = hoursWorked;
        this.anticipatedRevenue = anticipatedRevenue;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getAnticipatedRevenue() {
        return anticipatedRevenue;
    }

    public void setAnticipatedRevenue(double anticipatedRevenue) {
        this.anticipatedRevenue = anticipatedRevenue;
    }

    @Override
    public String toString() {
        return "ClientEngagement{" +
                "client='" + client + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", anticipatedRevenue=" + anticipatedRevenue +
                '}';
    }
}
