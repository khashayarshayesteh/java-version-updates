package com.cydeo.Task;

import com.cydeo.Apple;
import com.cydeo.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {


        ApplePredicate ap = new ApplePredicate() { //AppleHeavyPredicate class
            @Override
            public boolean test(Apple apple) {
                return false;
            }
        };

        //**********************************************************************PREDICATE**************************************************//

        Predicate<Integer>  lesserThan = i -> i<18;
        System.out.println(lesserThan.test(20));

        System.out.println("*********************Consumer***************");

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        System.out.println("***********************BiConsumer*******************");

        BiConsumer<Integer,Integer> addTwo = (x,y) ->System.out.println(x+y); //Functional Programming  AOP Reactive Programming

        addTwo.accept(1,2);

        System.out.println("***********************FUNCTION*******************");

        Function<String,String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));

        System.out.println("***********************BiFunction*******************");

        BiFunction<Integer,Integer,Integer> func = (x1,x2) -> x1+x2;
        System.out.println(func.apply(2,3));

        System.out.println("***********************Supplier*******************");

        Supplier<Double> randomValue = ()-> Math.random();
        randomValue.get();
        System.out.println(randomValue.get());











    }
}
