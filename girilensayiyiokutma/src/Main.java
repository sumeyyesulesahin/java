import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("iki basamaklı bir sayi giriniz");
        int sayi= scanner.nextInt();

        int birler=sayi%10;
        int onlar=sayi/10;


switch(onlar){
    case 1:{
        System.out.println("on");
    }
    break;
    case 2:{
        System.out.println("yirmi");
    }break;
    case 3:{
        System.out.println("otuz");
    }break;
    case 4:{
        System.out.println("kırk");
    }break;
    case 5:{
        System.out.println("elli");
    }break;
    case 6:{
        System.out.println("altmış");
    }break;
    case 7:{
        System.out.println("yetmiş");
    }break;
    case 8:{
        System.out.println("seksen");
    }break;
    case 9:{
        System.out.println("doksan");
    }
}
     switch (birler) {
         case 1: {
             System.out.println("bir");
         }
         break;
         case 2: {
             System.out.println("iki");
         }
         break;
         case 3: {
             System.out.println("üç");
         }
         break;
         case 4: {
             System.out.println("dört");
         }
         break;
         case 5: {
             System.out.println("beş");
         }
         break;
         case 6: {
             System.out.println("altı");
         }
         break;
         case 7: {
             System.out.println("yedi");
         }
         break;
         case 8: {
             System.out.println("sekiz");
         }
         break;
         case 9: {
             System.out.println("dokuz");
         }
         break;
     }
    }
}