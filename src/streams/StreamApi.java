package src.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

        List<String>names= Arrays.asList("apple","banana","mango");
        //map
        names.stream().map(String :: toUpperCase).forEach(System.out::println);
        //filter
        names.stream().filter(name -> name.startsWith("a"))
                .forEach(System.out::println);

        //types of stream generator

        names.stream().forEach(System.out::println);


        //array stream
        int [] numbers={2,1,4,3,6,5,3,4,9,9,6};
        Arrays.stream(numbers).sorted().forEach(System.out::println);

        List<Integer>numberList=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        //1.Filter out even number from List of number (numberlist)
        List<Integer>evennumber=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        evennumber.forEach(System.out::println);



    }
}
