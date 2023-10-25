package yuvaraj;
public class Practise {
    public static void main(String[] args){
    	Bus obj=new Bus();
    	obj.minifast();
    	obj.superfast();
    	obj.flying();
    } 	
     
}
class Aeroplane{
	public void flying() {
		System.out.println("the Aeroplane is flying");
	}
}
class Train extends Aeroplane{
	public void superfast() {
		System.out.println("the train is going to superfast");
		
	}
}
class Bus extends Train{
	public void minifast() {
		System.out.println("the bus is minimum fast it");
	}
}
	










