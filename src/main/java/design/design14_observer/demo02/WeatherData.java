package design.design14_observer.demo02;

import java.util.Observable;


/*
 * 	java由于内置的观察者模式，被观察者只要继承Observable类即可
 * 						观察者只要继承Observer类即可
 * */
public class WeatherData extends Observable {
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;

	public float getTemperature() {
		return mTemperatrue;
	}

	public float getPressure() {
		return mPressure;
	}

	public float getHumidity() {
		return mHumidity;
	}

	public void dataChange() {
		//当被观察者的状态改变时，需要手动设置setChanged才会将改变的状态通知给观察者
		this.setChanged();
		//通知改变数据
		this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));
	}

	public void setData(float mTemperatrue, float mPressure, float mHumidity) {
		this.mTemperatrue = mTemperatrue;
		this.mPressure = mPressure;
		this.mHumidity = mHumidity;
		dataChange();
	}

	

}
