

public class SoldOutState implements IGumballMachine {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
	
	public void insertNickel(){
	    System.out.println("You can't insert a Nickel, the machine is sold out");
	   }
	   
	public void insertDime(){
	    System.out.println("You can't insert a Dime, the machine is sold out");
	   }
 
	public void ejectCoin() {
		System.out.println("You can't eject, you haven't inserted a coin yet");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
		 
	public boolean isGumballInSlot()
    {
        return gumballMachine.isGumballInSlot();
      }
		
    public void takeGumballFromSlot() {
		System.out.println("No gumball dispensed");
	 }
 
	public String toString() {
		return "sold out";
	}
}
