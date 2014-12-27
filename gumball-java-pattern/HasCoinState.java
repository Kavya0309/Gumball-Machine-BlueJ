

import java.util.Random;

public class HasCoinState implements IGumballMachine {
	GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("Quarter inserted");
		gumballMachine.sum+=25;
	}
 
	public void ejectCoin() {
		System.out.println("Coin returned");
		gumballMachine.sum=0;
		gumballMachine.setState(gumballMachine.getNoCoinState());
	}
	
	public void insertNickel(){
	    System.out.println("Nickel inserted");
	    gumballMachine.sum+=5;
	   }
	
	public void insertDime(){
	    System.out.println("Dime inserted");
	    gumballMachine.sum+=10;
	   }
 
	public void turnCrank() {
	    if(gumballMachine.sum<50)
	    {
	        System.out.println("Insufficient money..");
	        System.out.println("Total Amount:"+gumballMachine.sum);
	        System.out.println("You need"+" "+(50-gumballMachine.sum)+ " more cents to turn the crank!");
	       
	       }
	       
	       
	    else
	    {
	        
	        System.out.println("Crank turned");
	        gumballMachine.turnCrank=true;
	        
	        gumballMachine.numBalls=gumballMachine.numBalls+1;
	        gumballMachine.count = gumballMachine.count -1;
	        gumballMachine.sum=(gumballMachine.sum-50);
	        System.out.println("Gumball dispensed!");
	           
		    
	        if(gumballMachine.sum>0)
	        System.out.println("Change Returned:" +gumballMachine.sum);
	        gumballMachine.sum=0;
	        if(gumballMachine.sum<50 && gumballMachine.getCount()==0)
		    gumballMachine.setState(gumballMachine.getSoldState());
	}
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
		
		   if (gumballMachine.getCount() > 0 && gumballMachine.sum>=50) {
			gumballMachine.setState(gumballMachine.getHasCoinState());
		    } 
		    else if(gumballMachine.getCount()>0)
		      gumballMachine.setState(gumballMachine.getHasCoinState());
		    else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		    }
        }
        else
           System.out.println("Cannot dispense Gumball");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
