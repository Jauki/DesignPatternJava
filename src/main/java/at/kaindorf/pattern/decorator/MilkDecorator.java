package at.kaindorf.pattern.decorator;

public abstract class MilkDecorator  extends Coffee{
    protected Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
