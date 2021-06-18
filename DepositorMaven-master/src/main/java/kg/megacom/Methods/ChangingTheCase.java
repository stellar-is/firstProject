package kg.megacom.Methods;

import kg.megacom.Models.Depositor;

public class ChangingTheCase {
    private Depositor depositor;

    public ChangingTheCase(Depositor depositor) {
        this.depositor = depositor;
    }

    public Depositor getDepositor() {
        return depositor;
    }

    public void setDepositor(Depositor depositor) {
        this.depositor = depositor;
    }

    @Override
    public String toString() {
        return "Замена регистра"+ "\n" +
                "Фамилия вкладчика: " + depositor.getLastName()+ "\n" +
                "Имя вкладчика: " + depositor.getFirstName()+ "\n" +
                "Отчество вкладчика: " + depositor.getMiddleName() +"\n" +
                "--------------------------------" + "\n";
    }
}
