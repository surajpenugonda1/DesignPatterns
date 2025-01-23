public class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "This is a simple Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }

}
