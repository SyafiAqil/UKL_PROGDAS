import java.util.Scanner;
public class sulit1 {
    public static void main(String[] args) {
       
   Scanner input = new Scanner (System.in);
   System.out.println("masukkan jumlah siswa ");
   int JumlahSiswa = input.nextInt();

   int TotalNilai = 0;

   for (int i = 1; i <= JumlahSiswa; ++i) {
    System.out.println("masukkan nilai siswa ke " + i + " :");
    int NilaiSiswa = input.nextInt();
    TotalNilai = TotalNilai + NilaiSiswa;
   }

   double RataRata = TotalNilai / JumlahSiswa;
   System.out.println("rata rata dari bilangan tersebut adalah " + RataRata);


    
    }
}