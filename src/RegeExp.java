public class RegeExp {

    public static void main(String[] args) {
        String s= "Aster11 222 444 555";

        String s2 = s.substring(s.indexOf(" "));
        String s3= "111 ";
        String s4= s2.substring(0,s2.indexOf(" "));
        System.out.println(s3.matches("\\d+\\s+"));


    }


}
