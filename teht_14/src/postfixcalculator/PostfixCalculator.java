package postfixcalculator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class PostfixCalculator {

    public static double evaluate(String[] in) {
        Deque<Double> doubles = new ArrayDeque<>();
        try {
            for (String s : in) {
                double i;
                switch (s) {
                    case "+":
                        doubles.push(doubles.pop() + doubles.pop());
                        break;
                    case "-":
                        i = doubles.pop();
                        doubles.push(doubles.pop() - i);
                        break;
                    case "*":
                        doubles.push(doubles.pop() * doubles.pop());
                        break;
                    case "/":
                        i = doubles.pop();
                        doubles.push(doubles.pop() / i);
                        break;
                    case "^":
                        i = doubles.pop();
                        doubles.push(Math.pow(doubles.pop(), i));
                        break;
                    default:
                        doubles.push(Double.parseDouble(s));
                }
            }
        } catch (NoSuchElementException | NumberFormatException ex) {
            throw new IllegalArgumentException();
        }
        if (doubles.size() != 1) {
            throw new IllegalArgumentException();
        }
        return doubles.pop();
    }
}
