package lamda;

public class ConstructorReference {
	
	public static void main(String[] args) {
		Messageable m2 = Message::new;
		m2.getMessage("you're invited");
	}

}
