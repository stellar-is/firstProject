package kg.megacom.Database;

import kg.megacom.Methods.*;
import kg.megacom.Models.*;

import java.sql.Connection;
import java.util.ArrayList;

public interface DbworkInterface {

    Connection getConnection();

    ArrayList<DepositorInfo> selectAllDepositor ();
    ArrayList<Deposit> selectAllDeposit();
    ArrayList<AmountOfDeposit> selectAllAmountOfDeposit();
    ArrayList<DepositorByAddress> selectAddresses();
    ArrayList<AlphabeticalList> selectAlphabetically();
    ArrayList<RequesWithCalculations> selectRequesWithCalculations();
    ArrayList<StateRequest> selectRequestWithParameters();
    ArrayList<SurnamesAndInitials> selectInitials ();
    ArrayList<ChangingTheCase> changeRegistr();
    double MinSum(Double d);
    double MaxSum(Double d);
    double AvgSum(Double d);
    boolean addNewDepositor(DepositorInfo depositorInfo);
    public ArrayList<CountOfDeposit> countOfDep();

}
