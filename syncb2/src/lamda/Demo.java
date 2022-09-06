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
		
		Sayable s2 =  (name) -> {return "hi "+name;};
		System.out.println(s2.say("ansari"));
		}
	}


