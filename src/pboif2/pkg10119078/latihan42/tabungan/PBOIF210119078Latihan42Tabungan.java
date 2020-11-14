/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan42.tabungan;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tabungan = new Tabungan(0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Penarikan Uang=====");
        System.out.print("Masukan Saldo Awal: ");
        int awal = scanner.nextInt();
        
        tabungan.ambilUang(awal);
        
        
    }
    
}
