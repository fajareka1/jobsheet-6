import java.util.Scanner;

public class Pemilihan2Percobaan104 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        // Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan Tahun : ");
        int tahun = sc1.nextInt();
        boolean is;

        if(((tahun % 4) == 0 && (tahun % 100) != 0) || ((tahun % 4) == 0 && (tahun % 400) == 0)){
            is = true;
        }else{
            is = false;
        }

        System.out.println("Tahun " + tahun  + ((is == true) ? " adalah" : " bukan") + " tahun kabisat");
    }
}