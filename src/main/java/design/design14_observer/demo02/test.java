package design.design14_observer.demo02;


public class test {
	
	public static void main(String[] args) {
		CurrentConditions mCurrentConditions;
		ForcastConditions mForcastConditions;
		WeatherData mWeatherData;
		 
		mCurrentConditions=new CurrentConditions();
		mForcastConditions=new ForcastConditions();
		mWeatherData=new WeatherData();
		
		//添加观察者
		mWeatherData.addObserver(mCurrentConditions);
		mWeatherData.addObserver(mForcastConditions);
		mWeatherData.setData(30, 150, 40);
		
		
		//移出观察者
		mWeatherData.deleteObserver(mCurrentConditions);
		mWeatherData.setData(35, 150, 60);
		
	}
	
	
}
