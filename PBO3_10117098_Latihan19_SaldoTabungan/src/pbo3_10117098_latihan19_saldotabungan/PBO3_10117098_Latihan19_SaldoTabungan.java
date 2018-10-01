/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan19_saldotabungan;

/**
 *
 * @author  
 * Nama     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program ini berisi program untuk menghitung saldo 
 *                     tabungan yang selalu bertambah tiap bulan
 */
public class PBO3_10117098_Latihan19_SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldoAwal;
        int bunga; // persen bunga
        int jumlahBunga; 
        int lamaBulan;
        
        saldoAwal = 2500000;
        bunga = 15;
        lamaBulan = 6;

        for (int i = 1; i <= lamaBulan; i++) {

            jumlahBunga = saldoAwal*bunga/100; 
            saldoAwal += jumlahBunga;

            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(","
                    + "", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
        }
    
    }
}
