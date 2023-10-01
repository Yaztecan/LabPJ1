package EX2;

import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void  main(String[] args) throws IOException {
        String line;
        int s = 0, k = 0, min = 9999, max = -9999, nr;
        String fileName = "C:\\Users\\Christian\\IdeaProjects\\LabPJ1\\src\\EX2\\in.txt";
        BufferedReader fluxIn;
        fluxIn = new BufferedReader(new InputStreamReader((new FileInputStream(fileName))));
        while ((line = fluxIn.readLine())!= null){
           nr = Integer.parseInt(line);
           s += nr;
           k++;
           if (nr>max) max = nr;
           if (nr<min) min = nr;
        }
        float ma = 0;
        ma = (float) s / k;

        fileName = "C:\\Users\\Christian\\IdeaProjects\\LabPJ1\\src\\EX2\\out.txt";
        PrintStream flux_out = new PrintStream(fileName);
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Suma: "+s);
        System.out.println("Media: "+ma);
        flux_out.println("Max: "+max);
        flux_out.println("Min: "+min);
        flux_out.println("Suma: "+s);
        flux_out.println("Media: "+ma);
    }



}
