public class SauceDoping extends BurgerDecorator {
    public SauceDoping(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + "\nДопинг: Соус";
    }

    public double getCost() {
        return burger.getCost() + 40.00;
    }

    public double getCaloricContent(){
        return burger.getCaloricContent() + 100.00;
    }
}
