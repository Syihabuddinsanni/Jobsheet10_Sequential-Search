package Pekan3;


    public class L_Praktikum3 {
        public static void main(String[] args){
            int min = 0;
            int[] data = new int[] {-21,90,82,190,-83,74};
            
            System.out.println("Data pada array : ");
            for (int i = 0; i <data.length; i++){
                System.out.print(data[i]+"\t");
                if(data[i] < min ) {
                    min = data[i]; 
                }
            }
            System.out.println("\n Data terkecil dari array adalah " + min );
        }
    
}
