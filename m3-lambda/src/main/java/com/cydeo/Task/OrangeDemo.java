package com.cydeo.Task;

import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class OrangeDemo {

    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<Orange>();

        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100, Color.RED));
        inventory.add(new Orange(200, Color.GREEN));
        inventory.add(new Orange(50, Color.RED));

        Predicate<Orange> orangeByWeight = orange -> orange.getWeight() > 100;
        Predicate<Orange> orangeByColor = orange -> orange.getColor().equals(Color.RED);
       // Predicate<Orange> orangeByColor = orange -> orange.getColor().equals(Color.RED) && orange.getWeight() >=100;

      //  System.out.println(filterByWeight(inventory, orangeByWeight));
        System.out.println(filterByColor(inventory, orangeByColor));

        Function<Orange, String> orangeFun = orange -> orange.getColor() + " is my color ";

        orangeMethod(inventory,orangeFun);



    }

    private static void orangeMethod(List<Orange> inventory, Function<Orange, String> orangeFun) {
        for (Orange each : inventory) {
            System.out.println(orangeFun.apply(each));

        }
    }

    private static List<Orange> filterByColor(List<Orange> inventory, Predicate<Orange> orangeByColor) {
        List<Orange> finalList = new ArrayList<>();

        for (Orange each : inventory) {
            if (orangeByColor.test(each)) {
                finalList.add(each);
            }
        }
        return finalList;
    }

    public static List<Orange> filterByWeight(List<Orange> inventory, Predicate<Orange> orangeByWeight) {

        List<Orange> finalList = new ArrayList<>();

        for (Orange each : inventory) {
            if (orangeByWeight.test(each)) {
                finalList.add(each);
            }
        }
        return finalList;


    }
}








