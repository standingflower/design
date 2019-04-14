package design.design06_decorator.demo02.decorator;


import design.design06_decorator.demo02.test.Drink;

public class Milk extends Decorator {

	public Milk(Drink Obj) {
		super(Obj);
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}

}

