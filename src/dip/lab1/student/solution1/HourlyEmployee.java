package dip.lab1.student.solution1;

public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    /*
    since there is no overtime pay specified, the most an HourlyEmployee could work would need to be
    52 full-time (40-hour) weeks, or 2080 hours
    */
    public void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 2080) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }

    @Override
    public double getAnnualWages() {
        return  hourlyRate * totalHrsForYear;
    }
}
