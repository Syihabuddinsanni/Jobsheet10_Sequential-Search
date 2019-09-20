package Pekan3;

import java.util.Scanner;

    public class L_Praktikum1 {
        public static void main(String[] args){
            
            int cari;
            boolean found = false ;
            int[] data = new int[]{29,4,10,94,96};
            Scanner hab = new Scanner(System.in);
            
            System.out.println("Masukan data yang ingin dicari : ");
            cari = hab.nextInt();
            
            for (int i = 0; i<data.length;i++){
            if (cari == data[i]){
            found = true;
            break;
            
            }
            
        }
        if (found == true) {
            System.out.println("Data ditemukan");
        }else{
            System.out.println("Data tidak ditemukan MAMPOS!!");
        }
        
    }
    
}
