public class MilkCoffeeDecorator extends CoffeeDecorator {
    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return this.coffee.getDescription() + ", Milk Coffee";
    }

    public double cost() {
        return this.coffee.cost() + 0.5;
    }

}
