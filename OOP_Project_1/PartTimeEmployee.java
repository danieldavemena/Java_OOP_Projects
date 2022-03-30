public class PartTimeEmployee {

    private double ratePerHour;
    private int hoursWorked;
    private double wage;

    // Calculates the Wage
    public void setWage(double rate, int hour) {
        this.ratePerHour = rate;
        this.hoursWorked = hour;
        this.wage = ratePerHour * hoursWorked;
    }

    // Returns the Wage
    public double getWage() {
        return wage;
    }
    
}
