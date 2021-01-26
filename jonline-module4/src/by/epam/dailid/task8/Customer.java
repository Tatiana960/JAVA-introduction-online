package by.epam.dailid.task8;

import java.util.Objects;

public class Customer implements Comparable<Customer> {

    private int id;
    private String surname;
    private String name;
    private String address;
    private int cardNumber;
    private int bankAccountNumber;

    public Customer(int id, String surname, String name, String address, int cardNumber, int bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                +'}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getId() == customer.getId() &&
                getCardNumber() == customer.getCardNumber() &&
                getBankAccountNumber() == customer.getBankAccountNumber() &&
                getSurname().equals(customer.getSurname()) &&
                name.equals(customer.name) &&
                getAddress().equals(customer.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSurname(), name, getAddress(), getCardNumber(), getBankAccountNumber());
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }
}
