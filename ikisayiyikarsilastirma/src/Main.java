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

        if(sayi1>sayi2){
            System.out.println("sayi1,sayi2 den buyuktur");
        }
        else if(sayi2>sayi1){
            System.out.println("sayi2 sayi1 den buyuktur");
        }
        else{
            System.out.println("sayilar birbirine esittir");
        }




    }
}