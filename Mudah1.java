import java.util.Scanner;

public class Mudah1 {
    Scanner inputan = new Scanner(System.in);
        
        int VolumePK, PanjangPK, LebarPK, TinggiPK;
        System.outprintln("Masukkan panjang : ");
        PanjangPK = inputan.nextInt();
        System.outprintln("Masukkan Lebar : ");
        LebarPK = inputan.nextInt();
        System.out.println("Masukkan Tinggi : ");
        TinggiPK = inputan.nextInt();
        VolumePK = PanjangPK * LebarPK * TinggiPK;
         System.out.println("Hasilnya === " + VolumePK);

}

