public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",w Milk";
    }

    @Override
    public double cost() {
        return 0.25+ beverage.cost();
    }
}
