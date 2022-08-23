package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


     // Predicate<Integer> pred =  (p) -> p%2 == 0 ?true:false;

        Calculate sum = (x,y) -> System.out.println(x+y);
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);

        //Refrence to a Static Method
        Calculate s2 = Calculator::findSum;
        s2.calculate(10,20);

        //Refrence to a instance method
        Calculator obj = new Calculator();
        Calculate s3 = obj :: findMultiply;

        Calculate s4 = new Calculator() :: findMultiply;; //we can use this instead of lines 19 & 20


        BiFunction<String,Integer,String> function = (str,i) -> str.substring(i);
        BiFunction<String,Integer,String> function2 = String :: substring;

        Function<Integer,Double> b = new MyClass()::method;
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 =  System.out::println;




    }
}
