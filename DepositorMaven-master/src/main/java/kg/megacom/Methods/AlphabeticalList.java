package kg.megacom.Methods;

import kg.megacom.Models.Depositor;

public class AlphabeticalList {
    private Depositor depositor;

    public AlphabeticalList(Depositor depositor) {
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
        return  "Фамилия: " + depositor.getLastName()+ "\n" +
                "Имя: " + depositor.getFirstName() + "\n"+
                "Отчество: " + depositor.getMiddleName() + "\n"+
                "-------------------------------" + "\n";
    }
}
