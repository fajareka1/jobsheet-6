import java.util.Scanner;

public class TokoSepatu04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String merk, kategori;
        int ukuran;
        double harga = 0;

        System.out.print("Maukkan merk sepatu : ");
        merk = sc.nextLine();
        System.out.print("Maukkan kategori sepatu : ");
        kategori = sc.nextLine();
        System.out.print("Maukkan ukuran sepatu : ");
        ukuran = sc.nextInt();


        if(merk.equalsIgnoreCase("converse")){
            if (kategori.equalsIgnoreCase("Slip On") && ukuran >= 36 && ukuran <= 40 ) {
                harga = 800000;
            }else{
                harga = 1200000;
            }
        }else if(merk.equalsIgnoreCase("sketcher")){
            if (kategori.equalsIgnoreCase("Woman") && ukuran >= 36 && ukuran <= 41 ) {
                harga = 1000000;
            }else{
                harga = 1800000;
            }
        }else if(merk.equalsIgnoreCase("hush")){
            if (kategori.equalsIgnoreCase("Kids") && ukuran >= 36 && ukuran <= 40 ) {
                harga = 750000;
            }else{
                harga = 1500000;
            }
        }else{
            System.out.println("Sepatu tidak ditemukan");
            return;
        }

        System.out.println("Harga sepatu adalah : Rp." + harga);
    }
}
