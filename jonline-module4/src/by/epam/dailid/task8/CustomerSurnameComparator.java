package by.epam.dailid.task8;

import java.util.Comparator;

public class CustomerSurnameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        String s1 = o1.getSurname();
        String s2 = o2.getSurname();

        return s1.compareTo(s2);
    }
}
