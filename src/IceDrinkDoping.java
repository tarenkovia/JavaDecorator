public class IceDrinkDoping extends DrinkDecorator {
    public IceDrinkDoping(Drink drink) {
        super(drink);
    }

    public String getDescription() {
        return drink.getDescription() + "\nДопинг: Лед";
    }

    public double getCost() {
        return drink.getCost() + 10.00;
    }

    public double getCaloricContent(){
        return drink.getCaloricContent() + 00.00;
    }
}
