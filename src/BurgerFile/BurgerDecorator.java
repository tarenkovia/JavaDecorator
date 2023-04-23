package BurgerFile;

import BurgerFile.Burger;

public abstract class BurgerDecorator implements Burger {
    protected Burger burger;
    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }
}
