package design.design14_observer.demo01;

//被观察者
public interface Subject {
	
	//添加观察者 
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);

	//通知所有观察者
	public void notifyObservers();
	//观察者很多，被观察者一般只有一个
	
	
}