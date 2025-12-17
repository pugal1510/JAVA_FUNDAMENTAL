package src.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class interviewQuestionStreamApi {
    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        //1.Filter out even number from List of number (numberlist)
        List<Integer>evennumber=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        evennumber.forEach(System.out::println);


        //2.find the max number from the list (numberList)
        Optional<Integer>maxnumber=numberList.stream().max(Comparable::compareTo);
        System.out.println("max number: "+ maxnumber.get());


        //3.Sort List in reverse order
        List<Integer>sortedNumberReverse=numberList.stream().sorted((a,b)->b-a)
                .collect(Collectors.toList());
        System.out.println(sortedNumberReverse);

        //String

        List<String>nameList=Arrays.asList("Alice","john","Charlie","Michael","clarke","cameron","Charlie","Alice","pop");

        //4.count String with Specific prefix

        Long count=nameList.stream().filter(str->str.startsWith("A")).count();
        System.out.println("string count: "+count);

        //5.Find frst non repeated character in String
        String nameString="eloise";
        Optional<Character>nonRepeatedFirstcharacher=nameString.chars().mapToObj(c->(char)c)
                .filter(s->nameString.toLowerCase().indexOf(s)==nameString.toLowerCase().lastIndexOf(s))
                .findFirst();
        System.out.println("non repeated character:"+" "+nonRepeatedFirstcharacher.get());


        //6.convert a list of String to uper case
        nameList.stream().map(String::toUpperCase).toList().forEach(System.out::print);

        //7.calculate sum of number
        int sum =numberList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("\n"+"Sum of the numberList: "+sum);

        //8 check if the any String matches condition
        boolean listmatching=nameList.stream().anyMatch(str->str.startsWith("A"));
        System.out.println("Condtion: "+listmatching);

        //9.find the duplicate element in nameList
        Map<String,Long>counttheString=nameList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<String>duplicatedElement=counttheString.entrySet().stream().filter(e->e.getValue()>1)
                .map(e->e.getKey()).collect(Collectors.toList());
                duplicatedElement.forEach(System.out::println);

        //10.Grouping String Length
        Map<Integer,List<String>>groupedListWithLength=nameList.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("GroupingString: "+groupedListWithLength);

        //11.Flatten name List
        List<List<String>>listofstudent=Arrays.asList(Arrays.asList("vinit","abhishek","anushka","Shubam"),
                Arrays.asList("Alice","Donald","Charelies","vivan"),Arrays.asList("cook","Root","Staurt","Smith"));
        List<String>flattenStrings=listofstudent.stream().flatMap(s->s.stream()).collect(Collectors.toList());
        System.out.println("without using flatmap: "+listofstudent);
        System.out.println("Using flatmap: "+flattenStrings);

        //12.Concatenate all String in list into String
        List<String>sentenlist=Arrays.asList("Stream","Api","was","introduced","in","java","8");
        String Sentence=sentenlist.stream().collect(Collectors.joining(" "));
        System.out.println("==================================");
        System.out.println(Sentence);


        //13.Find th Longest String in list
        String longstring =sentenlist.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println("Longest String in list: "+longstring);


        //14.calculate Average of number in list
        Double averageofList=numberList.stream().collect(Collectors.summarizingInt(x->x)).getAverage();
        System.out.println("avergae of number "+averageofList);


        //15.Convert List into Map
        Map<Integer,List<String>>namelistMap=nameList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("convert into map: "+namelistMap);

        //16.Find the 3rd Largest number in list
        int thirdlargest=numberList.stream().sorted((a,b)->b.compareTo(a)).skip(2).findAny().get();
        System.out.println(thirdlargest);

        //17.Detect palindrome in list
        List<String>palindrome=nameList.stream()
                .filter(str->new StringBuffer(str).reverse().toString().toUpperCase().equals(str.toUpperCase()))
                .collect(Collectors.toList());
        System.out.println("checking the palindrom: "+palindrome);

        //18.Reverse each word in String List
        List<String>reverseEachword =nameList.stream().map(str->new StringBuffer(str).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("reverse the entire sentence: "+reverseEachword);

        //19.Filter map with values greater than 10
        Map<Integer,Integer>map =new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        List<Integer>greatherthan=map.values().stream().filter(n->n>10).toList();
        System.out.println("Greater than 10: "+greatherthan);


        //20.Find Common elements in two list
        List<String>namelist2=Arrays.asList("Alice","Bob","michael");
        System.out.println("========================");
        System.out.println("find the common element ");
        nameList.stream().filter(namelist2::contains).forEach(System.out::println);
        System.out.println("========================");

        //21.sum of square of even number
        int sumofeven=numberList.stream().filter(n->n%2==0).map(n->n*n)
                .collect(Collectors.summingInt(x->x));
        System.out.println("sum of the square: "+sumofeven);

        //22.Partition of String :palindrome vs non palindrome
        Map<Boolean,List<String >> palindromeStringlist=nameList.stream().collect(Collectors.partitioningBy(n->
                new StringBuffer(n).reverse().toString().toUpperCase().equals(n.toUpperCase())));
        System.out.println("palindrome: "+palindromeStringlist);


        //23.Grouping String by first Character
        Map<Object,List<String>>groupedFirstcharacter=nameList.stream().collect(Collectors.groupingBy(str->str.charAt(0)));
        System.out.println("grouping the first Character: "+groupedFirstcharacter);

        //24 calculate the product of number in list
        int product =numberList.stream().reduce(1,(a,b)->a * b);
        System.out.println("Product: "+product);

        //25.convert map into list with key == value of String
        map.entrySet().stream().map(e->e.getKey()).collect(Collectors.toList()).forEach(System.out::println);







    }
}
