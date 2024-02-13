public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    
    public Customer(){
        this("", "");
    }
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new Account[5];
    }
    
    public Account getAccount(int index){
        return acct[index];
    }
    
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount += 1;
    }
    
    public int getNumOfAccount(){
        return this.numOfAccount;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s\n%d", this.firstName, this.lastName, this.numOfAccount);
    }

    public boolean equals(Customer c){
        return this.firstName.equals(c.getFirstName()) && (this.lastName.equals(c.getLastName()));
    }

}
