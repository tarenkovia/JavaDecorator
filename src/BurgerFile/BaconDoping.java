package BurgerFile;

import BurgerFile.Burger;

public class BaconDoping extends BurgerDecorator {
    public BaconDoping(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + "\nДопинг: Бекон";
    }

    public short getCost() {
        return (short) (burger.getCost() + 20.00);
    }

    public short getCaloricContent(){
        return (short) (burger.getCaloricContent() + 65.00);
    }
}
