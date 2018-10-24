package dip.lab2.student.solution1;

import java.text.NumberFormat;

public class Startup {
    public static void main(String[] args) {
        TipCalculator goodBagTip = new BaggageServiceTipCalculator(TipCalculator.ServiceQuality.GOOD, 5);
        TipCalculator goodFoodTip = new FoodServiceTipCalculator(TipCalculator.ServiceQuality.GOOD, 90.00);
        TipCalculator fairBagTip = new BaggageServiceTipCalculator(TipCalculator.ServiceQuality.FAIR, 4);
        TipCalculator fairFoodTip = new FoodServiceTipCalculator(TipCalculator.ServiceQuality.FAIR, 75.00);
        TipCalculator poorBagTip = new BaggageServiceTipCalculator(TipCalculator.ServiceQuality.POOR, 1);
        TipCalculator poorFoodTip = new FoodServiceTipCalculator(TipCalculator.ServiceQuality.POOR, 120.00);

        TipCalculatorService tcs = new TipCalculatorService();

        TipCalculator[] tipCalculators = { goodBagTip, goodFoodTip, fairBagTip, fairFoodTip, poorBagTip, poorFoodTip };

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        for (TipCalculator t : tipCalculators) {
            System.out.println(nf.format(tcs.getTipForService(t)));
        }
    }
}
