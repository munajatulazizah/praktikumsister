/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum01;

import java.io.*;
import java.net.InetAddress;

public class cekIP_nomor2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String host = "" , IP = "";
        System.out.println("Untuk ping komputer lain, pilih opsi di bawah ini:" +
                "\n1. ping menggunakan alamat host" +
                "\n2. ping menggunakan nama host\n\nPilihan anda:");
        try {
            int choice = Integer.parseInt(dataIn.readLine());
            
            if (choice==1){
                System.out.println("Masukkan alamat host:");
                IP = dataIn.readLine();

                // cek koneksi
                InetAddress ia = InetAddress.getByName(IP);
                if (ia.isReachable(3000)){
                    System.out.println("\nStatus :");
                    System.out.println(ia +" is Reachable");
                } else {
                    System.out.println("\nStatus :");
                    System.out.println(ia +" is unReachable");
                }
            } 
            else if (choice==2) {
                System.out.println("Masukkan nama host:");
                host = dataIn.readLine();

                // cek koneksi
                InetAddress ia = InetAddress.getByName(host);
                if (ia.isReachable(3000)){
                    System.out.println("\nStatus :");
                    System.out.println(ia +" is Reachable");
                } else {
                    System.out.println("\nStatus :");
                    System.out.println(ia +" is unReachable");
                }
            } 
            else {
                System.out.println("Maaf Pilihan Tidak Tersedia");
            }
        } catch (Exception e) {
        }
    }
}
