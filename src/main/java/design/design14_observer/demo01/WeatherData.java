package design.design14_observer.demo01;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	private ArrayList<Observer> mObservers;

	public WeatherData() {
		mObservers = new ArrayList<Observer>();
	}

	//修改被观察者状态
	public void setData(float mTemperatrue, float mPressure, float mHumidity) {
		this.mTemperatrue = mTemperatrue;
		this.mPressure = mPressure;
		this.mHumidity = mHumidity;

		dataChange();
	}

	public void registerObserver(Observer o) {
		mObservers.add(o);
	}

	public void removeObserver(Observer o) {
		if (mObservers.contains(o)) {
			mObservers.remove(o);
		}
	}

	public void notifyObservers() {
		for (int i = 0, len = mObservers.size(); i < len; i++) {
			mObservers.get(i).update(getTemperature(), getPressure(), getHumidity());
		}
	}
	
	
	public float getTemperature() {
		return mTemperatrue;
	}

	public float getPressure() {
		return mPressure;
	}

	public float getHumidity() {
		return mHumidity;
	}
	
	//通知所有观察者更新数据
	public void dataChange() {
		notifyObservers();
	}

	

}
