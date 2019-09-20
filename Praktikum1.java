package Jobsheet10;


import java.util.Scanner;

    public class Praktikum1 {
        public static void main(String[] args){
            
       
            Scanner hab =  new Scanner(System.in);
            int cari;
            int angka =0;
            
            
            int data []  = new int[]{74,98,72,74,72,90,81,72};
            System.out.println("Data pada array : ");
             
             for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
             }
             System.out.println("\n");
             System.out.println("Masukin Nilai yang pengen dicari : ");
             cari = hab.nextInt();
             for (int x = 0; x < data.length; x++) {
                if (cari == data[x]) {
                angka++;
                
                
               }     
           
        }
            if (angka == 0) {
             System.err.println("Maap bro data tidak ditemukan!!");

        }         else
                 System.out.println("Data ditemukan sebanyak : " + angka + "kali");
             }
        }
    
    
         
          
         
         

            
         
       
    
   
      
    
        
    

      