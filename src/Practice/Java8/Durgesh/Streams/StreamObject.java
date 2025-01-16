package Practice.Java8.Durgesh.Streams;

import java.util.stream.Stream;

public class StreamObject
{
    public static void main(String[] args) {

        // 1st way of creating Stream object i.e. with empty()

        Stream<Object> stram1 = Stream.empty();


        String[] name = {"Durgesh","Uttam","Ankit","Divya"};
        // 2nd way of creating Stream object i.e. with of()
        
        Stream<String> stream2 = Stream.of(name);

        stream2.forEach(i -> System.out.println(i));



    }
}
