package design.design14_observer.demo01;


//观察者
public interface Observer {
	
	//需要更新被观察者的状态
	public void update(float mTemperatrue, float mPressure, float mHumidity);
	
	
}
