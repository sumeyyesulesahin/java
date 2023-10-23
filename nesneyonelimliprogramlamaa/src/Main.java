
public class Main {
    public static void main(String[] args) {
        Car a=new Car();
        Car b=new Car();

        a.brand="Ford";
        b.brand="Renault";

        a.model="Focus";
        b.model="megane";

        a.color="black";
        b.color="grey";

        a.price=120000;
        b.price=100000;

    a.printStates();
    b.printStates();

    a.speed=100;//initial speed
    b.speed=130;//initial speed
    a.speedUp(50);
    b.speedUp(70);
    System.out.println(a.speed);
    System.out.println(b.speed);
    a.applyBrakes(60);
    b.applyBrakes(20);
    System.out.println(a.speed);
    System.out.println(b.speed);










        }
    }
