package EX1;

import java.util.Scanner;

public class MainApp {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("L=");
        int lungime = scanner.nextInt();
        System.out.print("l=");
        int latime = scanner.nextInt();

        System.out.println("Perimetru= "+ (lungime*2+latime*2));
        System.out.println("Aria= "+ (lungime * latime));


    }
}
