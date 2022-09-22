package accessmodifiers;

public class Faculty {
	
	private String dob;
	public String name;
	protected int phoneNo;
	
	
	public int getAge() {
		//calc age from dob
		int age = Integer.parseInt(dob);
		return age;
	}

}
