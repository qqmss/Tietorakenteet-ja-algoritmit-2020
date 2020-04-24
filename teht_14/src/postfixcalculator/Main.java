package postfixcalculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        useCalculator(new String[] {"3", "4", "+", "5", "2", "/", "*"}); //17.5
        useCalculator(new String[] {"-100", "-1", "*", "2", "2", "-", "+"}); //100
        useCalculator(new String[] {"2", "2", "2", "/", "/", "2", "-"}); //0
        useCalculator(new String[] {"3", "4", "2", "*", "1", "5", "-", "2", "3", "^", "^", "/", "+"}); //3.00012207031
        useCalculator(new String[] {"/", "a", "3"});
    }

    private static void useCalculator(String[] strings){
        try {
            System.out.println(Arrays.toString(strings));
            double v = PostfixCalculator.evaluate(strings);
            System.out.println(v);
        } catch (IllegalArgumentException ex){
            System.out.println("Syntax Error");
        }
    }
}
