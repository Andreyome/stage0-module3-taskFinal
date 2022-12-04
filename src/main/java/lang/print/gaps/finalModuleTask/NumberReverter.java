package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String result = "";
        result += number % 10;
        number = number / 10;
        result += number % 10;
        number = number / 10;
        result += number % 10;
        System.out.println(result);
    }
}
