package design.design06_decorator.demo02.decorator;


import design.design06_decorator.demo02.test.Drink;//装饰者

/**
 * 这里继承的Drink必须是和被修饰(Coffe)具有相同属性的类，这里
 * 应该继承的是Money，而不是Drink，这里装饰的是商品的价格及描述
 */
public class Decorator extends Drink {
	private Drink Obj;

	public Decorator(Drink Obj) {
		this.Obj = Obj;
	}

	@Override
	public float cost() {
		/*
		 * super.getPrice() + Obj.cost();
		 * super.getPrice()：获取当前装饰者的价格，使用super也是实现方法的复用
		 * Obj.cost()：递归调用上一个装饰者的价格
		 * */
		return super.getPrice() + Obj.cost();
	}
	
	@Override
	public String getDescription() {
		return super.description + "-" + super.getPrice() + "&&" + Obj.getDescription();
	}

}