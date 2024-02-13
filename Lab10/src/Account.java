public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    
    public void deposit(double a){
        if (a > 0){
            this.balance = balance + a;
            System.out.println(String.format("%.1f baht is deposited to %s.",a, this.name));
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public void withdraw(double a){
        if ((a > 0) && (this.getBalance() - a > 0)){
            this.balance = balance - a;
            System.out.println(String.format("%.1f baht is withdrawn from %s.",a, this.name));
        }else if (a < 0){
            System.out.println("Input number must be a positive integer.");
        }else if (this.getBalance() - a < 0){
            System.out.println("Not enough money!");
        }
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void showAccount(){
        System.out.println(this.name + " account has " + this.balance + " baht.");
    }

}
