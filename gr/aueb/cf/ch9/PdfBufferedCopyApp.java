package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfBufferedCopyApp {

    public static void main(String[] args) {
        byte[] buffer = new byte[8192]; //8KB
        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime = 0.0;

        try (FileInputStream fis = new FileInputStream(("C:/tmp/dummy.pdf"));
             FileOutputStream fos = new FileOutputStream("C:/tmp/dummy-OUT.pdf")) {

            start = System.currentTimeMillis();
            while ((b = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, b);
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("The file with a size of %.1fKB (%d bytes) was copied successfully\n", (counter / 1024.0), counter);
            System.out.println("Elapsed Time: " + elapsedTime);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
