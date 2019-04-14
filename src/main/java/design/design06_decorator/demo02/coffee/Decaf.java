package design.design06_decorator.demo02.coffee;

public class Decaf extends Coffee {
	
	
	public Decaf() {
		/*
		 * 参数实际还是封装到Decaf中的，这里使用super和this实际上
		 * 是一样的，都只是为了调用方法，而继承也会继承父类的方法
		 * */
		this.setDescription("Decaf");
		super.setPrice(3.0f);
	}
}
