package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");
        int positionOfSecondo = cf.indexOf("o", 2);
        int lastPostionOfo = cf.lastIndexOf("o");

        String cf2 = cf.substring(1); // "oding Factory"
        String slice = cf.substring(1, 3); // "od"
        System.out.println(cf2);
        System.out.println(slice);
    }
}
