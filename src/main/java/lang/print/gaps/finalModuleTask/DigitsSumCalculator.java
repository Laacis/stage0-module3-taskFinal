package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first, second, third, fourth;

        first = number % 10;
        second = (number % 100) /10;
        third = (number % 1000) /100;
        fourth = (number % 10000) / 1000;

        System.out.println(first+ second+third+fourth);
    }
}
