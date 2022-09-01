package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStream {
    public static void main(String[] args) {
        //filtering the evens from the list using stream
        List<Integer> list1 = List.of(2,4,5,9,12,15,11,16,9,9,9);
        //filtering evens from list using stream
        List<Integer> evens = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        Stream<Integer> evens_bol = list1.stream();
        System.out.println(evens_bol.distinct().collect(Collectors.toList()));
        System.out.println(evens);

        //filtering the numbers greater than 10
        List<Integer> greaterThanTen = list1.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(greaterThanTen);

        List<String> list = List.of("Mubin","Mubox","Lukas");
        List<String> startWithM = list.stream().filter(x->x.startsWith("M")).collect(Collectors.toList());
        System.out.println(startWithM);

        // Creating object of stream





    }
}
