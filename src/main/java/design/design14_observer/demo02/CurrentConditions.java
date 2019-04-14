package design.design14_observer.demo02;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditions implements Observer {

    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    //java内置观察者模式的update方法是固定的
    public void update(Observable arg0, Object arg1) {
        this.mTemperatrue = ((Data) (arg1)).mTemperatrue;
        this.mPressure = ((Data) (arg1)).mPressure;
        this.mHumidity = ((Data) (arg1)).mHumidity;
        display();
    }

    public void display() {
        System.out.println("***Today mTemperatrue:" + mTemperatrue + "***");
        System.out.println("***Today mPressure:" + mPressure + "***");
        System.out.println("***Today mHumidity:" + mHumidity + "***");
    }


}