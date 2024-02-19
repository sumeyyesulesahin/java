import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("1.sayiyi giriniz");
        int sayi1= scanner.nextInt();
        System.out.println("2.sayiyi giriniz");
        int sayi2= scanner.nextInt();

        System.out.println("İSLEMİ SECİNİZ");
        System.out.println("1)TOPLAMA");
        System.out.println("2)ÇIKARMA");
        System.out.println("3)ÇARPMA");
        System.out.println("4)BÖLME");

        System.out.println("Seciminizi giriniz");
        int secim= scanner.nextInt();

        if(secim==1){
            System.out.println("sonuc:" + (sayi1+sayi2));
        } else if (secim==2) {
            System.out.println("sonuc" +(sayi1-sayi2));

        } else if (secim==3) {
            System.out.println("sonuc" + (sayi1*sayi2));

        } else if (secim==4) {
            System.out.println("sonuc" +(sayi1/sayi2));
        }
        else{
            System.out.println("gecersiz secim yaptiniz");
        }


    }
}