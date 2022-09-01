package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //filter (Predicate -> boolean value)
            //predicate-> boolean valued function 
            //lambda_expression e->{multiline returns boolean}  e->e!=0 
            // it will perform operation only if the returning value is true 
        
           
        
        
        //map(Function ) returns value  
                // each element operation 

        List<String > names = List.of("Mubin", "Kumbin", "Abin", "Bbin", "Cbin", "Cubox", "Cubar", "Cuca");
        List<String> startsWithC = names.stream().filter(i->i.startsWith("C")).collect(Collectors.toList());
        System.out.println(startsWithC);
        
        
        // map 
        List<Integer> numbers = List.of(2,9,5,10,7,8,9);
        List<Integer> collect = numbers.stream().map(i ->(int) Math.pow(i, 2)).collect(Collectors.toList());
        System.out.println(collect);
        collect.stream().forEach(System.out::println);

        //sort
        numbers.stream().sorted().forEach(System.out::println);
        System.out.println("-------------------------------->");
        // min
        Integer integer = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(integer);

    }
}
