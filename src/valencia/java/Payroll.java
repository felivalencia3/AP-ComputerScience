package valencia.java;

import java.util.Arrays;

public class Payroll {
    private int[] itemsSold;
    private double[] wages;

    public double[] getWages() {
        return wages;
    }

    public double computeBonusTreshold() {
        int sum = 0;
        int mostSold = 0;
        int leastSold = itemsSold[0];
        for (int items : itemsSold) {
            if(items > mostSold) {
                mostSold = items;
            }
            else if(items < leastSold) {
                leastSold = items;
            }
            sum += items;
        }
        sum -= (mostSold+leastSold);

        return ((double) sum) / (itemsSold.length-2);
    }

    public void computeWages(double fixedWage, double perItemWage) {
        double multiplier = 1.0;
        for (int i = 0; i < itemsSold.length; i++) {
            if(itemsSold[i] > computeBonusTreshold()) {
                multiplier = 1.1;
            }
            wages[i] = (multiplier * (fixedWage + (itemsSold[i]*perItemWage)));
        }
    }

    public Payroll(int[] itemsSold) {
        this.itemsSold = itemsSold;
    }

    public Payroll(int[] itemsSold, double[] wages) {
        this.itemsSold = itemsSold;
        this.wages = wages;
    }

    public static void main(String[] args) {
        int[] itemsSold = {48,50,37,62,38,70,55,37,64,60};
        double[] wages = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};

        Payroll payroll = new Payroll(itemsSold, wages);
        System.out.println(payroll.computeBonusTreshold());
        payroll.computeWages(10,1.5);
        System.out.println(Arrays.toString(payroll.getWages()));
    }
}
