package com.company.designpatterns.factorypattern;

public class BurgerFactory {

    public IBurger prepareBurger(Enum<BurgerTypes> burgerTypesEnum)
    {

        if(burgerTypesEnum == BurgerTypes.VEG)
        {
            return new VegBurger().prepare();
        }
        else if(burgerTypesEnum == BurgerTypes.CHICKEN)
        {
            return new ChickenBurger().prepare();
        }
        else if (burgerTypesEnum == BurgerTypes.MUTTON)
        {
            return new MuttonBurger().prepare();
        }
        else
        {
            return null;
        }



    }

}
