package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
        thisCost = 0.10;
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
