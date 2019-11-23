import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AmazonStringTest {

    Comparator<String> comparator = (s1,s2)-> s1.length()-s2.length();

    Comparator<String> comparator2 = (s1,s2)-> s1.substring(s1.indexOf(" ")).length()-s2.substring(s1.indexOf(" ")).length();

    Comparator<String> comparator3 = (s1,s2)-> s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" ")));

    Comparator<String> comparator4 = (s1,s2)-> {

        String sub1=s1.substring(s1.indexOf(" "));
        String sub2 = s2.substring(s2.indexOf(" "));
        //String sub2=s2.substring();

        //System.out.println(sub1.substring(0,3));
        //System.out.println(sub1.substring(0,3).trim().matches("\\d+"));

       if(sub1.substring(0,3).trim().matches("\\d+" ) ){
           return 0;
       }


        return sub1.compareTo(sub2);
    };


    public static void main(String[] args) {

        List <String> stringList = Arrays.asList("123ss wrt opa", "12667rt name ort", "54646sffs 111 333 222","12667rt name aaa");

        List list = new AmazonStringTest().FindShortList(stringList);
        list.stream().forEach(System.out::println);
    }
    public List FindShortList(List <String> orders){


    List <String> list = orders.stream().sorted(comparator4).collect(Collectors.toList());

    return  list;

    }


}




