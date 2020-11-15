package id.tabungan;
/**
 * NAMA                 : Rendy Dermawan
 * KELAS                : IF1
 * NIM                  : 10119030
 * Deskripsi Program    : Program berisi Class Tabungan.
 */
public class Tabungan {
   private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah) {
        return saldo - jumlah; 
    }
}
