package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first, second, third;
        first = (number % 10)*100;
        second = (number % 100) - (number % 10);
        third = ((number % 1000) - (number % 100)) /100;
        System.out.println(first + second + third);
    }
}
