package abstraction;

public class Wiring {
	
	public static void main(String[] args) {
		SwitchBoardListener sbl = new GEAppliances();
				//new HavellsAppliances(); //wiring
		
		//user clicking the switches
		sbl.switchOne();
		sbl.switchTwo(1);
		sbl.switchThree("ac");
		sbl.switchFour();
	}
	

}
