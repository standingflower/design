package design.design14_observer.demo01;


public class test {
	
	public static void main(String[] args) {
		CurrentConditions mCurrentConditions;
		ForcastConditions mForcastConditions;
		WeatherData mWeatherDataSt;
		
		//被观察者
		mWeatherDataSt=new WeatherData();
		
		//观察者
		mCurrentConditions=new CurrentConditions();
		mForcastConditions=new ForcastConditions();
		
		//添加观察者
		mWeatherDataSt.registerObserver(mCurrentConditions);
		mWeatherDataSt.registerObserver(mForcastConditions);
		
		//修改被观察者
		mWeatherDataSt.setData(30, 150, 40);
		
		//移出观察者
		mWeatherDataSt.removeObserver(mCurrentConditions);
		mWeatherDataSt.setData(40, 250, 50);
	}
	
	/*
	 * 观察者模式：
	 * 	Observer(观察者)：很多，实现update方法，可以创建接口
	 * 	Subject(被观察者)：一般只有一个
	 * 		registerObserver：添加观察者
	 * 		removeObserver：移出观察者
	 * 		notifyObservers：通知所有观察者
	 * 
	 * 	当被观察者的状态改变时，需要将改变的状态通知到所有的观察者，观察者调用update
	 * 	方法更新数据
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	

}
