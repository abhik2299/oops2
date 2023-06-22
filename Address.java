package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Address {
    public String name;
    public String address;
    public String city;
    public String state;

    public Address(String name, String address, String city, String state) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

class AddressBook{
    private List<Address> addressList;

    public AddressBook(){
        addressList = new ArrayList<>();
    }
    public void addDetails(Address address){
        addressList.add(address);
    }

    public List<Address> getAddressList(){
        return addressList;
    }

    public static void main(String[] args) {
        Address address1 = new Address("Abhishek","aashiana","Lucknow","UP");
        Address address12 = new Address("Anni","Gomti Nagar","Lucknow","UP");
        AddressBook addressBook = new AddressBook();
        addressBook.addDetails(address1);
        addressBook.addDetails(address12);
        List<Address> addressList1 = addressBook.getAddressList();
        System.out.print(addressList1);
    }
}
