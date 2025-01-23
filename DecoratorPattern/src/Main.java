public class Main {
    public static void main(String[] args) {
        // decorator pattern is a structural design pattern which adds additional functionalities to objects by placing these inside special wrapper objects
        // that contains behaviours
        SimpleCoffee coffee = new SimpleCoffee();
        WhipCreamDecorator whipCreamDecorator = new WhipCreamDecorator(coffee);

        System.out.println(whipCreamDecorator.cost() +  whipCreamDecorator.getDescription());
        MilkCoffeeDecorator milkCoffeeDecorator = new MilkCoffeeDecorator(whipCreamDecorator);

        System.out.println(milkCoffeeDecorator.cost() +  milkCoffeeDecorator.getDescription());
    }
}