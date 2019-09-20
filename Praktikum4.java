package Jobsheet10;

import java.util.Scanner;

    public class Praktikum4 {
        public static void main(String[] args){
           
            Scanner hab = new Scanner(System.in);
            
            int a = 0,b = 0,c = 0,d = 0,e = 0;
            String sy,hb = new String();
           
            System.out.println("Masukkan kalimat/kata : ");
             hb = hab.nextLine();
            char tchar[] = new char[hb.length()];
        sy = hb.toLowerCase();
        for(int x=0; x<hb.length(); x++){
            if(sy.charAt(x)== 'a'){
                a++;
            }
             if(sy.charAt(x)== 'i'){
                b++;
             }
             if(sy.charAt(x)== 'u'){
                c++;
             }
             if(sy.charAt(x)== 'e'){
                d++;
             }
             if(sy.charAt(x)== 'o'){
                e++;
          
             }
        }
              System.out.println("Jumlah huruf a = "+ a);
                System.out.println("Jumlah huruf i = "+ b);
                System.out.println("Jumlah huruf u = "+ c);
                System.out.println("Jumlah huruf e = "+ d);
                System.out.println("Jumlah huruf o = "+ e);
                System.out.println("Jumlah huruf vokal = "+ (a+b+c+d+e));
        }
    }
