package Tp1SimulacionBancaria;

public class Account {
    //Declaración e inicialización de variables
    protected float balance;
    protected int nOfConsignment = 0;
    protected int nOfWhitdrawals = 0;
    protected float annualRate;
    protected float monthlyCommission = 0;

    //Constructor de la cuenta, los atributos que no están inicializados se crean con un valor.
    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    //Método de consignación
    public void record(float amount){
        String response;
        if(amount > 0){
            balance += amount;
            nOfConsignment += 1;
            response = "Se ha consignado $" + amount + " en la cuenta.";
        } else {
            System.out.println("No es posible consignar saldos negativos en la cuenta");
        }
    }

    //Método de retiro
    public void whitdraw(float amount){
        String response;
        if(amount<= this.balance){
            this.balance -= amount;
            this.nOfWhitdrawals += 1;
            response = "Se ha debitado $" + amount + " de la cuenta";
        } else {
            response = "No es posible retirar $" + amount;
        }
        System.out.println(response);
    }

    //Método de interes mensual
    public void calculateInterest(){
        float interest;
        interest = this.balance * (annualRate / 12 / 100);
    }
    //Método de extracto mensual
    public void monthlyStatement(){
        balance -= monthlyCommission;
        calculateInterest();
    }

    //Método para imprimir
    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", nOfConsignment=" + nOfConsignment +
                ", nOfWhitdrawals=" + nOfWhitdrawals +
                ", annualRate=" + annualRate +
                ", monthlyCommission=" + monthlyCommission +
                '}';
    }

    public float getMonthlyCommission() {
        return monthlyCommission;
    }

    public void setMonthlyCommission(float monthlyCommission) {
        this.monthlyCommission = monthlyCommission;
    }

}
