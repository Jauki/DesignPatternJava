package at.kaindorf.pattern.decorator;

public class CoffeeClient {
    public static void main(String[] args) {
        Coffee myCoffee = new DarkRoast();
        System.out.println(myCoffee.getDescription() + ": " +  myCoffee.getCosts());
        myCoffee = new SoyDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + ": " +  myCoffee.getCosts());
        myCoffee = new WhipCreamDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + ": " +  myCoffee.getCosts());
    }
}
