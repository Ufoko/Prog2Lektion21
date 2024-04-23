package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Soy extends CondimentDecorator{
    protected Soy(Beverage beverage) {
        super(beverage);
        thisCost = 0.15;
    }

    @Override
    public double cost() {
        return beverage.cost() + thisCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
