package design.design06_decorator.demo02.coffee;


/*
 * 	coffee是被装饰者
 * */


import design.design06_decorator.demo02.test.Drink;

public class Coffee extends Drink {

	@Override
	public float cost() {
		return super.getPrice();
	}
	
}