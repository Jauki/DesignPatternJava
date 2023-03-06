package at.kaindorf.pattern.decorator;

public class DarkRoast extends Coffee{
    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    @Override
    public double getCosts() {
        return 1.99;
    }
}
