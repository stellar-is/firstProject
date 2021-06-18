package kg.megacom.Methods;

import kg.megacom.Models.Depositor;

public class SurnamesAndInitials {
    private Depositor depositor;

    public SurnamesAndInitials(Depositor depositor) {
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
        return   "Фамилия и инициалы депозитора: " + depositor.getLastName() + " " + depositor.getFirstName() + ". " +
                 depositor.getMiddleName() + ". "+ "\n" +
                "--------------------------------"+ "\n";
    }
}
