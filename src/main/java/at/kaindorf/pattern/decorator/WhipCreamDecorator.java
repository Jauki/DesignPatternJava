package at.kaindorf.pattern.decorator;

public class WhipCreamDecorator extends MilkDecorator{
    public WhipCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Whipped Cream";
    }

    @Override
    public double getCosts() {
        return coffee.getCosts() + 0.20;
    }
}
