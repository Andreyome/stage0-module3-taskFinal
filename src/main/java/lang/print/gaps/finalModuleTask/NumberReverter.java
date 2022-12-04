package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String final = "";
        final += number % 10;
        number = number / 10;
        final += number % 10;
        number = number / 10;
        final += number % 10;
        System.out.println(final);
    }
}
