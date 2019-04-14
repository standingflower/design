package design.design06_decorator.demo02.decorator;


import design.design06_decorator.demo02.test.Drink;

public class Soy extends Decorator {

	public Soy(Drink Obj) {
		super(Obj);
		super.setDescription("Soy");
		super.setPrice(1.5f);
	}

}

