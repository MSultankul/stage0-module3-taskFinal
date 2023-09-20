package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        // Extract individual digits
        int thousands = number / 1000;
        int hundreds = (number % 1000) / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        // Calculate the sum
        int sum = thousands + hundreds + tens + units;

        System.out.println("Sum of digits: " + sum);
    }
}