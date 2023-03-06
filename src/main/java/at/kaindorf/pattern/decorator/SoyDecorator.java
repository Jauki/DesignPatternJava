package at.kaindorf.pattern.decorator;

public class SoyDecorator extends MilkDecorator {

    public SoyDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Soy milk";
    }

    @Override
    public double getCosts() {
        return coffee.getCosts() + 0.20;
    }
}
