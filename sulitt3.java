import java.util.Arrays;
import java.util.Scanner;

 public class sulitt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan jumlah Data didalam array: ");
        int maksimal = input.nextInt();
        int[] arr = new int[maksimal];
        for (int i = 0; i < maksimal; i++) {
            System.out.println("masukan nilai array ke "+ (i + 1));
            arr [i]= input.nextInt();
        }
        Arrays.sort(arr);

        int count = 1;
        int pre = arr[0];
        for (int n = 1; n < arr.length; n++) {
            if (arr[n] == pre) {
                count++;
            } else {
                System.out.println(pre + " muncul " + count + " kali");
                count = 1;
                pre = arr[n];
            }
        }
     
        System.out.println(pre + " muncul " + count + " kali");
    }
    }