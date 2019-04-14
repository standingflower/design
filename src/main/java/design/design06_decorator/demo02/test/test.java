package design.design06_decorator.demo02.test;


import design.design06_decorator.demo02.coffee.Decaf;
import design.design06_decorator.demo02.coffee.LongBlack;
import design.design06_decorator.demo02.decorator.Chocolate;
import design.design06_decorator.demo02.decorator.Milk;

public class test {
	
	
	public static void main(String[] args) {
		
		Drink order;
		//这个没有为咖啡添加装饰者
		order=new Decaf();
		System.out.println("order1 price:"+order.cost());
		System.out.println("order1 desc:"+order.getDescription());
		
		System.out.println("****************");
		order=new LongBlack();
		//为咖啡添加装饰者
		order=new Milk(order);
		order=new Chocolate(order);
		order=new Chocolate(order);
		System.out.println("order2 price:"+order.cost());
		System.out.println("order2 desc:"+order.getDescription());
		
		/*
		 *	装饰者模式：
		 *		为一个或一类对象(Coffee)添加新的需求(配料)，要实现开闭原则
		 *		(一般的设计就会采用继承，但是需要添加多个相同的需求时，继承就不做，装饰者比继承更具有弹性)
		 *	开闭原则：
		 *		开：可以随时添加新需求/移出新需求
		 *		闭：在添加或移出新需求时不修改原来的代码
		 * */

	}
	
	
	
}
