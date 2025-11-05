import java.util.Scanner;

public class Sulit1 {
public class UKLSoalSulit1 {
    static double hitungRataRata(double[] nilai, int jumlahSiswa) {
        double total = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            total += nilai[i];
        }
        return total / jumlahSiswa;
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        double[] nilai = new double[jumlahSiswa];

        // Input nilai setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }

        // Panggil fungsi untuk menghitung rata-rata
        double rataRata = hitungRataRata(nilai, jumlahSiswa);

        // Cetak hasil
        System.out.printf("\nNilai rata-rata dari %d siswa adalah: %.2f\n", jumlahSiswa, rataRata);
    
    }
}    

}
