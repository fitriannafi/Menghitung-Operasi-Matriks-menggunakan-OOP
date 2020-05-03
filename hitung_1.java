/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriks;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class hitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int perhitungan = 2;
        do {   
        System.out.print("Perhitungan Operasi Matriks");
        System.out.println();
        System.out.println("1. Menghitung Penjumlahan Matriks");
        System.out.println("2. Menghitung Pengurangan Matriks");
        System.out.println("tekan '3' untuk berhenti!");
        System.out.println("Masukkan Pilihan Perhitungan: ");
        Scanner masukkan = new Scanner(System.in);
            perhitungan = masukkan.nextInt();
        switch(perhitungan){
            case 1:
                Matriks M = new Matriks();
                M.Penjumlahan();
            break;
            case 2:
                Matriks2 N = new Matriks2();
                N.Pengurangan();
            break;
            case 3:
                
            break;
        }
        } while (perhitungan != 3);
    }
    
}
