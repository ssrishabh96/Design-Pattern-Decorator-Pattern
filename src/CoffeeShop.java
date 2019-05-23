public class CoffeeShop {

    public static void main(String[] args) {

        Beverage beverage= new Espresso();
        System.out.println("COffee: "+beverage.getDescription()+", cost: $"+beverage.cost());

        Beverage beverage1=new Decaf();
        beverage1=new Soy(beverage1);
        beverage1=new Mocha(beverage1);

        System.out.println("COffee: "+beverage1.getDescription()+", cost: $"+beverage1.cost());


    }
}
