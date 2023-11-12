package JavaSamples;

public class TrimString {
    public static void main(String[] args) {
        String s="     hi good morning        ";
        System.out.println(s.trim());
       // s.replaceAll("i","s");
        System.out.println(s.replaceAll("i",""));
        int k=1234;
        System.out.println(String.valueOf(k).substring(3));
    }

}
