public class CheckingAccount extends Account {
    private double credit;
    
    public CheckingAccount(){
        this(0.0, "", 0);
    }
    
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    
    public void setCredit(double credit){
        if(credit > 0){
            this.credit = credit;
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public double getCredit(){
        return this.credit;
    }
    
    @Override
    public void withdraw(double a){
        double money = this.getBalance() - a;
        if((a > 0) && (money > 0)){
            this.balance = money;
            System.out.println(String.format("%s baht is withdrawn from %s and your credit balance is %.1f.",a, this.name, this.credit));
        }else if((this.getBalance() - a + credit >= 0) && (money < 0)){
            this.balance = 0 - credit;
            System.out.println(String.format("%s baht is withdrawn from %s and your credit balance is %.1f.",a, this.name, this.credit));
        }else{
            System.out.println("Not enough money!");
        }
    }
    
    public void withdraw(int a){
        this.withdraw((double) a);
    }
    
    @Override
    public String toString(){
        return String.format("The %s account has %.1f baht and %.1f credits.", this.name, this.balance, this.credit);
    }

}
