package com.faltdor.gof.creational.factory;

import com.faltdor.gof.creational.factory.domain.AbstractPizza;
import com.faltdor.gof.creational.factory.domain.impl.CheesePizza;
import com.faltdor.gof.creational.factory.domain.impl.PepperoniPizza;
import com.faltdor.gof.creational.factory.domain.impl.VeggiePizza;
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
