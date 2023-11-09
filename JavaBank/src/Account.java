
public class Account implements InterfaceBankAccount {

	// class variables
		String accountName;
	    int accountNum;
	    int balance;
	    
	    //default constructor for Account
	    Account()
	    {
	    	this.accountName="EMPTY";
	    	this.accountNum=0;
	    	this.balance=0;
	    }
	    
	    //overloaded constructor for Account
	    Account(String name, int num,int amt)
	    {
	            accountName=name;
	    	    accountNum=num;
	            balance=amt;
	    }
	    //make a deposit to the balance
                @Override
	    public void deposit(int amt)
	    {
	    	    balance=balance+amt;
	    }
	    //make a withdrawal from the balance
                @Override
	    public void withdraw(int amt)
	    {
	    	    balance=balance-amt;
	    }
	    //modifier to set the accountname
	    public void setaccountname(String name)
	    {
	    	    accountName = name;
	    }
	  //modifier to set the accountnumber
	    public void setaccountnum(int num)
	    {
	    	    accountNum = num;
	    }
	  //modifier to set the balance
	    public void setbalance(int num)
	    {
	    	    balance = num;
	    }
	  //accessor to get the accountname
	    public String getAccountName ( ) {
	    	 
	    	return accountName;
	    }
	    
	  //accessor to get the accountnumber
	    public int getAccountNum ( ) {
	   	 
	    	return accountNum;
	    }
	  //accessor to get the account balance
	    public int getBalance ( ) {
	      	 
	    	return balance;
	    }
	    
	    //print method 
	    public void print() {
	        System.out.println("\nBank Name : " + getBankName() +
                                    "\nAccount Holder : " + accountName +
                                    "\nAccount Number : " + accountNum +
                                    "\nAccount balance: " + balance);
	      }



    @Override
    public String getBankName() {
        return InterfaceBankAccount.BANK;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	}
