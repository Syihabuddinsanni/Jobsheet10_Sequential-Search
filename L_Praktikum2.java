package Pekan3;

import java.util.Scanner;

    public class L_Praktikum2 {
        public static void main(String[] args){
            int[] data = new int[] {8,90,56,90,87,76,42};
            int cari;
            boolean found = false;
            Scanner hab = new Scanner(System.in);
            
            System.out.println("Masukan datra yang ingin dicari : ");
            cari = hab.nextInt();
            for (int i = 0; i<data.length; i++){
                if (cari == data[i]);
                found = true;
                System.out.println("Data ditemukan pada indeks ke--" + i);
                
            }
     if (found != true) {
         System.err.println("Data tidak ditemukan!!!!!!!!!!");
        }
        
        
}

    }

