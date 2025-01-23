public class WhipCreamDecorator extends CoffeeDecorator {
    public WhipCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return this.coffee.getDescription() + ", added Whip Cream";
    }

    public double cost() {
        return this.coffee.cost() + 0.3;
    }

}

