import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int sayi1,sayi2,gecici;
        System.out.println("1.sayiyi giriniz");
        sayi1=scanner.nextInt();
        System.out.println("2.sayiyi giriniz");
        sayi2= scanner.nextInt();

        System.out.println("sayilar degistiriliyor........");

        gecici=sayi1;
        sayi1=sayi2;
        sayi2=gecici;

        System.out.println("sayi1:"+sayi1);
        System.out.println("sayi2:"+sayi2);





    }





}