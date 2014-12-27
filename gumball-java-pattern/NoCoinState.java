

public class NoCoinState implements IGumballMachine {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.sum+=25;
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted a coin");
	}
	
	public void insertNickel(){
	    System.out.println("You inserted a nickel");
	    gumballMachine.sum+=5;
		gumballMachine.setState(gumballMachine.getHasCoinState());
	   }
	
	public void insertDime(){
	    System.out.println("You inserted a dime");
	    gumballMachine.sum+=10;
		gumballMachine.setState(gumballMachine.getHasCoinState());
	   }
	   
 
	public void turnCrank() {
	    if(gumballMachine.sum>=50&&gumballMachine.turnCrank==false)
	    {
	        System.out.println("Turned");
	        gumballMachine.setState(gumballMachine.getSoldState());
	        gumballMachine.turnCrank=true;
	       }
	    else
	        System.out.println("You turned, but there's no coin");
	 }
	 
	public boolean isGumballInSlot()
    {
        return gumballMachine.isGumballInSlot();
      }
 
	public void takeGumballFromSlot() {
	    {
	    	gumballMachine.turnCrank=false;
	    	System.out.println("You need to pay first!");
	   }
     }
     
	public String toString() {
		return "waiting for coin";
	}
}
