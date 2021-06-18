package kg.megacom;

import kg.megacom.Database.DbWork;
import kg.megacom.Methods.AlphabeticalList;
import kg.megacom.Methods.DepositorInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите действие: " + "\n" +
                    "0. Выход" + "\n" +
                    "1. Список вкладчиков" + "\n" +
                    "2. Список вкладчиков по величине вклада" + "\n" +
                    "3. Список вкладчиков по определенному адресу" + "\n" +
                    "4. Алфавитный список вкладчиков" + "\n" +
                    "5. Запрос с расчетами" + "\n" +
                    "6. Запрос с параметрами" + "\n" +
                    "7. Фамилии и инициалы" + "\n" +
                    "8. Изменение регистра" + "\n" +
                    "9. Минимальная сумма взноса" + "\n" +
                    "10. Средняя сумма взноса" + "\n" +
                    "11. Количество взносов" + "\n"+
                    "12. Добавить нового вклвдчика");
            DbWork dbWork = new DbWork();
            DepositorInfo depositorInfo = new DepositorInfo();
            double res = 0;
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i == 1) {
                dbWork.selectAllDepositor();
            } else if (i == 2) {
                System.out.println(dbWork.selectAllAmountOfDeposit());
            } else if (i == 3) {
                System.out.println(dbWork.selectAddresses());
            } else if (i == 4) {
                System.out.println(dbWork.selectAlphabetically());
            } else if (i == 5) {
                System.out.println(dbWork.selectRequesWithCalculations());
            } else if (i == 6) {
                System.out.println(dbWork.selectRequestWithParameters());
            } else if (i == 7) {
                System.out.println(dbWork.selectInitials());
            } else if (i == 8) {
                System.out.println(dbWork.changeRegistr());
            } else if (i == 9) {
                System.out.println(dbWork.MinSum(res));
            } else if (i == 10) {
                System.out.println(dbWork.AvgSum(res));
            } else if (i == 11) {
                System.out.println(dbWork.countOfDep());
            }else if (i == 12) {
               dbWork.addNewDepositor(depositorInfo);
            }else if (i == 0) {
                System.out.println("Досвидания!");
                break;
            }else{
                System.out.println("Вы ввели неправильную команду!Повторите еще раз!");
            }
        }
    }
}