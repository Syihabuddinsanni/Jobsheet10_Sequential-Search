package Jobsheet10;

    public class Praktikum3 {
        public static void main(String[] args) {
            int[] data = new int[]{92, 98, 76, 72, 84, 101, 39};
        
            System.out.print("Nilai pada array : ");
             for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
             System.out.println("\n");
             System.out.println("Nilai kelipatan 3 adalah : ");
              
             for (int x = 0; x < data.length; x++) {
                if (data[x] % 3 == 0) {
                System.out.print(data[x] + "  ");
    
}
    }
        }
    }
