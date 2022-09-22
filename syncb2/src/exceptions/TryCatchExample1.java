package exceptions;
public class TryCatchExample1 {  
  
    public static void main(String[] args) {  
          
        try {
			int data=50/0; //may throw exception   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
        System.out.println("rest of the code");  
          
    }  
      
}  