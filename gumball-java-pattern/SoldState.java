

public class SoldState implements IGumballMachine {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("Insufficient coins. Can only take dispensed gumballs(if any)");
	}
 
	public void ejectCoin() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
	     System.out.println("Turning won't get gumballs. Insufficient money!");
	}
	
	public void insertNickel(){
	    System.out.println("Insufficient coins. Can only take dispensed gumballs(if any)");
	   }
	   
	public void insertDime(){
	    System.out.println("Insufficient coins. Can only take dispensed gumballs(if any)");
	   }
	 	   
	public boolean isGumballInSlot()
    {
        return gumballMachine.isGumballInSlot();
      }
	 
	public void takeGumballFromSlot() {
	    
        if(gumballMachine.turnCrank==true)
        {
            gumballMachine.releaseBall();
		    gumballMachine.numBalls=0;
          
		   if(gumballMachine.numBalls<=1){
	           gumballMachine.turnCrank=false;
	        }
		
		    if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoCoinState());
		     } else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		    }
        }
          else{
         System.out.println("Insufficient money!");
         gumballMachine.setState(gumballMachine.getNoCoinState());
          }
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


