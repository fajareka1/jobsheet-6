import java.util.Scanner;

public class Lib04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku, hargaBuku;
        double diskon = 0.07, total;

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkn harga buku");
        hargaBuku = sc.nextInt();
        System.out.print("Masukkn jumlah buku");
        jumlahBuku = sc.nextInt();

        if(jenisBuku.equalsIgnoreCase("komik")){
            if(jumlahBuku > 2 ){
                diskon += 0.12;
            }else{
                diskon += 0.1;
            }
        }else if(jenisBuku.equalsIgnoreCase("novel")){
            if(jumlahBuku > 3 ){
                diskon += 0.02;
            }else{
                diskon += 0.01;
            }
        }else{
            if(jumlahBuku > 2 ){
                diskon += 0.05;
            }
        }

        total = (hargaBuku*jumlahBuku) - ((hargaBuku*jumlahBuku)*diskon);

        System.out.println("Total bayar : Rp."+total);
    }
}
