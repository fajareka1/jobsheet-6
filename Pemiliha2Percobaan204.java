import java.util.Scanner;

/**
 * Pemiliha2Percobaan204
 */
public class Pemiliha2Percobaan204 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qty, harga;
        double diskon = 0.1, total;
        String menu;
        boolean member, pay;

        System.out.println("list menu : \n 1.kopi : Rp.5000\n 2.nasi : Rp.4000 \n 3.gunting : Rp.10000\n");
        System.out.print("Pilih menu : ");
        menu = sc.nextLine();
        System.out.print("Jumlah : ");
        qty = sc.nextInt();
        System.out.print("Anda adalah member? (true/false) : ");
        member= sc.nextBoolean();
        System.out.print("Bayar dengan qris? (true/false) : ");
        pay= sc.nextBoolean();

        if(menu.equalsIgnoreCase("kopi")){
            harga = 5000;
        }else if (menu.toLowerCase() == "nasi"){
            harga = 4000;
        }else{
            harga = 10000;
        }

        if(member != true){
            diskon = 0;
        }

        total = (harga * qty) - ((harga * qty) * diskon) - ((pay == true) ? 1000 : 0);
        System.out.println("------------- ------- --------------");
        System.out.println("------------- INVOICE --------------");
        System.out.println("------------- ------- --------------");
        System.out.println("Menu : " + menu);
        System.out.println("Jumlah : " + qty);
        if(member == true){
            System.out.println("Diskon : 10%");
        }
        if(pay == true){
            System.out.println("Diskon Qris : Rp.1000");
        }
        System.out.println("Total Pembayaran : Rp." + total);
    }
}