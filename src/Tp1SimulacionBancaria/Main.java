package Tp1SimulacionBancaria;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //---------------------------------Test account-----------------------------------
        // Crear una cuenta con saldo inicial de 1000 y tasa anual del 5%
        Account acountTester = new Account(1000, 5);

        // Establecer la comisión mensual en 10
        acountTester.setMonthlyCommission(10);

        // Realizar algunas operaciones en la cuenta
        acountTester.record(500);
        acountTester.whitdraw(200);
        acountTester.monthlyStatement();

        // Imprimir los detalles de la cuenta
        System.out.println(acountTester.toString());

        //----------------------------Test saving account-------------------------------
        SavingAccount savingAconuntTester = new SavingAccount(20000, 6);
        savingAconuntTester.setMonthlyCommission(40);
        System.out.println(savingAconuntTester.toString());

        //----------------------------Test current account------------------------------
        CurrentAccount currentAccountTester = new CurrentAccount(2000, 5);
        currentAccountTester.whitdraw(30000);
        System.out.println(currentAccountTester.toString());
    }
}