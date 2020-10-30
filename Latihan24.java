import java.io.*;
import java.util.Scanner;

/**
 * Latihan17
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program : Perbandingan dua buah nilai
 */
public class Latihan24 {
    public static void main(String[] args) {
        int nilai1, nilai2, hasil;
        String pilihan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Perbandingan Nilai=====");
        do {
            System.out.print("Masukkan nilai Pertama : ");
            nilai1 = scanner.nextInt();
            System.out.print("Masukkan nilai Kedua : ");
            nilai2 = scanner.nextInt();
            if (nilai1 < nilai2){
                System.out.printf("Hasil : %1$d Lebih Kecil dari %2$d%n", nilai1, nilai2);
            }
            if (nilai1 > nilai2){
                System.out.printf("Hasil : %1$d Lebih Besar dari %2$d%n", nilai1, nilai2);
            }
            if (nilai1 == nilai2){
                System.out.printf("Hasil : %1$d Sama Dengan %2$d%n", nilai1, nilai2);
            }
            System.out.print("Ulangi Aktifitas? Ya/Tidak : ");
            pilihan = scanner.next();
            System.out.println();
        } while (pilihan.equals("ya") || pilihan.equals("Ya"));
    }
}
