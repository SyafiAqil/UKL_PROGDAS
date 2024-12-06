import java.util.Scanner;

public class mudah1 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int jarMin , harga1 , harga2 , harga3 , volumeMinim; 
    jarMin = 10;
    harga1 = 4250;
    harga2 = 6000;
    harga3 = 50000;
    volumeMinim = 100;

        System.out.println("Masukkan berat paket (dalam KG)");
        int BeratBarang = input.nextInt();
        System.out.println("Masukkan Jarak tempuh (dalam KM)");
        int JarTem = input.nextInt();
        System.out.println("Masukkan tinggi barang (dalam CM)");
        int t = input.nextInt();
        System.out.println("Masukkan lebar barang (dalam CM)");
        int l = input.nextInt();
        System.out.println("Masukkan panjang paket (dalam CM)");
        int p = input.nextInt();

    int hivolume = p*l*t;


        if (JarTem <= jarMin){
            int result1 = harga1 * BeratBarang;
                if(hivolume > volumeMinim ){
                    int FinalResult = result1 + harga3;
                    System.out.println("Biaya yang harus dibayar = Rp." + FinalResult);
                }else{
                    System.out.println("Biaya yang harus dibayar RP." +result1);
                }
                
        }else if(JarTem >= jarMin){
            int result2 = harga2 * BeratBarang;
                if(hivolume > volumeMinim ){
                int FinalResult = result2 + harga3;
                System.out.println("Biaya yang harus dibayar = Rp." + FinalResult);
                }else{
                System.out.println("Biaya yang harus dibayar RP." +result2);
                }
        }

        
  }

}