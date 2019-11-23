import java.security.PublicKey;
import java.util.*;

public class AmazonIntegerTest {


    public static void main(String[] args) {

        List<List <Integer>> inlist = new AmazonIntegerTest().CreateListin();
        List<List <Integer>> outlist =new AmazonIntegerTest().CreateListout();
        List <List <Integer>> finalResult = new AmazonIntegerTest().FindBestRoot(inlist, outlist, 7000);
        finalResult.stream().forEach(System.out::println);

    }


    public List<List <Integer>> FindBestRoot(List<List<Integer>> in,List<List<Integer>> out, int maxKm){
        Map<Integer,List<Integer>> resMap= new TreeMap<>();
        for(List <Integer> n:in) {
            for (List <Integer> o : out){
                if(n.get(1)+o.get(1)<=maxKm){
                    List<Integer> point= Arrays.asList(n.get(0),o.get(0));

                    resMap.put(n.get(1)+o.get(1),point);


                }
            }
        }

       // Set <Map.Entry <Integer, List <Integer>>> entries = resMap.entrySet();
        List<List <Integer>> list = new ArrayList<>(resMap.values());


        return list;
    }

    private List<List <Integer>> CreateListin() {

        List <Integer> integers = Arrays.asList(1, 5000);
        List <Integer> integers1 = Arrays.asList(2, 3000);

        List <List <Integer>> inbound = new ArrayList <>();

        inbound.add(integers);
        inbound.add(integers1);


        return inbound;

    }

    private List<List <Integer>> CreateListout() {

        List <Integer> integers = Arrays.asList(1, 4000);
        List <Integer> integers1 = Arrays.asList(3, 3000);

        List <List <Integer>> inbound = new ArrayList <>();

        inbound.add(integers);
        inbound.add(integers1);


        return inbound;

    }


}
