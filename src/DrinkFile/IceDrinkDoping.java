package DrinkFile;

import DrinkFile.Drink;
import DrinkFile.DrinkDecorator;

public class IceDrinkDoping extends DrinkDecorator {
    public IceDrinkDoping(Drink drink) {
        super(drink);
    }

    public String getDescription() {
        return drink.getDescription() + "\nДопинг: Лед";
    }

    public short getCost() {
        return (short) (drink.getCost() + 10);
    }

    public short getCaloricContent(){
        return (short) (drink.getCaloricContent() + 0);
    }
}
