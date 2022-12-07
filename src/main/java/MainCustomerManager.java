import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckManager;

import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class MainCustomerManager {
    public static void main(String[] args) throws Exception
    {
        BaseCustomerManager customerManagerNero = new NeroCustomerManager();
        customerManagerNero.Save(new Customer(101,"Mustafa","Demir", LocalDate.of(1999,1,19)));
        System.out.println();

        BaseCustomerManager customerManagerStarBucks = new StarbucksCustomerManager(new CustomerCheckManager(){});
        customerManagerStarBucks.Save(new Customer(102,"Ahmet","Parlak", LocalDate.of(1995,7,13)));
        System.out.println();




    }

}
