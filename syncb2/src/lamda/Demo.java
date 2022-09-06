package lamda;

public class Demo {
	public static void main(String[] args) {
		//life b4 lamda
		MyDrawable myDrawable = new MyDrawable();
		myDrawable.draw();
		System.out.println(myDrawable.say("abdul"));
		//life after lamda
		Drawable d2 = () -> {System.out.println("ur drawing");};
		d2.draw();
		
		Sayable s3 = Demo::saySomething;
		System.out.println(s3.say("sync"));

		Sayable s2 =  (name) -> {return "hi "+name;};
		System.out.println(s2.say("ansari"));
		
		SomeArith sa = new SomeArith();
		
		Arithmetic ar = sa::sum;
		System.out.println(ar.add(10, 20));
	}

	public static String saySomething(String name){  
		System.out.println("Hello, this is static method.");  
		return "hello method ref";
	}  
}


