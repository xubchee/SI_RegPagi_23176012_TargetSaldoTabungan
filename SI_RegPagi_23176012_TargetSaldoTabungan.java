/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pertemuan6;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *  Nama      : MOHAMMAD FAJAR SUBECHI
 *  NIM       : 23176012
 *  Prodi     : Sistem Infprmasi
 *  Deskripsi : program ini untuk menghitung saldo tabungan dalam waktu tertentu
 * @author ACER
 */
public class SI_RegPagi_23176012_TargetSaldoTabungan {
public static void main(String[] args) {
        int saldoAwal, bungaPerBulan, saldoTarget, bulan;
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saldo awal: ");
        saldoAwal = scanner.nextInt();
        System.out.print("Bunga per bulan (%): ");
        bungaPerBulan = scanner.nextInt();
        System.out.print("Saldo target: "); 
        saldoTarget = scanner.nextInt();
        
        NumberFormat formatter = new DecimalFormat("###,###");
        // Menghitung lama tabungan
        bulan = (saldoTarget - saldoAwal) / (saldoAwal * bungaPerBulan / 100);

        // Mencetak output
        System.out.println("Lama tabungan untuk mencapai saldo target adalah " + bulan + " bulan.");

        // Mencetak saldo tabungan setiap bulan
        for (int i = 1; i <= bulan; i++) {
            saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan / 100);
            String formatSaldo = formatter.format(saldoAwal).replace(",", ".");
            System.out.println("Saldo di bulan ke-" + i + " Rp. " + formatSaldo);
        }
    }   
}
