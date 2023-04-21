public class CheeseDoping extends BurgerDecorator {
    public CheeseDoping(Burger burger) {
        super(burger);
    }
    public String getDescription() {
        return burger.getDescription() + "\nДопинг: Сыр";
    }

    public double getCost() {
        return burger.getCost() + 20.00;
    }

    public double getCaloricContent(){
        return burger.getCaloricContent() + 84.00;
    }
}
