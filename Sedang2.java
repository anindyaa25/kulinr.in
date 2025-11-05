import java.util.Scanner;

public class Sedang2 {
 public class UKLSoalSedang2 {
    static double hitungVolume(double r, double t) {
        double phi = 3.14;
        double volume = phi*r*r*t;
        return volume;
    }
     
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();
        
        double hasil = hitungVolume(r, t);

        System.out.println("Volume tabung = "+ hasil +" cm3");
    }
}   
}
