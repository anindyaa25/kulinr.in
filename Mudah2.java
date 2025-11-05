import java.util.Scanner;

public class Mudah2 {{
    Scanner masukkan = new Scanner(System.in);
        int bilangan1;
        System.out.print("Masukkan bilangan : ");
        bilangan1 = masukkan.nextInt();
        if (bilangan1 % 2 == 0) {
            System.out.println("Bilangan genap");
            System.out.println("Bilangan ini bisa dibagi 2");
        } else {
            System.out.println("Bilangan ganjil");
        }
    }   
}
