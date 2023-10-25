package Runner;

public class JavaPractice {
	private String name="yuvaraj";
	private int age=40;
	public void set(String name, int age) {
		this.name=name;	
		this.age=age;
	}
	public String get() {
		return this.name;
	}
	public int get1() {
		return this.age;
	}

	public static void main(String[] args) {
		JavaPractice obj=new JavaPractice();
		obj.get();
		obj.get1();	

	}

}
