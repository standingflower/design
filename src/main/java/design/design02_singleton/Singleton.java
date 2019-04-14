package design.design02_singleton;


public class Singleton {

    /*
     * 	volatile：表示变量是不稳定的，每次使用都是直接到内存中寻找，而不是到寄存器中寻找
     *
     * 	private volatile static Singleton uniqeInstance = new Singleton();
     * 	这种创建单例化的方式叫急切创建，即初始化类的时候就创建，但是这样比较消耗内存，不知道单例什么
     * 	时候才第一次调用，所以还是使用getInstance的方式
     * */
    private volatile static Singleton uniqeInstance = null;

    //private修饰构造函数表示，要想实例化此对象，必须在当前类中实例，其他地方不能实例化此对象
    private Singleton() {
    }

    public static Singleton getInstance() {
        //双重检查加锁
        if (uniqeInstance == null) {
            synchronized (Singleton.class) {
                if (uniqeInstance == null) {
                    uniqeInstance = new Singleton();
                }
            }
        }
        return uniqeInstance;
    }

    /**
     * public class Singleton {
     *
     *  Singleton uniqeInstance = null;
     * 	static{
     * 		uniqeInstance= new  Singleton();
     *  }
     *  public static Singleton getInstance() {
     *      return uniqeInstance;
     *  }
     *}
     *  恶汉模式，类初始化的时候就加载
     */

	/*
	 *
	 	public static Singleton getInstance(){
			if(uniqeInstance==null){
				// -----1
				uniqeInstance=new Singleton();
			}
			return uniqeInstance;
		}

	 *	假设有两个线程同时调用getInstance方法，但是又是第一次实例化对象
	 *		当线程A在1处执行完时间片，对象还为创建
	 *		线程B执行时间片，创建完对象
	 *		线程A获得CPU继续执行，就有会创建一个对象，此时就创建了两个对象
	 *
	 *	可以为方法设置synchronized关键字，但是设置synchronized后，对内存消耗比较大，每次执行方法时，消耗内存
	 *	所以采用双重检查加锁
	 * */
}
