

public class GumballMachine{
    //Creating references for the states
	IGumballMachine soldOutState;
	IGumballMachine noCoinState;
	IGumballMachine hasCoinState;
	IGumballMachine soldState;
	public boolean turnCrank=false;
	int numBalls=0;
 
	IGumballMachine state = soldOutState;
	int count = 0;
	int sum=0;
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noCoinState=new NoCoinState(this);
		hasCoinState=new HasCoinState(this);
		noCoinState = new NoCoinState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		//To check if the number of gumballs in the machine are greater than 0.If so, it goes to no coin state. 
 		if (numberGumballs > 0) {
			state = noCoinState;
		} 
		else
		{
		   System.out.println("Enter a positive integer or 0");
		   state=soldOutState;
		  }
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectCoin() {
		state.ejectCoin();
	}
	
	public void insertNickel(){
	    state.insertNickel();
	   }
	   
	public void insertDime(){
	    state.insertDime();
	   }
 
	public void turnCrank() {
		
	    state.turnCrank();
		
	}
	
	public void takeGumballFromSlot()
	{
	        
	    state.takeGumballFromSlot();
	    
	   }
	   
	   public boolean isGumballInSlot()
    {
        return turnCrank;
      }
           

	void setState(IGumballMachine state) {
		this.state = state;
	}
 
	void releaseBall() {
	   System.out.println("A gumball comes rolling out the slot...");
		if(numBalls>0)
		{
		    System.out.println("You took"+" "+(numBalls)+ "ball(s)");
		  }
            
           
        }
	 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}

    public IGumballMachine getState() {
        return state;
    }

    public IGumballMachine getSoldOutState() {
        return soldOutState;
    }

    public IGumballMachine getNoCoinState() {
        return noCoinState;
    }

    public IGumballMachine getHasCoinState() {
        return hasCoinState;
    }

    public IGumballMachine getSoldState() {
        return soldState;
    }
    
    
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
