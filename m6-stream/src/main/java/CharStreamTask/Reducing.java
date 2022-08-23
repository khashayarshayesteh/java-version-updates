package CharStreamTask;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);
        int sum =0;
        for (Integer number : numbers) {
            sum = sum+number;

        }
        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);
        Optional<Integer> result2 = numbers.stream().reduce((a,b)-> a+b);
        System.out.println(result2.get());

        DishData.getAll().stream()
                .map(Dish::getCalories)
              //  .reduce((a,b)->a+b)
                .reduce(Integer::sum)
                .get();


       Optional<Integer> min =  numbers.stream().reduce(Integer::min);
        Optional<Integer> max =  numbers.stream().reduce(Integer::max);
        Optional<Integer> Sum =  numbers.stream().reduce(Integer::sum);

        System.out.println("Sum = " + Sum.get());
        System.out.println("max = " + max.get());
        System.out.println("min = " + min.get());




    }
}
