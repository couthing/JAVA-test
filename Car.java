public class Car{
	//先全部定义为private，需要访问修改即使用getter,setter方法
	private String brand;
	private String color;
	private int prize;
	
	//构造方法  方法名：类名一样 返回值：无
	//品牌只提供get方法，不提供修改，不能是空
	//(当车生产生产出来，品牌已定，不能修改，价格可修改)
	public Car(String brand){
		this.brand = brand;
	}
	
	public Car(String brand,String color){
		this.brand = brand;
		this.color = color;
	}
	
	public Car(String brand,String color,int prize){
		//this调用方在构造方法中的第一句
		this(brand,color);
		this.prize = prize;
	}

	//方法，行为
	public String carInof(){
		return "品牌："+brand+",颜色"+color+",价格:"+prize;
	}
	
	//JAVA 类的属性
	//属性被外部访问，必须定义getter，setter方法
	//1.(调用)getter getxxx() xxx：属性名称
	String getBrand(){
		//可作出提示
		//return brand+"!";
		return brand;
	}
	
	//2.(修改)setter setxxx() xxx：属性名称
	void setPrize(){
		this.prize = prize;
	}
	
	public static void main(String[] args){
		Car car1 = new Car("QQ","white",987);
        System.out.println(car1.carInof());
         		
	}
	
	
}