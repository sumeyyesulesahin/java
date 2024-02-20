import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ürünün KDV'siz fiyatini giriniz");
        int fiyat= scanner.nextInt();
       double yenifiyat=fiyat+(fiyat*0.18);
        System.out.println("yeni fiyat sudur:"+" "+yenifiyat);
    }
}