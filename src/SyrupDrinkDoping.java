public class SyrupDrinkDoping extends DrinkDecorator {
    public SyrupDrinkDoping(Drink drink) {
        super(drink);
    }

    public String getDescription() {
        return drink.getDescription() + "\nДопинг: Сироп";
    }

    public double getCost() {
        return drink.getCost() + 45.00;
    }

    public double getCaloricContent(){
        return drink.getCaloricContent() + 40.00;
    }
}
