package Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamOne {
    public static void main(String[] args) {
        //Create a list and filter the even numbers from the list
//        ArrayList<Integer> list = (ArrayList<Integer>) List.of(2,4,5,9,12,15,11,16);
        List<Integer> list1 = List.of(2,4,5,9,12,15,11,16);
        List <Integer> evens = new ArrayList<>();
        for(int a : list1){
            if (a%2==0) evens.add(a);
        }
        System.out.println(evens);


    }
}
