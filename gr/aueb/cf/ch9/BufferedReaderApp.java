package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/bf-read.txt"))) {
            String line = "";
//            String line1 = "";
//            String line2 = "";
//            String line3 = "";
//            String line4 = "";
//
//            line1 = bf.readLine();
//            line2 = bf.readLine();
//            line3 = bf.readLine();
//            line4 = bf.readLine();
//
//            System.out.println(line1);
//            System.out.println(line2);
//            System.out.println(line3);
//            System.out.println(line4);

            while (( line = bf.readLine() ) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(sb);
    }
}
