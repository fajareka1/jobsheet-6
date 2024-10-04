import java.util.Scanner;

public class Pemilihan2Percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kategori;
        int penghasilan;
        double pajak = 0, gajiBersih;

        System.out.print("Kategori pekerjaan (pebisnis/pekerja) : ");
        kategori = sc.nextLine();
        System.out.print("Penghasilan : ");
        penghasilan = sc.nextInt();

        if(kategori.equalsIgnoreCase("pebisnis")){
            if(penghasilan <= 2500000){
                pajak = 0.15;
            }else if(penghasilan <= 3500000 && penghasilan > 2500000){
                pajak = 0.2;
            }else{
                pajak = 0.25;
            }
        }else if(kategori.equalsIgnoreCase("pekerja")){
            if(penghasilan <= 2000000){
                pajak = 0.1;
            }else if(penghasilan <= 3000000 && penghasilan > 2000000){
                pajak = 0.15;
            }else{
                pajak = 0.2;
            }
        }else{
            System.out.println("Kategori Tidak Tersedia");
        }

        gajiBersih = penghasilan - (penghasilan * pajak);
        System.out.println("pajak : " + pajak);
        System.out.println("Gaji bersih : Rp." + (int)gajiBersih);

    }
}
