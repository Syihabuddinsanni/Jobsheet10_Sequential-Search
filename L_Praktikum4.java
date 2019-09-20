package Pekan3;

import java.util.Scanner;

    public class L_Praktikum4 {
        public static void main(String[] args){
            Scanner hab = new Scanner(System.in);
            String cari;
            System.out.print("Masukan sebuah kata/kalimat bosque ;v : ");
                cari = hab.nextLine();
                
                int a = 0;
                for(int i = 0; i < cari.length(); i++){
                    if (cari.charAt(i) == 'a') {
                    a++;
                }
                }
                System.out.println("Jumlah huruf a pada kalimat diatas adalah : " + a);
                
        
        } 
    
}
