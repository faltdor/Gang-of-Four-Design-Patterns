package com.faltdor.gof.creational.abstractfactory;

import com.faltdor.gof.creational.abstractfactory.domain.AbstractPizza;
import com.faltdor.gof.creational.abstractfactory.domain.impl.CheesePizza;
import com.faltdor.gof.creational.abstractfactory.domain.impl.PepperoniPizza;
import com.faltdor.gof.creational.abstractfactory.domain.impl.VeggiePizza;
import com.faltdor.gof.creational.abstractfactory.factories.BasePizzaFactory;
import com.faltdor.gof.creational.abstractfactory.factories.BaseToppingFactory;
import com.faltdor.gof.creational.abstractfactory.factories.impl.SicillianToppingFactory;

public class SicilianPizzaFactory extends BasePizzaFactory {

	@Override
	public AbstractPizza createPizza(String type) {
		BaseToppingFactory toppingFactory= new SicillianToppingFactory();
		
		AbstractPizza pizza;
		switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
	}

}
