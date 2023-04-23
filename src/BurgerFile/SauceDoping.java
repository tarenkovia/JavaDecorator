package BurgerFile;

import BurgerFile.Burger;

public class SauceDoping extends BurgerDecorator {
    public SauceDoping(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + "\nДопинг: Соус";
    }

    public short getCost() {
        return (short) (burger.getCost() + 40.00);
    }

    public short getCaloricContent(){
        return (short) (burger.getCaloricContent() + 100.00);
    }
}
