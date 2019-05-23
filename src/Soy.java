public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage){

        this.beverage=beverage;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription()+", w Soy";

    }

    @Override
    public double cost() {
        return 0.19+ beverage.cost();
    }
}
