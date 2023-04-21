public class Main {
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
        double caloric = myDrink.getCaloricContent() + myBurger.getCaloricContent();
        double cost = myDrink.getCost() + myBurger.getCost();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t   Общая калорийность: " + caloric);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Итог: " + cost);
        System.out.println("----------------------------------------------------------------------------");
    }
}