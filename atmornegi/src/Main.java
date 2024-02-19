import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int bakiye=10000;

        System.out.println("Bakiyeniz"+bakiye);
        System.out.println("menu");
        System.out.println("1)para cekme");
        System.out.println("2)para yatırma");
        System.out.println("3)bakiye sorgulama");
        System.out.println("4)kart iade");
        System.out.println("islemi seciniz:");
        int islem= scanner.nextInt();

        switch (islem){
            case 1:
                System.out.println("bakiyeniz" + bakiye);
                System.out.println("cekmek istediginiz tutari giriniz");
                int tutar= scanner.nextInt();
                if(tutar>bakiye){
                    System.out.println("bakiyeniz yetersiz tekrar giriniz");
                    tutar=scanner.nextInt();
                }
                else{
                    bakiye-=tutar;
                    System.out.println("yeni bakiyeniz"+ bakiye);
                }
                break;
            case 2:
                System.out.println("yatırmak istediğiniz tutari giriniz");
                tutar= scanner.nextInt();
                bakiye+=tutar;
                System.out.println("yeni tutar" + bakiye);
                break;
            case 3:
                System.out.println("bakiyeniz" + bakiye);
                break;
            case 4:
                System.out.println("kartınızı almayı unutmayınız");
                break;

            default:
                System.out.println("yanlış işlem sectiniz tekrar seçiniz");
        }

    }
}