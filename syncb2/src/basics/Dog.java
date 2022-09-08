package basics;

public class Dog extends Animal{
	
	public Dog() {
		//super();
		System.out.println("dog is created");
	}
	
	@Override //redefine
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("eat bread");
	}
	

}
