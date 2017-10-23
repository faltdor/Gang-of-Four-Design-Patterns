package com.faltdor.gof.abstractfactory;

import com.faltdor.gof.abstractfactory.domain.AbstractPizza;
import com.faltdor.gof.abstractfactory.domain.impl.CheesePizza;
import com.faltdor.gof.abstractfactory.domain.impl.PepperoniPizza;
import com.faltdor.gof.abstractfactory.domain.impl.VeggiePizza;
import com.faltdor.gof.abstractfactory.factories.BasePizzaFactory;
import com.faltdor.gof.abstractfactory.factories.BaseToppingFactory;
import com.faltdor.gof.abstractfactory.factories.impl.GourmetToppingFactory;

public class GourmetPizzaFactory extends BasePizzaFactory {
	
	@Override
	public AbstractPizza createPizza(String type) {
		BaseToppingFactory toppingFactory= new GourmetToppingFactory();
		
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
