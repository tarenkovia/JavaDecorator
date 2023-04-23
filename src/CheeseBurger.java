import BurgerFile.Burger;

public class CheeseBurger implements Burger {
    public String getDescription(){
        return "Чизбургер";
    }
    public short getCost(){
        return (short) 68.00;
    }
    public short getCaloricContent(){
        return (short) 299.00;
    }
}
