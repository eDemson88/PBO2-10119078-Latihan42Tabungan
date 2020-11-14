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
public class Tabungan {
    private int saldo;
    Scanner scanner = new Scanner(System.in);
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        System.out.print("Jumlah uang yang diambil: ");
        int ambil = scanner.nextInt();
        saldo = jumlah - ambil;
        System.out.println("Saldo Anda Sekaran: " + saldo);
        return saldo;
    }
}
