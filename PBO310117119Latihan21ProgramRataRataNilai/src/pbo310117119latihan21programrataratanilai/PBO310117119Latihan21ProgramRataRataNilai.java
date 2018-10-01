/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan21programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S 
 * Kelas : IF-3 / PBO-3 
 * Nim : 10117119 
 * Deskripsi : Program ini menghitung rata rata nilai mahasiswa
 */
public class PBO310117119Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        int nilai[];
        double na = 0;
        double rata;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        N = scanner.nextInt();
        
        nilai = new int[N];
                
        for (int i = 0; i <= N-1; i++) {
            System.out.print("Nilai Mahasiswa Ke- "+(i+1)+" : ");
            nilai[i]=scanner.nextInt();
            
        }
        for (int j = 0; j <= N-1; j++) {
            na = na + nilai[j];
            
        }
        rata=na/N;
        
        
        System.out.println("Maka Rata-rata Nilai adalah "+rata);
        
      
    }

}
