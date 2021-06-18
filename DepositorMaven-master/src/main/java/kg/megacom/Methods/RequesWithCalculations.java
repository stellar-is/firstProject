package kg.megacom.Methods;

import kg.megacom.Models.Depositor;
import kg.megacom.Models.Operation;

public class RequesWithCalculations {
        private Depositor depositor;
        private Operation operation;

    public RequesWithCalculations(Depositor depositor, Operation operation) {
        this.depositor = depositor;
        this.operation = operation;
    }

    public Depositor getDepositor() {
        return depositor;
    }

    public void setDepositor(Depositor depositor) {
        this.depositor = depositor;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return  "Фамилия: " + depositor.getLastName()+ "\n" +
                "Имя: " + depositor.getFirstName() + "\n"+
                "Отчество: " + depositor.getMiddleName() + "\n" +
                "Операция: " + operation.getDepositSum() +  "\n" +
                "----------------------------------" +"\n";
    }
}
