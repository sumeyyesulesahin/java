import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        int sayi1= scanner.nextInt();
        System.out.println("2.sayiyi giriniiz");
        int sayi2= scanner.nextInt();
        System.out.println("3.sayiyi giriniz");
        int sayi3= scanner.nextInt();

        int enbuyuk=sayi1;
        if(sayi2>enbuyuk){
            enbuyuk=sayi2;
        }
        if(sayi3>enbuyuk){
            enbuyuk=sayi3;
        }
        System.out.println("en buyuk sayi"+enbuyuk);
    }
}