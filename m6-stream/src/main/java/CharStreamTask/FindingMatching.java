package CharStreamTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    public static void main(String[] args) {


        //ALL MATCH
        System.out.println("ALL MATCH");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000); // returning boolean
        System.out.println(isHealthy);

        System.out.println("ANY MATCH");
        if(DishData.getAll().stream().anyMatch((Dish::isVegetarian))){
            System.out.println("The menu is vegetarian friendly");
        }


        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("FIND FIRST");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //PARALLEL STREAMS (Async) //Multi Threading

        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        System.out.println((IntStream.range(0,100).parallel().findAny()).getAsInt()); //I just  added

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");


        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findAny.get());
        System.out.println(findFirst.get());

        //MIN AND MAX
        System.out.println("Min");

        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        System.out.println("Max");
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax);

        //REDUCE
        System.out.println("Reduce");

        Optional<Integer> calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b)->a+b);

        System.out.println(calTotal.get());

        //COUNT

        System.out.println("Count");
       Long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);

        // COLLECTORS
        System.out.println("Collector");














    }

}