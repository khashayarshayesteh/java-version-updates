package com.cydeo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {


        List<Apple> inventory = new ArrayList<Apple>();

        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        inventory.forEach(apple -> System.out.println(apple));

        AppleHeavyPreticate abc = new AppleHeavyPreticate();
        List<Apple> heavyApple = filterApples(inventory,abc);
        System.out.println("heavyApple = " + heavyApple);


    //    List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPreticate());
    //    System.out.println(heavyApple);

        List<Apple> GreenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println("GreenApple = " + GreenApple);


        // try to do it with Lambda way:

      //  ApplePredicate weightApple = (Apple apple) -> apple.getWeight()>200;
        ApplePredicate weightApple = apple -> apple.getWeight()>200;  // no need apple type any more.
        filterApples(inventory,weightApple);

// -> convert to ready functional interface also orange test too : Home work

//        Predicate<Apple> appleWeight = apple -> apple.getWeight()>200;
//        System.out.println(filterApples(inventory, appleWeight));
//
//        Predicate<Apple> appleColor = apple -> apple.getColor().equals(Color.GREEN);
//        System.out.println(filterApples(inventory,appleColor));


    }

    private static List<Apple> filterApples(List<Apple> inventory  ,ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            result.add(apple);

        }

        return result;
    }



}
