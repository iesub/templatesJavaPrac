package mirea.practice.prac1;

import java.lang.reflect.Array;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Predicate<Double> isExponentOfTwo = x -> (Math.log(x)/Math.log(2))%1==0;

        System.out.println(isExponentOfTwo.test(2.0));
        System.out.println(isExponentOfTwo.test(3.0));
        System.out.println(isExponentOfTwo.test(5.0));
        System.out.println(isExponentOfTwo.test(64.0));
        System.out.println(isExponentOfTwo.test(0.0));
        System.out.println(isExponentOfTwo.test(0.5));

        Function<Integer[], String> buildNumber = (Integer[] x) -> {String y = ""; for(int num:x){if (y.indexOf(String.valueOf(num))==-1){y = y + String.valueOf(num);}}return y;};

        Integer[] x = {1, 2, 3, 1};
        System.out.println(buildNumber.apply(x));
    }

}
