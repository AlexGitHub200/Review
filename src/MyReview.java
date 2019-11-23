import com.sun.org.apache.xpath.internal.functions.Function3Args;
import com.sun.tracing.dtrace.FunctionAttributes;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyReview {




    public static void main(String[] args) {


        System.out.println("hello alex");
        BiFunction <Integer, Integer, Integer> add = (x, y) -> x + y;


        int a = 5;
        //  System.out.println(add.apply(a,a));

        //  IntStream.range(1,5).sorted().forEach(System.out::print);

        //Given unsorted array and a number K. Find 2 numbers such that sum is K.

        List <Integer> nums = Arrays.asList(1, 22, 5, 6, 23, 3, 7, 8, 2);
        new MyReview().findTheNums(nums, 24);


    }

    private void findTheNums(List <Integer> list, final int k) {

        //list.stream().filter(x -> x > 7).forEach(System.out::println);


        BiPredicate <Integer, Integer> kun = (x, y) -> x + y == k;

        for (int i : list) {
            //TreeSet <Integer>
            Optional <Integer> first = list.stream().filter(x -> kun.test(x, i)).findFirst();

           // if (list.stream().peek(System.out::println).anyMatch(x -> kun.test(x, i))) {
                System.out.println("x="+first.get()+", y="+i);
                return;
          //  }

            // collect.stream().forEach(System.out::println);
            // integerMap.forEach((x,y)-> System.out.println("x="+x+", y="+y));


        }


    }

    private List findTheNumsSimple(List <Integer> list, int k) {
        List <Integer> res = new ArrayList <>();
        for (int i : list) {
            for (int z : list) {

                if (i + z == k) {
                    System.out.println("i=" + i + " , z=" + z);
                    res.add(i);
                    res.add(z);
                    return res;
                }
            }
        }
        return null;
    }
}
