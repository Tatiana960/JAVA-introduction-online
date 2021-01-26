package by.epam.dailid.task8 ;

import by.epam.dailid.task8.Customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerCreditCardNumberComparator  {

    public List<Customer> CustomerCreditCardCheck(List<Customer> group){


        List<Customer> groupByCardNumber= new ArrayList<Customer>();

        for (Customer cust: group){
            if(cust.getCardNumber()>1000000000 && cust.getCardNumber()<2000000000){
                groupByCardNumber.add(cust);
            }
        }
return groupByCardNumber;
    }


}
