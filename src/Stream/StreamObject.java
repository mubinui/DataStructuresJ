package Stream;

import java.util.Objects;
import java.util.stream.Stream;

public class StreamObject {
    //Stream API - collection process
    //collection / group / Arrays
    public static void main(String[] args) {
        //1 -> Creating an empty Stream
        Stream<Object> empty1 = Stream.empty();
        empty1.forEach(e->{
            System.out.println(e);
        });

        // 2 -> Creating array stream
        Character [] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
        Stream<Character> characterStream= Stream.of(array);
        characterStream.forEach(x->{
            System.out.print(x+" ");
        });

        //

    }



}
