package Tp1SimulacionBancaria;

public class CurrentAccount extends Account{
    protected float overdraft = 0;

    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }

    @Override
    public void whitdraw(float amount) {
        if(amount <= this.balance){
            super.whitdraw(amount);
        } else {
            this.balance -= amount;
            overdraft += this.balance;
        }
    }

    @Override
    public void record(float amount) {
        if (overdraft == 0){
            super.record(amount);
        } else {
            overdraft -= amount;
            if (overdraft > 0) {
                balance += overdraft;
                overdraft = 0;
            }
        }
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
