package design.design06_decorator.demo02.decorator;


import design.design06_decorator.demo02.test.Drink;

public class Chocolate extends Decorator {

	public Chocolate(Drink Obj) {
		
		/*
		 * super(Obj);
		 * 递归调用，方便获取装饰者的价格，描素
		 * */
		super(Obj);
		/*
		 * 这里虽然调用的是super.set但是实际上还是封装到Chocolate对象中
		 * 创建Decorator类的作用就是为了方法的复用，子类直接调用即可
		 * */
		this.setDescription("Chocolate");
		super.setPrice(3.0f);
	}

}
