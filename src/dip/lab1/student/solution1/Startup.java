package dip.lab1.student.solution1;

import java.text.NumberFormat;

public class Startup {
    public static void main(String[] args) {
        HourlyEmployee emp1 = new HourlyEmployee(10.50, 2020);
        SalariedEmployee emp2 = new SalariedEmployee(45000, 1250);
        SalariedEmployee emp3 = new SalariedEmployee(90000,0);

        HRService hr = new HRService();

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output..
        System.out.println("Employee 1 annual compensation: " +
                nf.format(hr.getAnnualCompensationForEmployee(emp1)));
        System.out.println("Employee 2 annual compensation: " +
                nf.format(hr.getAnnualCompensationForEmployee(emp2)));
        System.out.println("Employee 3 annual compensation: " +
                nf.format(hr.getAnnualCompensationForEmployee(emp3)));
    }
}
