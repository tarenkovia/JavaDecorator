package DrinkFile;

import DrinkFile.Drink;
import DrinkFile.DrinkDecorator;

public class SyrupDrinkDoping extends DrinkDecorator {
    public SyrupDrinkDoping(Drink drink) {
        super(drink);
    }

    public String getDescription() {
        return drink.getDescription() + "\nДопинг: Сироп";
    }

    public short getCost() {
        return (short) (drink.getCost() + 45);
    }

    public short getCaloricContent(){
        return (short) (drink.getCaloricContent() + 40);
    }
}
