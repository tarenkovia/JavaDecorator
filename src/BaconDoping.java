public class BaconDoping extends BurgerDecorator {
    public BaconDoping(Burger burger) {
        super(burger);
    }

    public String getDescription() {
        return burger.getDescription() + "\nДопинг: Бекон";
    }

    public double getCost() {
        return burger.getCost() + 20.00;
    }

    public double getCaloricContent(){
        return burger.getCaloricContent() + 65.00;
    }
}
