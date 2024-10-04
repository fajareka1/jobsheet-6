import java.util.Scanner;

public class NilaiMax04 {
    public static void main(String[] args) {
        int bil1, bil2, bil3, bilmax;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan 1 : ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan Bilangan 2 : ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan Bilangan 3 : ");
        bil3 = sc.nextInt();

        if(bil1 > bil2 && bil1 > bil3){
            bilmax = bil1;
        }else if(bil2 > bil1 && bil2 > bil3){
            bilmax = bil2;
        }else{
            bilmax = bil3;
        }

        System.out.println("bilangan yang paling besar adalah " + bilmax);
    }    
}
