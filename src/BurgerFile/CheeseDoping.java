package BurgerFile;

import BurgerFile.Burger;

public class CheeseDoping extends BurgerDecorator {
    public CheeseDoping(Burger burger) {
        super(burger);
    }
    public String getDescription() {
        return burger.getDescription() + "\nДопинг: Сыр";
    }

    public short getCost() {
        return (short) (burger.getCost() + 20.00);
    }

    public short getCaloricContent(){
        return (short) (burger.getCaloricContent() + 84.00);
    }
}
