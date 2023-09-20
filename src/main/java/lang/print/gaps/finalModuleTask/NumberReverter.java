package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int firstDigit = number / 100; // Extract the first digit
        int secondDigit = (number % 100) / 10; // Extract the second digit
        int thirdDigit = number % 10; // Extract the third digit

        int reversedNumber = (thirdDigit * 100) + (secondDigit * 10) + firstDigit; // Reassemble the digits

        System.out.println(reversedNumber);
    }
}