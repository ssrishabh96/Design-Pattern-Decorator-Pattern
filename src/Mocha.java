public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", w Mocha";
    }

    @Override
    public double cost() {
        return 0.31+beverage.cost();
    }
}
