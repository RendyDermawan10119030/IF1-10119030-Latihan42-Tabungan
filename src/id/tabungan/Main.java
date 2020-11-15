package id.tabungan;
import java.util.Scanner;
/**
 * NAMA                 : Rendy Dermawan
 * KELAS                : IF1
 * NIM                  : 10119030
 * Deskripsi Program    : Program Perhitungan Saldo Utama menggunakan metode 
 * pendekatan berbasis objek.
 */
public class Main {
    public static void main (String[] args){ 
    Scanner input = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal : ");
        Tabungan tabungan1 = new Tabungan(input.nextInt());
        
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda Sekarang : " + tabungan1.ambilUang(input.nextInt()));
    }
}
