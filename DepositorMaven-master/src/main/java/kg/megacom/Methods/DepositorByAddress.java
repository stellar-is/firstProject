package kg.megacom.Methods;

import kg.megacom.Models.Depositor;
import kg.megacom.Models.Street;

public class DepositorByAddress {
    private Depositor depositor;
    private Street street;

    public DepositorByAddress(Depositor depositor, Street street) {
        this.depositor = depositor;
        this.street = street;
    }

    public Depositor getDepositor() {
        return depositor;
    }

    public void setDepositor(Depositor depositor) {
        this.depositor = depositor;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return  "Фамилия: " + depositor.getLastName()+ "\n" +
                "Имя: " + depositor.getFirstName() + "\n"+
                "Отчество: " + depositor.getMiddleName() + "\n" +
                "Улица: " + street.getName() + "\n" +
                "----------------------------" + "\n" ;
    }
}
