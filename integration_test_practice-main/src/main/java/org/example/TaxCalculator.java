package org.example;

public class TaxCalculator {
    private Calculator calculator;

    public TaxCalculator(Calculator calculator) {  // Constructor, This allows the TaxCalculator to use the methods from the Calculator class.
        this.calculator = calculator;
    }

    public int calculateTax(int base_salary,int bonus, double taxRate) {  //Method to calculate the tax based on base salary, bonus, and tax rate.
        int gross_salary = calculator.addition(base_salary,bonus);
        return  (int)(gross_salary *taxRate);
    }
}
