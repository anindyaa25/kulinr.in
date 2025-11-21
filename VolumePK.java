import java.util.Scanner;


import java.util.Scanner;

public class VolumePK {

    // Fungsi untuk menghitung volume (dengan parameter)
    static int hitungVolume(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.println("Masukkan Panjang : ");
        int PanjangPK = inputan.nextInt();

        System.out.println("Masukkan Lebar : ");
        int LebarPK = inputan.nextInt();

        System.out.println("Masukkan Tinggi : ");
        int TinggiPK = inputan.nextInt();

        // Memanggil fungsi dan menyimpan hasilnya ke variabel
        int VolumePK = hitungVolume(PanjangPK, LebarPK, TinggiPK);

        System.out.println("Hasil Volume = " + VolumePK);
    }
}
