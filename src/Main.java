import BurgerFile.BaconDoping;
import BurgerFile.Burger;
import BurgerFile.CheeseDoping;
import BurgerFile.SauceDoping;
import DrinkFile.Drink;
import DrinkFile.IceDrinkDoping;
import DrinkFile.SyrupDrinkDoping;

public class Main {
    public static short Calculate(short t1, short t2){
        short result = 0;
        try{
            result = (short) (t1 + t2);
        } catch (ArithmeticException e){
            e.getMessage();
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("--------------------------------Ваш заказ-----------------------------------");
        Burger myBurger = new CheeseBurger();
        myBurger = new CheeseDoping(myBurger);
        myBurger = new SauceDoping(myBurger);
        myBurger = new BaconDoping(myBurger);
        System.out.println(myBurger.getDescription() + "\n Калорийность: " + myBurger.getCaloricContent() + "\n Итого: " + myBurger.getCost());
        System.out.println();

        Drink myDrink = new DobryCola();
        myDrink = new IceDrinkDoping(myDrink);
        myDrink = new SyrupDrinkDoping(myDrink);
        System.out.println(myDrink.getDescription() + "\n Калорийность: " + myDrink.getCaloricContent() + "\n Итого: " + myDrink.getCost());
        short caloric = Calculate(myDrink.getCaloricContent(), myBurger.getCaloricContent());
        short cost = Calculate(myDrink.getCost(), myBurger.getCost());
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t   Общая калорийность: " + caloric);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Итог: " + cost);
        System.out.println("----------------------------------------------------------------------------");
    }
}