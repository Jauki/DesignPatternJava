package at.kaindorf.pattern.decorator;

public class Decaf extends Coffee {
    @Override
    public String getDescription() {
        return "Decaffeinated Coffee";
    }

    @Override
    public double getCosts() {
        return 1.49;
    }
}
