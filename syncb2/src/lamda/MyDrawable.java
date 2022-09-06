package lamda;

public class MyDrawable implements Drawable,Sayable {

	@Override
	public void draw() {
		System.out.println("im drawing");
	}

	@Override
	public String say(String name) {
		return "hello "+name;
	}

}
