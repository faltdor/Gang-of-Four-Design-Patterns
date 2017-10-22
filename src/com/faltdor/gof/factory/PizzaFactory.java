package com.faltdor.gof.factory;

import com.faltdor.gof.factory.domain.AbstractPizza;
import com.faltdor.gof.factory.domain.CheesePizza;
import com.faltdor.gof.factory.domain.PepperoniPizza;
import com.faltdor.gof.factory.domain.VeggiePizza;

public class PizzaFactory extends BasePizzaFactory {

	@Override
	public AbstractPizza createPizza(String type) {
		AbstractPizza pizza;
        switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
	}

}
