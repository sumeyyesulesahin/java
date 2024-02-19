import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("kilonuzu giriniz");
        float kilo= scanner.nextFloat();
        System.out.println("boyunuzu giriniz");
        float boy= scanner.nextFloat();

        float bki=kilo/(boy*boy);
        System.out.println("beden kitle endeksiniz"+ bki);
        if(bki<18){
            System.out.println("zayif");
        } else if (bki<25) {
            System.out.println("normal");
        } else if (bki<30) {
            System.out.println("hafif sisman");
        } else if (bki<35) {
            System.out.println("sisman");
        }
        else {
            System.out.println("obez");
        }


    }
}