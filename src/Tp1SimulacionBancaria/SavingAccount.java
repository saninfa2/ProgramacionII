package Tp1SimulacionBancaria;

public class SavingAccount extends Account{
    protected boolean active = false;

    //Constructor
    public SavingAccount(float balance, float annualRate) {
        super(balance, annualRate);
        if(balance >= 10000){
            this.active = true;
        }
    }

    //Super métodos
    @Override
    public void whitdraw(float amount) {
        if(active){
            super.record(amount);
        } else {
            System.out.println("No es posible retirar dinero de una cuenta inactiva");
        }
    }

    @Override
    public void record(float amount) {
        if(active){
            super.record(amount);
        } else {
            System.out.println("No es posible consignar dinero");
        }

    }

    @Override
    public void monthlyStatement() {
        if(nOfConsignment > 4) {
            monthlyCommission += (nOfWhitdrawals - 4) * 1000;
        }
        active = balance >= 1000;
        super.monthlyStatement();
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "active=" + active +
                '}';
    }
}
